package ma.zs.univ.bean.core.ir;

import java.util.Objects;





import ma.zs.univ.bean.core.ir.PaiementIr;
import ma.zs.univ.bean.core.ir.TauxIr;
import ma.zs.univ.bean.core.employe.Employe;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "paiement_ir_detail")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="paiement_ir_detail_seq",sequenceName="paiement_ir_detail_seq",allocationSize=1, initialValue = 1)
public class PaiementIrDetail   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal salaireBrute = BigDecimal.ZERO;
    private BigDecimal cotisationpatronel = BigDecimal.ZERO;
    private BigDecimal cotoisationsalarial = BigDecimal.ZERO;
    private BigDecimal salaireNet = BigDecimal.ZERO;

    private PaiementIr paiementIr ;
    private TauxIr tauxIr ;
    private Employe employe ;


    public PaiementIrDetail(){
        super();
    }

    public PaiementIrDetail(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="paiement_ir_detail_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paiement_ir")
    public PaiementIr getPaiementIr(){
        return this.paiementIr;
    }
    public void setPaiementIr(PaiementIr paiementIr){
        this.paiementIr = paiementIr;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taux_ir")
    public TauxIr getTauxIr(){
        return this.tauxIr;
    }
    public void setTauxIr(TauxIr tauxIr){
        this.tauxIr = tauxIr;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employe")
    public Employe getEmploye(){
        return this.employe;
    }
    public void setEmploye(Employe employe){
        this.employe = employe;
    }
    public BigDecimal getSalaireBrute(){
        return this.salaireBrute;
    }
    public void setSalaireBrute(BigDecimal salaireBrute){
        this.salaireBrute = salaireBrute;
    }
    public BigDecimal getCotisationpatronel(){
        return this.cotisationpatronel;
    }
    public void setCotisationpatronel(BigDecimal cotisationpatronel){
        this.cotisationpatronel = cotisationpatronel;
    }
    public BigDecimal getCotoisationsalarial(){
        return this.cotoisationsalarial;
    }
    public void setCotoisationsalarial(BigDecimal cotoisationsalarial){
        this.cotoisationsalarial = cotoisationsalarial;
    }
    public BigDecimal getSalaireNet(){
        return this.salaireNet;
    }
    public void setSalaireNet(BigDecimal salaireNet){
        this.salaireNet = salaireNet;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaiementIrDetail paiementIrDetail = (PaiementIrDetail) o;
        return id != null && id.equals(paiementIrDetail.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

