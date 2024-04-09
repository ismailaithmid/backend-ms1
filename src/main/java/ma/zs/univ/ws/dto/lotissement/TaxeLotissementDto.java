package  ma.zs.univ.ws.dto.lotissement;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


import ma.zs.univ.ws.dto.commun.RedevableDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxeLotissementDto  extends AuditBaseDto {

    private String dateDePresentation ;
    private BigDecimal surface  ;
    private BigDecimal montantDeBase  ;
    private String ref  ;

    private RedevableDto redevable ;



    public TaxeLotissementDto(){
        super();
    }



    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDePresentation(){
        return this.dateDePresentation;
    }
    public void setDateDePresentation(String dateDePresentation){
        this.dateDePresentation = dateDePresentation;
    }

    @Log
    public BigDecimal getSurface(){
        return this.surface;
    }
    public void setSurface(BigDecimal surface){
        this.surface = surface;
    }

    @Log
    public BigDecimal getMontantDeBase(){
        return this.montantDeBase;
    }
    public void setMontantDeBase(BigDecimal montantDeBase){
        this.montantDeBase = montantDeBase;
    }

    @Log
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }


    public RedevableDto getRedevable(){
        return this.redevable;
    }

    public void setRedevable(RedevableDto redevable){
        this.redevable = redevable;
    }






}
