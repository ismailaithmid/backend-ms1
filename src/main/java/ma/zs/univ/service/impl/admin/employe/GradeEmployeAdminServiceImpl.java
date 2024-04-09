package ma.zs.univ.service.impl.admin.employe;


import ma.zs.univ.bean.core.employe.GradeEmploye;
import ma.zs.univ.dao.criteria.core.employe.GradeEmployeCriteria;
import ma.zs.univ.dao.facade.core.employe.GradeEmployeDao;
import ma.zs.univ.dao.specification.core.employe.GradeEmployeSpecification;
import ma.zs.univ.service.facade.admin.employe.GradeEmployeAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class GradeEmployeAdminServiceImpl extends AbstractServiceImpl<GradeEmploye, GradeEmployeCriteria, GradeEmployeDao> implements GradeEmployeAdminService {













    public void configure() {
        super.configure(GradeEmploye.class, GradeEmployeSpecification.class);
    }



    public GradeEmployeAdminServiceImpl(GradeEmployeDao dao) {
        super(dao);
    }

}
