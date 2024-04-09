package ma.zs.univ.service.impl.admin.commun;


import ma.zs.univ.bean.core.commun.Redevable;
import ma.zs.univ.dao.criteria.core.commun.RedevableCriteria;
import ma.zs.univ.dao.facade.core.commun.RedevableDao;
import ma.zs.univ.dao.specification.core.commun.RedevableSpecification;
import ma.zs.univ.service.facade.admin.commun.RedevableAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class RedevableAdminServiceImpl extends AbstractServiceImpl<Redevable, RedevableCriteria, RedevableDao> implements RedevableAdminService {








    public List<Redevable> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(Redevable.class, RedevableSpecification.class);
    }



    public RedevableAdminServiceImpl(RedevableDao dao) {
        super(dao);
    }

}
