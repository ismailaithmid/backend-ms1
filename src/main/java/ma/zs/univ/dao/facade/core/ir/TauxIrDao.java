package ma.zs.univ.dao.facade.core.ir;

import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.ir.TauxIr;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface TauxIrDao extends AbstractRepository<TauxIr,Long>  {



    @Query("SELECT t FROM TauxIr t WHERE t.dateMax >= :date AND t.dateMin <= :date AND t.salaireMin <= :salaire AND t.salaireMax >= :salaire")
    List<TauxIr> findByDateRangeAndSalaireRange(
        @Param("date") LocalDateTime date,
        @Param("salaire") BigDecimal salaire
    );
}
