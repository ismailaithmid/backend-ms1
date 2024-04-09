package ma.zs.univ.dao.facade.core.lotissement;

import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.lotissement.TaxeLotissement;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TaxeLotissementDao extends AbstractRepository<TaxeLotissement,Long>  {

    List<TaxeLotissement> findByRedevableId(Long id);
    int deleteByRedevableId(Long id);
    long countByRedevableId(Long id);


}
