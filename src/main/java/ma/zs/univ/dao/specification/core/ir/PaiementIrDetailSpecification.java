package  ma.zs.univ.dao.specification.core.ir;

import ma.zs.univ.dao.criteria.core.ir.PaiementIrDetailCriteria;
import ma.zs.univ.bean.core.ir.PaiementIrDetail;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class PaiementIrDetailSpecification extends  AbstractSpecification<PaiementIrDetailCriteria, PaiementIrDetail>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("salaireBrute", criteria.getSalaireBrute(), criteria.getSalaireBruteMin(), criteria.getSalaireBruteMax());
        addPredicateBigDecimal("cotisationpatronel", criteria.getCotisationpatronel(), criteria.getCotisationpatronelMin(), criteria.getCotisationpatronelMax());
        addPredicateBigDecimal("cotoisationsalarial", criteria.getCotoisationsalarial(), criteria.getCotoisationsalarialMin(), criteria.getCotoisationsalarialMax());
        addPredicateBigDecimal("salaireNet", criteria.getSalaireNet(), criteria.getSalaireNetMin(), criteria.getSalaireNetMax());
        addPredicateFk("paiementIr","id", criteria.getPaiementIr()==null?null:criteria.getPaiementIr().getId());
        addPredicateFk("paiementIr","id", criteria.getPaiementIrs());
        addPredicateFk("tauxIr","id", criteria.getTauxIr()==null?null:criteria.getTauxIr().getId());
        addPredicateFk("tauxIr","id", criteria.getTauxIrs());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
    }

    public PaiementIrDetailSpecification(PaiementIrDetailCriteria criteria) {
        super(criteria);
    }

    public PaiementIrDetailSpecification(PaiementIrDetailCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
