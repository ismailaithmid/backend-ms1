package ma.zs.univ.service.impl.admin.employe;


import ma.zs.univ.bean.core.employe.Employe;
import ma.zs.univ.dao.criteria.core.employe.EmployeCriteria;
import ma.zs.univ.dao.facade.core.employe.EmployeDao;
import ma.zs.univ.dao.specification.core.employe.EmployeSpecification;
import ma.zs.univ.service.facade.admin.employe.EmployeAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.univ.service.facade.admin.avancement.SocieteAdminService ;
import ma.zs.univ.bean.core.avancement.Societe ;

import java.util.List;
@Service
public class EmployeAdminServiceImpl extends AbstractServiceImpl<Employe, EmployeCriteria, EmployeDao> implements EmployeAdminService {






    public void findOrSaveAssociatedObject(Employe t){
        if( t != null) {
            t.setSociete(societeService.findOrSave(t.getSociete()));
        }
    }

    public List<Employe> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }
    public long countBySocieteId(Long id){
        return dao.countBySocieteId(id);
    }






    public void configure() {
        super.configure(Employe.class, EmployeSpecification.class);
    }


    @Autowired
    private SocieteAdminService societeService ;

    public EmployeAdminServiceImpl(EmployeDao dao) {
        super(dao);
    }

}
