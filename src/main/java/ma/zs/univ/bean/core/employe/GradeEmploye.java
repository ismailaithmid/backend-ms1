package ma.zs.univ.bean.core.employe;

import java.util.Objects;







import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "grade_employe")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="grade_employe_seq",sequenceName="grade_employe_seq",allocationSize=1, initialValue = 1)
public class GradeEmploye   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;



    public GradeEmploye(){
        super();
    }

    public GradeEmploye(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="grade_employe_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradeEmploye gradeEmploye = (GradeEmploye) o;
        return id != null && id.equals(gradeEmploye.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

