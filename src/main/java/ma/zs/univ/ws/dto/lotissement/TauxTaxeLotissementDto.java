package  ma.zs.univ.ws.dto.lotissement;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class TauxTaxeLotissementDto  extends AuditBaseDto {

    private String ref  ;
    private String dateAppMin ;
    private String dateAppMax ;
    private BigDecimal montantParMetreCarre  ;




    public TauxTaxeLotissementDto(){
        super();
    }



    @Log
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateAppMin(){
        return this.dateAppMin;
    }
    public void setDateAppMin(String dateAppMin){
        this.dateAppMin = dateAppMin;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateAppMax(){
        return this.dateAppMax;
    }
    public void setDateAppMax(String dateAppMax){
        this.dateAppMax = dateAppMax;
    }

    @Log
    public BigDecimal getMontantParMetreCarre(){
        return this.montantParMetreCarre;
    }
    public void setMontantParMetreCarre(BigDecimal montantParMetreCarre){
        this.montantParMetreCarre = montantParMetreCarre;
    }








}
