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
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TauxIrAdminServiceImpl extends AbstractServiceImpl<TauxIr, TauxIrCriteria, TauxIrDao> implements TauxIrAdminService {





    @Override
    public TauxIr findByDateAndSalaire(int month, int year, BigDecimal salaire) {
        LocalDateTime dateMin = LocalDateTime.of(year, month, 1, 0, 0); // Start of the month
        LocalDateTime dateMax = dateMin.plusMonths(1).minusSeconds(1); // End of the month

        List<TauxIr> tauxIrList = dao.findByDateRangeAndSalaireRange(dateMin, dateMax, salaire);


        if (!tauxIrList.isEmpty()) {
            return tauxIrList.get(0);
        } else {
            return null;
        }
    }


    public void configure() {
        super.configure(TauxIr.class, TauxIrSpecification.class);
    }



    public TauxIrAdminServiceImpl(TauxIrDao dao) {
        super(dao);
    }

}
