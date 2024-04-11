package ma.zs.univ.bean.core.employe;

import java.util.Objects;





import ma.zs.univ.bean.core.avancement.Societe;
import ma.zs.univ.bean.core.employe.Employe;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "employe_salaire_history")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="employe_salaire_history_seq",sequenceName="employe_salaire_history_seq",allocationSize=1, initialValue = 1)
public class EmployeSalaireHistory   extends AuditBusinessObject     {

    private Long id;


    
    private Integer moisdepart = 0;
    private Integer moisFin = 0;
    private Integer anneeDepart = 0;
    private Integer anneeFin = 0;
    private BigDecimal salaireBrute = BigDecimal.ZERO;
    @Column(length = 500)
    private String ref;

    private Societe societe ;
    private Employe employe ;


    public EmployeSalaireHistory(){
        super();
    }

    public EmployeSalaireHistory(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="employe_salaire_history_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Integer getMoisdepart(){
        return this.moisdepart;
    }
    public void setMoisdepart(Integer moisdepart){
        this.moisdepart = moisdepart;
    }
    public Integer getMoisFin(){
        return this.moisFin;
    }
    public void setMoisFin(Integer moisFin){
        this.moisFin = moisFin;
    }
    public Integer getAnneeDepart(){
        return this.anneeDepart;
    }
    public void setAnneeDepart(Integer anneeDepart){
        this.anneeDepart = anneeDepart;
    }
    public Integer getAnneeFin(){
        return this.anneeFin;
    }
    public void setAnneeFin(Integer anneeFin){
        this.anneeFin = anneeFin;
    }
    public BigDecimal getSalaireBrute(){
        return this.salaireBrute;
    }
    public void setSalaireBrute(BigDecimal salaireBrute){
        this.salaireBrute = salaireBrute;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "societe")
    public Societe getSociete(){
        return this.societe;
    }
    public void setSociete(Societe societe){
        this.societe = societe;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employe")
    public Employe getEmploye(){
        return this.employe;
    }
    public void setEmploye(Employe employe){
        this.employe = employe;
    }
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeSalaireHistory employeSalaireHistory = (EmployeSalaireHistory) o;
        return id != null && id.equals(employeSalaireHistory.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

