package ma.zs.univ.service.facade.admin.employe;

import java.util.List;
import ma.zs.univ.bean.core.employe.EmployeSalaireHistory;
import ma.zs.univ.dao.criteria.core.employe.EmployeSalaireHistoryCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface EmployeSalaireHistoryAdminService extends  IService<EmployeSalaireHistory,EmployeSalaireHistoryCriteria>  {

    List<EmployeSalaireHistory> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteId(Long id);
    List<EmployeSalaireHistory> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    long countByEmployeId(Long id);




}
