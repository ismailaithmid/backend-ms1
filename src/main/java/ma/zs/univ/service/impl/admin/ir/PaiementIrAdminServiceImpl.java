package ma.zs.univ.service.impl.admin.ir;


import ma.zs.univ.bean.core.ir.PaiementIr;
import ma.zs.univ.dao.criteria.core.ir.PaiementIrCriteria;
import ma.zs.univ.dao.facade.core.ir.PaiementIrDao;
import ma.zs.univ.dao.specification.core.ir.PaiementIrSpecification;
import ma.zs.univ.service.facade.admin.ir.PaiementIrAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.zs.univ.service.facade.admin.avancement.SocieteAdminService ;
import ma.zs.univ.bean.core.avancement.Societe ;
import ma.zs.univ.service.facade.admin.ir.PaiementIrDetailAdminService ;
import ma.zs.univ.bean.core.ir.PaiementIrDetail ;
import ma.zs.univ.service.facade.admin.employe.EmployeAdminService;
import ma.zs.univ.service.facade.admin.employe.EmployeSalaireHistoryAdminService;
import ma.zs.univ.bean.core.avancement.Societe ;
import ma.zs.univ.bean.core.employe.Employe;
import ma.zs.univ.bean.core.employe.EmployeSalaireHistory;
import ma.zs.univ.service.facade.admin.ir.PaiementIrDetailAdminService ;
import ma.zs.univ.service.facade.admin.ir.TauxIrAdminService;
import ma.zs.univ.bean.core.ir.PaiementIrDetail ;
import ma.zs.univ.bean.core.ir.TauxIr;

import java.util.List;
@Service
public class PaiementIrAdminServiceImpl extends AbstractServiceImpl<PaiementIr, PaiementIrCriteria, PaiementIrDao> implements PaiementIrAdminService {


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public PaiementIr create(PaiementIr t) {
        // me
        Societe s = t.getSociete();
        Integer month = t.getMonth();
        Integer year = t.getYear();
        BigDecimal totalCotisationPatronal = t.getTotalCotisationPatronal();
        BigDecimal totalCotisationSalarial = t.getTotalCotisationSalarial();
        List<Employe> employes = employeAdminService.findBySocieteId(s.getId());
        for(Employe emp: employes){
            List<EmployeSalaireHistory> historySalire = employeSalaireHistoryAdminService.findByEmployeId(emp.getId());
            BigDecimal salaire = historySalire.stream()
            .filter(e -> year >= e.getAnneeDepart() && year <= e.getAnneeFin() &&
                         month >= e.getMoisdepart() && month <= e.getMoisFin())
            .findFirst()
            .map(EmployeSalaireHistory::getSalaireBrute)
            .orElse(BigDecimal.ZERO);            
            BigDecimal tauxIr = tauxIrAdminService.findByDateAndSalaire(month,year,salaire).getPourcentage();
            PaiementIrDetail pd = new PaiementIrDetail();
            BigDecimal cotisationSalarial = tauxIr.multiply(BigDecimal.valueOf(0.6));
            BigDecimal cotisationPatronal = tauxIr.multiply(BigDecimal.valueOf(0.4));
            totalCotisationPatronal = totalCotisationPatronal.add(cotisationPatronal);
            totalCotisationSalarial = totalCotisationSalarial.add(cotisationSalarial);
            pd.setEmploye(emp);
            pd.setPaiementIr(t);
            pd.setSalaireBrute(salaire);
            pd.setSalaireNet(salaire.subtract(cotisationSalarial));
            pd.setCotisationpatronel(cotisationPatronal);
            pd.setCotoisationsalarial(cotisationSalarial);
            paiementIrDetailService.create(pd);

        }
        t.setTotalCotisationPatronal(totalCotisationPatronal);
        t.setTotalCotisationSalarial(totalCotisationSalarial);
        PaiementIr saved= super.create(t);
        if (saved != null && t.getPaiementIrDetails() != null) {
                t.getPaiementIrDetails().forEach(element-> {
                element.setPaiementIr(saved);
                paiementIrDetailService.create(element);
            });
        }
        return saved;

    }

    public PaiementIr findWithAssociatedLists(Long id){
        PaiementIr result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setPaiementIrDetails(paiementIrDetailService.findByPaiementIrId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        paiementIrDetailService.deleteByPaiementIrId(id);
    }


    public void updateWithAssociatedLists(PaiementIr paiementIr){
    if(paiementIr !=null && paiementIr.getId() != null){
            List<List<PaiementIrDetail>> resultPaiementIrDetails= paiementIrDetailService.getToBeSavedAndToBeDeleted(paiementIrDetailService.findByPaiementIrId(paiementIr.getId()),paiementIr.getPaiementIrDetails());
            paiementIrDetailService.delete(resultPaiementIrDetails.get(1));
            ListUtil.emptyIfNull(resultPaiementIrDetails.get(0)).forEach(e -> e.setPaiementIr(paiementIr));
            paiementIrDetailService.update(resultPaiementIrDetails.get(0),true);
        }
    }




    public void findOrSaveAssociatedObject(PaiementIr t){
        if( t != null) {
            t.setSociete(societeService.findOrSave(t.getSociete()));
        }
    }

    public List<PaiementIr> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }
    public long countBySocieteId(Long id){
        return dao.countBySocieteId(id);
    }






    public void configure() {
        super.configure(PaiementIr.class, PaiementIrSpecification.class);
    }


    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private PaiementIrDetailAdminService paiementIrDetailService ;
    @Autowired
    private EmployeAdminService employeAdminService ;
    @Autowired
    private TauxIrAdminService tauxIrAdminService ;

    @Autowired
    private EmployeSalaireHistoryAdminService employeSalaireHistoryAdminService;

    public PaiementIrAdminServiceImpl(PaiementIrDao dao) {
        super(dao);
    }

}
