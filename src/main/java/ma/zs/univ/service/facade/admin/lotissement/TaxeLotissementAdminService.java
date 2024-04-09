package ma.zs.univ.service.facade.admin.lotissement;

import java.util.List;
import ma.zs.univ.bean.core.lotissement.TaxeLotissement;
import ma.zs.univ.dao.criteria.core.lotissement.TaxeLotissementCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface TaxeLotissementAdminService extends  IService<TaxeLotissement,TaxeLotissementCriteria>  {

    List<TaxeLotissement> findByRedevableId(Long id);
    int deleteByRedevableId(Long id);
    long countByRedevableId(Long id);




}
