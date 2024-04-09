package ma.zs.univ.dao.facade.core.ir;

import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.ir.PaiementIrDetail;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PaiementIrDetailDao extends AbstractRepository<PaiementIrDetail,Long>  {

    List<PaiementIrDetail> findByPaiementIrId(Long id);
    int deleteByPaiementIrId(Long id);
    long countByPaiementIrId(Long id);
    List<PaiementIrDetail> findByTauxIrId(Long id);
    int deleteByTauxIrId(Long id);
    long countByTauxIrId(Long id);
    List<PaiementIrDetail> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    long countByEmployeId(Long id);


}
