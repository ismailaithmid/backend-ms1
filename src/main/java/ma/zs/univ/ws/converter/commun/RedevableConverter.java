package  ma.zs.univ.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.commun.Redevable;
import ma.zs.univ.ws.dto.commun.RedevableDto;

@Component
public class RedevableConverter extends AbstractConverter<Redevable, RedevableDto> {


    public  RedevableConverter() {
        super(Redevable.class, RedevableDto.class);
    }

    @Override
    public Redevable toItem(RedevableDto dto) {
        if (dto == null) {
            return null;
        } else {
        Redevable item = new Redevable();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());



        return item;
        }
    }

    @Override
    public RedevableDto toDto(Redevable item) {
        if (item == null) {
            return null;
        } else {
            RedevableDto dto = new RedevableDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCin()))
                dto.setCin(item.getCin());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
