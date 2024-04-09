package ma.zs.univ.dao.facade.core.employe;

import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.employe.EmployeSalaireHistory;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EmployeSalaireHistoryDao extends AbstractRepository<EmployeSalaireHistory,Long>  {

    List<EmployeSalaireHistory> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteId(Long id);
    List<EmployeSalaireHistory> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    long countByEmployeId(Long id);


}
