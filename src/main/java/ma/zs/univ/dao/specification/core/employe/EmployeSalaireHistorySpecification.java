package  ma.zs.univ.dao.specification.core.employe;

import ma.zs.univ.dao.criteria.core.employe.EmployeSalaireHistoryCriteria;
import ma.zs.univ.bean.core.employe.EmployeSalaireHistory;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class EmployeSalaireHistorySpecification extends  AbstractSpecification<EmployeSalaireHistoryCriteria, EmployeSalaireHistory>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("moisdepart", criteria.getMoisdepart(), criteria.getMoisdepartMin(), criteria.getMoisdepartMax());
        addPredicateInt("moisFin", criteria.getMoisFin(), criteria.getMoisFinMin(), criteria.getMoisFinMax());
        addPredicateInt("anneeDepart", criteria.getAnneeDepart(), criteria.getAnneeDepartMin(), criteria.getAnneeDepartMax());
        addPredicateInt("anneeFin", criteria.getAnneeFin(), criteria.getAnneeFinMin(), criteria.getAnneeFinMax());
        addPredicateBigDecimal("salaireBrute", criteria.getSalaireBrute(), criteria.getSalaireBruteMin(), criteria.getSalaireBruteMax());
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicateFk("societe","id", criteria.getSociete()==null?null:criteria.getSociete().getId());
        addPredicateFk("societe","id", criteria.getSocietes());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
    }

    public EmployeSalaireHistorySpecification(EmployeSalaireHistoryCriteria criteria) {
        super(criteria);
    }

    public EmployeSalaireHistorySpecification(EmployeSalaireHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
