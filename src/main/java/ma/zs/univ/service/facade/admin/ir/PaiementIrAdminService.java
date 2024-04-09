package ma.zs.univ.service.facade.admin.ir;

import java.util.List;
import ma.zs.univ.bean.core.ir.PaiementIr;
import ma.zs.univ.dao.criteria.core.ir.PaiementIrCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface PaiementIrAdminService extends  IService<PaiementIr,PaiementIrCriteria>  {

    List<PaiementIr> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteId(Long id);




}
