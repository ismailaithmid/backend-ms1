package ma.zs.univ.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.commun.Redevable;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface RedevableDao extends AbstractRepository<Redevable,Long>  {


    @Query("SELECT NEW Redevable(item.id,item.cin) FROM Redevable item")
    List<Redevable> findAllOptimized();

}
