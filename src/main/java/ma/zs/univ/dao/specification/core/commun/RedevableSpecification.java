package  ma.zs.univ.dao.specification.core.commun;

import ma.zs.univ.dao.criteria.core.commun.RedevableCriteria;
import ma.zs.univ.bean.core.commun.Redevable;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class RedevableSpecification extends  AbstractSpecification<RedevableCriteria, Redevable>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("cin", criteria.getCin(),criteria.getCinLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
    }

    public RedevableSpecification(RedevableCriteria criteria) {
        super(criteria);
    }

    public RedevableSpecification(RedevableCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
