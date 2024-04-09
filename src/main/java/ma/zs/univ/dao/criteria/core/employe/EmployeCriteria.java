package  ma.zs.univ.dao.criteria.core.employe;


import ma.zs.univ.dao.criteria.core.avancement.SocieteCriteria;

import ma.zs.univ.zynerator.criteria.BaseCriteria;
import java.util.List;

public class EmployeCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String firstname;
    private String firstnameLike;
    private String lastname;
    private String lastnameLike;

    private SocieteCriteria societe ;
    private List<SocieteCriteria> societes ;


    public EmployeCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getFirstname(){
        return this.firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getFirstnameLike(){
        return this.firstnameLike;
    }
    public void setFirstnameLike(String firstnameLike){
        this.firstnameLike = firstnameLike;
    }

    public String getLastname(){
        return this.lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getLastnameLike(){
        return this.lastnameLike;
    }
    public void setLastnameLike(String lastnameLike){
        this.lastnameLike = lastnameLike;
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
}
