package ma.zs.univ.service.facade.admin.employe;

import java.util.List;
import ma.zs.univ.bean.core.employe.Employe;
import ma.zs.univ.dao.criteria.core.employe.EmployeCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface EmployeAdminService extends  IService<Employe,EmployeCriteria>  {

    List<Employe> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteId(Long id);




}
