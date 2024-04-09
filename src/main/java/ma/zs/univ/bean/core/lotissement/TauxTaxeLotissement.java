package ma.zs.univ.bean.core.lotissement;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;




import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "taux_taxe_lotissement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taux_taxe_lotissement_seq",sequenceName="taux_taxe_lotissement_seq",allocationSize=1, initialValue = 1)
public class TauxTaxeLotissement   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String ref;
    private LocalDateTime dateAppMin ;
    private LocalDateTime dateAppMax ;
    private BigDecimal montantParMetreCarre = BigDecimal.ZERO;



    public TauxTaxeLotissement(){
        super();
    }

    public TauxTaxeLotissement(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="taux_taxe_lotissement_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public LocalDateTime getDateAppMin(){
        return this.dateAppMin;
    }
    public void setDateAppMin(LocalDateTime dateAppMin){
        this.dateAppMin = dateAppMin;
    }
    public LocalDateTime getDateAppMax(){
        return this.dateAppMax;
    }
    public void setDateAppMax(LocalDateTime dateAppMax){
        this.dateAppMax = dateAppMax;
    }
    public BigDecimal getMontantParMetreCarre(){
        return this.montantParMetreCarre;
    }
    public void setMontantParMetreCarre(BigDecimal montantParMetreCarre){
        this.montantParMetreCarre = montantParMetreCarre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TauxTaxeLotissement tauxTaxeLotissement = (TauxTaxeLotissement) o;
        return id != null && id.equals(tauxTaxeLotissement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

