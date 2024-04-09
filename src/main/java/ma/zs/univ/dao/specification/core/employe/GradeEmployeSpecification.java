package  ma.zs.univ.dao.specification.core.employe;

import ma.zs.univ.dao.criteria.core.employe.GradeEmployeCriteria;
import ma.zs.univ.bean.core.employe.GradeEmploye;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class GradeEmployeSpecification extends  AbstractSpecification<GradeEmployeCriteria, GradeEmploye>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public GradeEmployeSpecification(GradeEmployeCriteria criteria) {
        super(criteria);
    }

    public GradeEmployeSpecification(GradeEmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
