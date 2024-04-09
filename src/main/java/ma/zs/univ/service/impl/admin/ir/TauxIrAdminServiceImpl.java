package ma.zs.univ.service.impl.admin.ir;


import ma.zs.univ.bean.core.ir.TauxIr;
import ma.zs.univ.dao.criteria.core.ir.TauxIrCriteria;
import ma.zs.univ.dao.facade.core.ir.TauxIrDao;
import ma.zs.univ.dao.specification.core.ir.TauxIrSpecification;
import ma.zs.univ.service.facade.admin.ir.TauxIrAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TauxIrAdminServiceImpl extends AbstractServiceImpl<TauxIr, TauxIrCriteria, TauxIrDao> implements TauxIrAdminService {













    public void configure() {
        super.configure(TauxIr.class, TauxIrSpecification.class);
    }



    public TauxIrAdminServiceImpl(TauxIrDao dao) {
        super(dao);
    }

}
