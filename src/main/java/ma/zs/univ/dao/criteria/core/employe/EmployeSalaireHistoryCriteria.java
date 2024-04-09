package  ma.zs.univ.dao.criteria.core.employe;


import ma.zs.univ.dao.criteria.core.avancement.SocieteCriteria;

import ma.zs.univ.zynerator.criteria.BaseCriteria;
import java.util.List;

public class EmployeSalaireHistoryCriteria extends  BaseCriteria  {

    private String moisdepart;
    private String moisdepartMin;
    private String moisdepartMax;
    private String moisFin;
    private String moisFinMin;
    private String moisFinMax;
    private String anneeDepart;
    private String anneeDepartMin;
    private String anneeDepartMax;
    private String anneeFin;
    private String anneeFinMin;
    private String anneeFinMax;
    private String salaireBrute;
    private String salaireBruteMin;
    private String salaireBruteMax;
    private String ref;
    private String refLike;

    private SocieteCriteria societe ;
    private List<SocieteCriteria> societes ;
    private EmployeCriteria employe ;
    private List<EmployeCriteria> employes ;


    public EmployeSalaireHistoryCriteria(){}

    public String getMoisdepart(){
        return this.moisdepart;
    }
    public void setMoisdepart(String moisdepart){
        this.moisdepart = moisdepart;
    }   
    public String getMoisdepartMin(){
        return this.moisdepartMin;
    }
    public void setMoisdepartMin(String moisdepartMin){
        this.moisdepartMin = moisdepartMin;
    }
    public String getMoisdepartMax(){
        return this.moisdepartMax;
    }
    public void setMoisdepartMax(String moisdepartMax){
        this.moisdepartMax = moisdepartMax;
    }
      
    public String getMoisFin(){
        return this.moisFin;
    }
    public void setMoisFin(String moisFin){
        this.moisFin = moisFin;
    }   
    public String getMoisFinMin(){
        return this.moisFinMin;
    }
    public void setMoisFinMin(String moisFinMin){
        this.moisFinMin = moisFinMin;
    }
    public String getMoisFinMax(){
        return this.moisFinMax;
    }
    public void setMoisFinMax(String moisFinMax){
        this.moisFinMax = moisFinMax;
    }
      
    public String getAnneeDepart(){
        return this.anneeDepart;
    }
    public void setAnneeDepart(String anneeDepart){
        this.anneeDepart = anneeDepart;
    }   
    public String getAnneeDepartMin(){
        return this.anneeDepartMin;
    }
    public void setAnneeDepartMin(String anneeDepartMin){
        this.anneeDepartMin = anneeDepartMin;
    }
    public String getAnneeDepartMax(){
        return this.anneeDepartMax;
    }
    public void setAnneeDepartMax(String anneeDepartMax){
        this.anneeDepartMax = anneeDepartMax;
    }
      
    public String getAnneeFin(){
        return this.anneeFin;
    }
    public void setAnneeFin(String anneeFin){
        this.anneeFin = anneeFin;
    }   
    public String getAnneeFinMin(){
        return this.anneeFinMin;
    }
    public void setAnneeFinMin(String anneeFinMin){
        this.anneeFinMin = anneeFinMin;
    }
    public String getAnneeFinMax(){
        return this.anneeFinMax;
    }
    public void setAnneeFinMax(String anneeFinMax){
        this.anneeFinMax = anneeFinMax;
    }
      
    public String getSalaireBrute(){
        return this.salaireBrute;
    }
    public void setSalaireBrute(String salaireBrute){
        this.salaireBrute = salaireBrute;
    }   
    public String getSalaireBruteMin(){
        return this.salaireBruteMin;
    }
    public void setSalaireBruteMin(String salaireBruteMin){
        this.salaireBruteMin = salaireBruteMin;
    }
    public String getSalaireBruteMax(){
        return this.salaireBruteMax;
    }
    public void setSalaireBruteMax(String salaireBruteMax){
        this.salaireBruteMax = salaireBruteMax;
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


    public SocieteCriteria getSociete(){
        return this.societe;
    }

    public void setSociete(SocieteCriteria societe){
        this.societe = societe;
    }
    public List<SocieteCriteria> getSocietes(){
        return this.societes;
    }

    public void setSocietes(List<SocieteCriteria> societes){
        this.societes = societes;
    }
    public EmployeCriteria getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeCriteria employe){
        this.employe = employe;
    }
    public List<EmployeCriteria> getEmployes(){
        return this.employes;
    }

    public void setEmployes(List<EmployeCriteria> employes){
        this.employes = employes;
    }
}
