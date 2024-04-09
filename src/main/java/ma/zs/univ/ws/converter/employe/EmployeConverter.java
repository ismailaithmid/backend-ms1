package  ma.zs.univ.ws.converter.employe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.univ.ws.converter.avancement.SocieteConverter;



import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.employe.Employe;
import ma.zs.univ.ws.dto.employe.EmployeDto;

@Component
public class EmployeConverter extends AbstractConverter<Employe, EmployeDto> {

    @Autowired
    private SocieteConverter societeConverter ;
    private boolean societe;

    public  EmployeConverter() {
        super(Employe.class, EmployeDto.class);
        init(true);
    }

    @Override
    public Employe toItem(EmployeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Employe item = new Employe();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getFirstname()))
                item.setFirstname(dto.getFirstname());
            if(StringUtil.isNotEmpty(dto.getLastname()))
                item.setLastname(dto.getLastname());
            if(this.societe && dto.getSociete()!=null)
                item.setSociete(societeConverter.toItem(dto.getSociete())) ;




        return item;
        }
    }

    @Override
    public EmployeDto toDto(Employe item) {
        if (item == null) {
            return null;
        } else {
            EmployeDto dto = new EmployeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getFirstname()))
                dto.setFirstname(item.getFirstname());
            if(StringUtil.isNotEmpty(item.getLastname()))
                dto.setLastname(item.getLastname());
            if(this.societe && item.getSociete()!=null) {
                dto.setSociete(societeConverter.toDto(item.getSociete())) ;

            }


        return dto;
        }
    }

    public void copy(EmployeDto dto, Employe t) {
    super.copy(dto, t);
    if (dto.getSociete() != null)
        societeConverter.copy(dto.getSociete(), t.getSociete());
    }



    public void initObject(boolean value) {
        this.societe = value;
    }


    public SocieteConverter getSocieteConverter(){
        return this.societeConverter;
    }
    public void setSocieteConverter(SocieteConverter societeConverter ){
        this.societeConverter = societeConverter;
    }
    public boolean  isSociete(){
        return this.societe;
    }
    public void  setSociete(boolean societe){
        this.societe = societe;
    }
}
