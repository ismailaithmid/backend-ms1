package  ma.zs.univ.dao.specification.core.lotissement;

import ma.zs.univ.dao.criteria.core.lotissement.TaxeLotissementCriteria;
import ma.zs.univ.bean.core.lotissement.TaxeLotissement;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class TaxeLotissementSpecification extends  AbstractSpecification<TaxeLotissementCriteria, TaxeLotissement>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("dateDePresentation", criteria.getDateDePresentation(), criteria.getDateDePresentationFrom(), criteria.getDateDePresentationTo());
        addPredicateBigDecimal("surface", criteria.getSurface(), criteria.getSurfaceMin(), criteria.getSurfaceMax());
        addPredicateBigDecimal("montantDeBase", criteria.getMontantDeBase(), criteria.getMontantDeBaseMin(), criteria.getMontantDeBaseMax());
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicateFk("redevable","id", criteria.getRedevable()==null?null:criteria.getRedevable().getId());
        addPredicateFk("redevable","id", criteria.getRedevables());
    }

    public TaxeLotissementSpecification(TaxeLotissementCriteria criteria) {
        super(criteria);
    }

    public TaxeLotissementSpecification(TaxeLotissementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
