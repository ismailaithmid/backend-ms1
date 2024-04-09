package  ma.zs.univ.ws.converter.employe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.employe.GradeEmploye;
import ma.zs.univ.ws.dto.employe.GradeEmployeDto;

@Component
public class GradeEmployeConverter extends AbstractConverter<GradeEmploye, GradeEmployeDto> {


    public  GradeEmployeConverter() {
        super(GradeEmploye.class, GradeEmployeDto.class);
    }

    @Override
    public GradeEmploye toItem(GradeEmployeDto dto) {
        if (dto == null) {
            return null;
        } else {
        GradeEmploye item = new GradeEmploye();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());



        return item;
        }
    }

    @Override
    public GradeEmployeDto toDto(GradeEmploye item) {
        if (item == null) {
            return null;
        } else {
            GradeEmployeDto dto = new GradeEmployeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
