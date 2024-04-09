package ma.zs.univ.service.impl.admin.lotissement;


import ma.zs.univ.bean.core.lotissement.TaxeLotissement;
import ma.zs.univ.dao.criteria.core.lotissement.TaxeLotissementCriteria;
import ma.zs.univ.dao.facade.core.lotissement.TaxeLotissementDao;
import ma.zs.univ.dao.specification.core.lotissement.TaxeLotissementSpecification;
import ma.zs.univ.service.facade.admin.lotissement.TaxeLotissementAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.univ.service.facade.admin.commun.RedevableAdminService ;
import ma.zs.univ.bean.core.commun.Redevable ;

import java.util.List;
@Service
public class TaxeLotissementAdminServiceImpl extends AbstractServiceImpl<TaxeLotissement, TaxeLotissementCriteria, TaxeLotissementDao> implements TaxeLotissementAdminService {






    public void findOrSaveAssociatedObject(TaxeLotissement t){
        if( t != null) {
            t.setRedevable(redevableService.findOrSave(t.getRedevable()));
        }
    }

    public List<TaxeLotissement> findByRedevableId(Long id){
        return dao.findByRedevableId(id);
    }
    public int deleteByRedevableId(Long id){
        return dao.deleteByRedevableId(id);
    }
    public long countByRedevableId(Long id){
        return dao.countByRedevableId(id);
    }






    public void configure() {
        super.configure(TaxeLotissement.class, TaxeLotissementSpecification.class);
    }


    @Autowired
    private RedevableAdminService redevableService ;

    public TaxeLotissementAdminServiceImpl(TaxeLotissementDao dao) {
        super(dao);
    }

}
