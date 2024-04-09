package ma.zs.univ.dao.facade.core.employe;

import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.employe.Employe;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EmployeDao extends AbstractRepository<Employe,Long>  {

    List<Employe> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteId(Long id);


}
