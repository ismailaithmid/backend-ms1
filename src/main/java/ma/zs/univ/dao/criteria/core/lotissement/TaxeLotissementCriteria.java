package  ma.zs.univ.dao.criteria.core.lotissement;


import ma.zs.univ.dao.criteria.core.commun.RedevableCriteria;

import ma.zs.univ.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class TaxeLotissementCriteria extends  BaseCriteria  {

    private LocalDateTime dateDePresentation;
    private LocalDateTime dateDePresentationFrom;
    private LocalDateTime dateDePresentationTo;
    private String surface;
    private String surfaceMin;
    private String surfaceMax;
    private String montantDeBase;
    private String montantDeBaseMin;
    private String montantDeBaseMax;
    private String ref;
    private String refLike;

    private RedevableCriteria redevable ;
    private List<RedevableCriteria> redevables ;


    public TaxeLotissementCriteria(){}

    public LocalDateTime getDateDePresentation(){
        return this.dateDePresentation;
    }
    public void setDateDePresentation(LocalDateTime dateDePresentation){
        this.dateDePresentation = dateDePresentation;
    }
    public LocalDateTime getDateDePresentationFrom(){
        return this.dateDePresentationFrom;
    }
    public void setDateDePresentationFrom(LocalDateTime dateDePresentationFrom){
        this.dateDePresentationFrom = dateDePresentationFrom;
    }
    public LocalDateTime getDateDePresentationTo(){
        return this.dateDePresentationTo;
    }
    public void setDateDePresentationTo(LocalDateTime dateDePresentationTo){
        this.dateDePresentationTo = dateDePresentationTo;
    }
    public String getSurface(){
        return this.surface;
    }
    public void setSurface(String surface){
        this.surface = surface;
    }   
    public String getSurfaceMin(){
        return this.surfaceMin;
    }
    public void setSurfaceMin(String surfaceMin){
        this.surfaceMin = surfaceMin;
    }
    public String getSurfaceMax(){
        return this.surfaceMax;
    }
    public void setSurfaceMax(String surfaceMax){
        this.surfaceMax = surfaceMax;
    }
      
    public String getMontantDeBase(){
        return this.montantDeBase;
    }
    public void setMontantDeBase(String montantDeBase){
        this.montantDeBase = montantDeBase;
    }   
    public String getMontantDeBaseMin(){
        return this.montantDeBaseMin;
    }
    public void setMontantDeBaseMin(String montantDeBaseMin){
        this.montantDeBaseMin = montantDeBaseMin;
    }
    public String getMontantDeBaseMax(){
        return this.montantDeBaseMax;
    }
    public void setMontantDeBaseMax(String montantDeBaseMax){
        this.montantDeBaseMax = montantDeBaseMax;
    }
      
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


    public RedevableCriteria getRedevable(){
        return this.redevable;
    }

    public void setRedevable(RedevableCriteria redevable){
        this.redevable = redevable;
    }
    public List<RedevableCriteria> getRedevables(){
        return this.redevables;
    }

    public void setRedevables(List<RedevableCriteria> redevables){
        this.redevables = redevables;
    }
}
