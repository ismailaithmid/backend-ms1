package ma.zs.univ.service.impl.admin.lotissement;


import ma.zs.univ.bean.core.lotissement.TauxTaxeLotissement;
import ma.zs.univ.dao.criteria.core.lotissement.TauxTaxeLotissementCriteria;
import ma.zs.univ.dao.facade.core.lotissement.TauxTaxeLotissementDao;
import ma.zs.univ.dao.specification.core.lotissement.TauxTaxeLotissementSpecification;
import ma.zs.univ.service.facade.admin.lotissement.TauxTaxeLotissementAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TauxTaxeLotissementAdminServiceImpl extends AbstractServiceImpl<TauxTaxeLotissement, TauxTaxeLotissementCriteria, TauxTaxeLotissementDao> implements TauxTaxeLotissementAdminService {













    public void configure() {
        super.configure(TauxTaxeLotissement.class, TauxTaxeLotissementSpecification.class);
    }



    public TauxTaxeLotissementAdminServiceImpl(TauxTaxeLotissementDao dao) {
        super(dao);
    }

}
