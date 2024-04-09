package ma.zs.univ.service.facade.admin.ir;

import java.util.List;
import ma.zs.univ.bean.core.ir.PaiementIrDetail;
import ma.zs.univ.dao.criteria.core.ir.PaiementIrDetailCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface PaiementIrDetailAdminService extends  IService<PaiementIrDetail,PaiementIrDetailCriteria>  {

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
