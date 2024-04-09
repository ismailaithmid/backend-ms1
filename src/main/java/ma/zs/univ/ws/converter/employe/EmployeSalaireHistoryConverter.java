package  ma.zs.univ.ws.converter.employe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.univ.ws.converter.avancement.SocieteConverter;
import ma.zs.univ.ws.converter.employe.EmployeConverter;



import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.employe.EmployeSalaireHistory;
import ma.zs.univ.ws.dto.employe.EmployeSalaireHistoryDto;

@Component
public class EmployeSalaireHistoryConverter extends AbstractConverter<EmployeSalaireHistory, EmployeSalaireHistoryDto> {

    @Autowired
    private SocieteConverter societeConverter ;
    @Autowired
    private EmployeConverter employeConverter ;
    private boolean societe;
    private boolean employe;

    public  EmployeSalaireHistoryConverter() {
        super(EmployeSalaireHistory.class, EmployeSalaireHistoryDto.class);
        init(true);
    }

    @Override
    public EmployeSalaireHistory toItem(EmployeSalaireHistoryDto dto) {
        if (dto == null) {
            return null;
        } else {
        EmployeSalaireHistory item = new EmployeSalaireHistory();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getMoisdepart()))
                item.setMoisdepart(dto.getMoisdepart());
            if(StringUtil.isNotEmpty(dto.getMoisFin()))
                item.setMoisFin(dto.getMoisFin());
            if(StringUtil.isNotEmpty(dto.getAnneeDepart()))
                item.setAnneeDepart(dto.getAnneeDepart());
            if(StringUtil.isNotEmpty(dto.getAnneeFin()))
                item.setAnneeFin(dto.getAnneeFin());
            if(StringUtil.isNotEmpty(dto.getSalaireBrute()))
                item.setSalaireBrute(dto.getSalaireBrute());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(this.societe && dto.getSociete()!=null)
                item.setSociete(societeConverter.toItem(dto.getSociete())) ;

            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;




        return item;
        }
    }

    @Override
    public EmployeSalaireHistoryDto toDto(EmployeSalaireHistory item) {
        if (item == null) {
            return null;
        } else {
            EmployeSalaireHistoryDto dto = new EmployeSalaireHistoryDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getMoisdepart()))
                dto.setMoisdepart(item.getMoisdepart());
            if(StringUtil.isNotEmpty(item.getMoisFin()))
                dto.setMoisFin(item.getMoisFin());
            if(StringUtil.isNotEmpty(item.getAnneeDepart()))
                dto.setAnneeDepart(item.getAnneeDepart());
            if(StringUtil.isNotEmpty(item.getAnneeFin()))
                dto.setAnneeFin(item.getAnneeFin());
            if(StringUtil.isNotEmpty(item.getSalaireBrute()))
                dto.setSalaireBrute(item.getSalaireBrute());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(this.societe && item.getSociete()!=null) {
                dto.setSociete(societeConverter.toDto(item.getSociete())) ;

            }
            if(this.employe && item.getEmploye()!=null) {
                dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;

            }


        return dto;
        }
    }

    public void copy(EmployeSalaireHistoryDto dto, EmployeSalaireHistory t) {
    super.copy(dto, t);
    if (dto.getSociete() != null)
        societeConverter.copy(dto.getSociete(), t.getSociete());
    if (dto.getEmploye() != null)
        employeConverter.copy(dto.getEmploye(), t.getEmploye());
    }



    public void initObject(boolean value) {
        this.societe = value;
        this.employe = value;
    }


    public SocieteConverter getSocieteConverter(){
        return this.societeConverter;
    }
    public void setSocieteConverter(SocieteConverter societeConverter ){
        this.societeConverter = societeConverter;
    }
    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public boolean  isSociete(){
        return this.societe;
    }
    public void  setSociete(boolean societe){
        this.societe = societe;
    }
    public boolean  isEmploye(){
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }
}
