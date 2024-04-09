package  ma.zs.univ.dao.specification.core.employe;

import ma.zs.univ.dao.criteria.core.employe.EmployeCriteria;
import ma.zs.univ.bean.core.employe.Employe;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class EmployeSpecification extends  AbstractSpecification<EmployeCriteria, Employe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("firstname", criteria.getFirstname(),criteria.getFirstnameLike());
        addPredicate("lastname", criteria.getLastname(),criteria.getLastnameLike());
        addPredicateFk("societe","id", criteria.getSociete()==null?null:criteria.getSociete().getId());
        addPredicateFk("societe","id", criteria.getSocietes());
    }

    public EmployeSpecification(EmployeCriteria criteria) {
        super(criteria);
    }

    public EmployeSpecification(EmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
