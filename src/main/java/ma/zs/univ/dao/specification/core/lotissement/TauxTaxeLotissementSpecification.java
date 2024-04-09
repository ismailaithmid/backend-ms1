package  ma.zs.univ.dao.specification.core.lotissement;

import ma.zs.univ.dao.criteria.core.lotissement.TauxTaxeLotissementCriteria;
import ma.zs.univ.bean.core.lotissement.TauxTaxeLotissement;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class TauxTaxeLotissementSpecification extends  AbstractSpecification<TauxTaxeLotissementCriteria, TauxTaxeLotissement>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("dateAppMin", criteria.getDateAppMin(), criteria.getDateAppMinFrom(), criteria.getDateAppMinTo());
        addPredicate("dateAppMax", criteria.getDateAppMax(), criteria.getDateAppMaxFrom(), criteria.getDateAppMaxTo());
        addPredicateBigDecimal("montantParMetreCarre", criteria.getMontantParMetreCarre(), criteria.getMontantParMetreCarreMin(), criteria.getMontantParMetreCarreMax());
    }

    public TauxTaxeLotissementSpecification(TauxTaxeLotissementCriteria criteria) {
        super(criteria);
    }

    public TauxTaxeLotissementSpecification(TauxTaxeLotissementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
