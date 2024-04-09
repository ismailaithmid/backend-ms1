package ma.zs.univ.bean.core.lotissement;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import ma.zs.univ.bean.core.commun.Redevable;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "taxe_lotissement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taxe_lotissement_seq",sequenceName="taxe_lotissement_seq",allocationSize=1, initialValue = 1)
public class TaxeLotissement   extends AuditBusinessObject     {

    private Long id;

    private LocalDateTime dateDePresentation ;
    private BigDecimal surface = BigDecimal.ZERO;
    private BigDecimal montantDeBase = BigDecimal.ZERO;
    @Column(length = 500)
    private String ref;

    private Redevable redevable ;


    public TaxeLotissement(){
        super();
    }

    public TaxeLotissement(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="taxe_lotissement_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public LocalDateTime getDateDePresentation(){
        return this.dateDePresentation;
    }
    public void setDateDePresentation(LocalDateTime dateDePresentation){
        this.dateDePresentation = dateDePresentation;
    }
    public BigDecimal getSurface(){
        return this.surface;
    }
    public void setSurface(BigDecimal surface){
        this.surface = surface;
    }
    public BigDecimal getMontantDeBase(){
        return this.montantDeBase;
    }
    public void setMontantDeBase(BigDecimal montantDeBase){
        this.montantDeBase = montantDeBase;
    }
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "redevable")
    public Redevable getRedevable(){
        return this.redevable;
    }
    public void setRedevable(Redevable redevable){
        this.redevable = redevable;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxeLotissement taxeLotissement = (TaxeLotissement) o;
        return id != null && id.equals(taxeLotissement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

