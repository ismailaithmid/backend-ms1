package ma.zs.univ.service.impl.admin.employe;


import ma.zs.univ.bean.core.employe.EmployeSalaireHistory;
import ma.zs.univ.dao.criteria.core.employe.EmployeSalaireHistoryCriteria;
import ma.zs.univ.dao.facade.core.employe.EmployeSalaireHistoryDao;
import ma.zs.univ.dao.specification.core.employe.EmployeSalaireHistorySpecification;
import ma.zs.univ.service.facade.admin.employe.EmployeSalaireHistoryAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.univ.service.facade.admin.avancement.SocieteAdminService ;
import ma.zs.univ.bean.core.avancement.Societe ;
import ma.zs.univ.service.facade.admin.employe.EmployeAdminService ;
import ma.zs.univ.bean.core.employe.Employe ;

import java.util.List;
@Service
public class EmployeSalaireHistoryAdminServiceImpl extends AbstractServiceImpl<EmployeSalaireHistory, EmployeSalaireHistoryCriteria, EmployeSalaireHistoryDao> implements EmployeSalaireHistoryAdminService {






    public void findOrSaveAssociatedObject(EmployeSalaireHistory t){
        if( t != null) {
            t.setSociete(societeService.findOrSave(t.getSociete()));
            t.setEmploye(employeService.findOrSave(t.getEmploye()));
        }
    }

    public List<EmployeSalaireHistory> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }
    public long countBySocieteId(Long id){
        return dao.countBySocieteId(id);
    }
    public List<EmployeSalaireHistory> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public long countByEmployeId(Long id){
        return dao.countByEmployeId(id);
    }






    public void configure() {
        super.configure(EmployeSalaireHistory.class, EmployeSalaireHistorySpecification.class);
    }


    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private EmployeAdminService employeService ;

    public EmployeSalaireHistoryAdminServiceImpl(EmployeSalaireHistoryDao dao) {
        super(dao);
    }

}
