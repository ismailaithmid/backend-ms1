package ma.zs.univ.service.impl.admin.ir;


import ma.zs.univ.bean.core.ir.PaiementIrDetail;
import ma.zs.univ.dao.criteria.core.ir.PaiementIrDetailCriteria;
import ma.zs.univ.dao.facade.core.ir.PaiementIrDetailDao;
import ma.zs.univ.dao.specification.core.ir.PaiementIrDetailSpecification;
import ma.zs.univ.service.facade.admin.ir.PaiementIrDetailAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.univ.service.facade.admin.ir.PaiementIrAdminService ;
import ma.zs.univ.bean.core.ir.PaiementIr ;
import ma.zs.univ.service.facade.admin.ir.TauxIrAdminService ;
import ma.zs.univ.bean.core.ir.TauxIr ;
import ma.zs.univ.service.facade.admin.employe.EmployeAdminService ;
import ma.zs.univ.bean.core.employe.Employe ;

import java.util.List;
@Service
public class PaiementIrDetailAdminServiceImpl extends AbstractServiceImpl<PaiementIrDetail, PaiementIrDetailCriteria, PaiementIrDetailDao> implements PaiementIrDetailAdminService {






    public void findOrSaveAssociatedObject(PaiementIrDetail t){
        if( t != null) {
            t.setPaiementIr(paiementIrService.findOrSave(t.getPaiementIr()));
            t.setTauxIr(tauxIrService.findOrSave(t.getTauxIr()));
            t.setEmploye(employeService.findOrSave(t.getEmploye()));
        }
    }

    public List<PaiementIrDetail> findByPaiementIrId(Long id){
        return dao.findByPaiementIrId(id);
    }
    public int deleteByPaiementIrId(Long id){
        return dao.deleteByPaiementIrId(id);
    }
    public long countByPaiementIrId(Long id){
        return dao.countByPaiementIrId(id);
    }
    public List<PaiementIrDetail> findByTauxIrId(Long id){
        return dao.findByTauxIrId(id);
    }
    public int deleteByTauxIrId(Long id){
        return dao.deleteByTauxIrId(id);
    }
    public long countByTauxIrId(Long id){
        return dao.countByTauxIrId(id);
    }
    public List<PaiementIrDetail> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public long countByEmployeId(Long id){
        return dao.countByEmployeId(id);
    }






    public void configure() {
        super.configure(PaiementIrDetail.class, PaiementIrDetailSpecification.class);
    }


    @Autowired
    private PaiementIrAdminService paiementIrService ;
    @Autowired
    private TauxIrAdminService tauxIrService ;
    @Autowired
    private EmployeAdminService employeService ;

    public PaiementIrDetailAdminServiceImpl(PaiementIrDetailDao dao) {
        super(dao);
    }

}
