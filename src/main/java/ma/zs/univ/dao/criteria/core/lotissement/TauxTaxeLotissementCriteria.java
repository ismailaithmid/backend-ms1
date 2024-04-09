package  ma.zs.univ.dao.criteria.core.lotissement;



import ma.zs.univ.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class TauxTaxeLotissementCriteria extends  BaseCriteria  {

    private String ref;
    private String refLike;
    private LocalDateTime dateAppMin;
    private LocalDateTime dateAppMinFrom;
    private LocalDateTime dateAppMinTo;
    private LocalDateTime dateAppMax;
    private LocalDateTime dateAppMaxFrom;
    private LocalDateTime dateAppMaxTo;
    private String montantParMetreCarre;
    private String montantParMetreCarreMin;
    private String montantParMetreCarreMax;



    public TauxTaxeLotissementCriteria(){}

    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getRefLike(){
        return this.refLike;
    }
    public void setRefLike(String refLike){
        this.refLike = refLike;
    }

    public LocalDateTime getDateAppMin(){
        return this.dateAppMin;
    }
    public void setDateAppMin(LocalDateTime dateAppMin){
        this.dateAppMin = dateAppMin;
    }
    public LocalDateTime getDateAppMinFrom(){
        return this.dateAppMinFrom;
    }
    public void setDateAppMinFrom(LocalDateTime dateAppMinFrom){
        this.dateAppMinFrom = dateAppMinFrom;
    }
    public LocalDateTime getDateAppMinTo(){
        return this.dateAppMinTo;
    }
    public void setDateAppMinTo(LocalDateTime dateAppMinTo){
        this.dateAppMinTo = dateAppMinTo;
    }
    public LocalDateTime getDateAppMax(){
        return this.dateAppMax;
    }
    public void setDateAppMax(LocalDateTime dateAppMax){
        this.dateAppMax = dateAppMax;
    }
    public LocalDateTime getDateAppMaxFrom(){
        return this.dateAppMaxFrom;
    }
    public void setDateAppMaxFrom(LocalDateTime dateAppMaxFrom){
        this.dateAppMaxFrom = dateAppMaxFrom;
    }
    public LocalDateTime getDateAppMaxTo(){
        return this.dateAppMaxTo;
    }
    public void setDateAppMaxTo(LocalDateTime dateAppMaxTo){
        this.dateAppMaxTo = dateAppMaxTo;
    }
    public String getMontantParMetreCarre(){
        return this.montantParMetreCarre;
    }
    public void setMontantParMetreCarre(String montantParMetreCarre){
        this.montantParMetreCarre = montantParMetreCarre;
    }   
    public String getMontantParMetreCarreMin(){
        return this.montantParMetreCarreMin;
    }
    public void setMontantParMetreCarreMin(String montantParMetreCarreMin){
        this.montantParMetreCarreMin = montantParMetreCarreMin;
    }
    public String getMontantParMetreCarreMax(){
        return this.montantParMetreCarreMax;
    }
    public void setMontantParMetreCarreMax(String montantParMetreCarreMax){
        this.montantParMetreCarreMax = montantParMetreCarreMax;
    }
      

}
