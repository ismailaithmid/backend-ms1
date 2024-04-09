package ma.zs.univ.dao.facade.core.commun;

import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.commun.Locale;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface LocaleDao extends AbstractRepository<Locale,Long>  {

    List<Locale> findByRedevableId(Long id);
    int deleteByRedevableId(Long id);
    long countByRedevableId(Long id);


}
