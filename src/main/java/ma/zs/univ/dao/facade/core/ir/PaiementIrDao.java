package ma.zs.univ.dao.facade.core.ir;

import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.ir.PaiementIr;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PaiementIrDao extends AbstractRepository<PaiementIr,Long>  {

    List<PaiementIr> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteId(Long id);


}
