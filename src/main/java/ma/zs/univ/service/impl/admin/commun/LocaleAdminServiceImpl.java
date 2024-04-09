package ma.zs.univ.service.impl.admin.commun;


import ma.zs.univ.bean.core.commun.Locale;
import ma.zs.univ.dao.criteria.core.commun.LocaleCriteria;
import ma.zs.univ.dao.facade.core.commun.LocaleDao;
import ma.zs.univ.dao.specification.core.commun.LocaleSpecification;
import ma.zs.univ.service.facade.admin.commun.LocaleAdminService;
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
public class LocaleAdminServiceImpl extends AbstractServiceImpl<Locale, LocaleCriteria, LocaleDao> implements LocaleAdminService {






    public void findOrSaveAssociatedObject(Locale t){
        if( t != null) {
            t.setRedevable(redevableService.findOrSave(t.getRedevable()));
        }
    }

    public List<Locale> findByRedevableId(Long id){
        return dao.findByRedevableId(id);
    }
    public int deleteByRedevableId(Long id){
        return dao.deleteByRedevableId(id);
    }
    public long countByRedevableId(Long id){
        return dao.countByRedevableId(id);
    }






    public void configure() {
        super.configure(Locale.class, LocaleSpecification.class);
    }


    @Autowired
    private RedevableAdminService redevableService ;

    public LocaleAdminServiceImpl(LocaleDao dao) {
        super(dao);
    }

}
