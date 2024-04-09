package  ma.zs.univ.ws.dto.employe;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


import ma.zs.univ.ws.dto.avancement.SocieteDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeSalaireHistoryDto  extends AuditBaseDto {

    private Integer moisdepart  = 0 ;
    private Integer moisFin  = 0 ;
    private Integer anneeDepart  = 0 ;
    private Integer anneeFin  = 0 ;
    private BigDecimal salaireBrute  ;
    private String ref  ;

    private SocieteDto societe ;
    private EmployeDto employe ;



    public EmployeSalaireHistoryDto(){
        super();
    }



    @Log
    public Integer getMoisdepart(){
        return this.moisdepart;
    }
    public void setMoisdepart(Integer moisdepart){
        this.moisdepart = moisdepart;
    }

    @Log
    public Integer getMoisFin(){
        return this.moisFin;
    }
    public void setMoisFin(Integer moisFin){
        this.moisFin = moisFin;
    }

    @Log
    public Integer getAnneeDepart(){
        return this.anneeDepart;
    }
    public void setAnneeDepart(Integer anneeDepart){
        this.anneeDepart = anneeDepart;
    }

    @Log
    public Integer getAnneeFin(){
        return this.anneeFin;
    }
    public void setAnneeFin(Integer anneeFin){
        this.anneeFin = anneeFin;
    }

    @Log
    public BigDecimal getSalaireBrute(){
        return this.salaireBrute;
    }
    public void setSalaireBrute(BigDecimal salaireBrute){
        this.salaireBrute = salaireBrute;
    }

    @Log
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }


    public SocieteDto getSociete(){
        return this.societe;
    }

    public void setSociete(SocieteDto societe){
        this.societe = societe;
    }
    public EmployeDto getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeDto employe){
        this.employe = employe;
    }






}
