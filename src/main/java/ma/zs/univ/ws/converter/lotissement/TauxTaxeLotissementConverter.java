package  ma.zs.univ.ws.converter.lotissement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.lotissement.TauxTaxeLotissement;
import ma.zs.univ.ws.dto.lotissement.TauxTaxeLotissementDto;

@Component
public class TauxTaxeLotissementConverter extends AbstractConverter<TauxTaxeLotissement, TauxTaxeLotissementDto> {


    public  TauxTaxeLotissementConverter() {
        super(TauxTaxeLotissement.class, TauxTaxeLotissementDto.class);
    }

    @Override
    public TauxTaxeLotissement toItem(TauxTaxeLotissementDto dto) {
        if (dto == null) {
            return null;
        } else {
        TauxTaxeLotissement item = new TauxTaxeLotissement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getDateAppMin()))
                item.setDateAppMin(DateUtil.stringEnToDate(dto.getDateAppMin()));
            if(StringUtil.isNotEmpty(dto.getDateAppMax()))
                item.setDateAppMax(DateUtil.stringEnToDate(dto.getDateAppMax()));
            if(StringUtil.isNotEmpty(dto.getMontantParMetreCarre()))
                item.setMontantParMetreCarre(dto.getMontantParMetreCarre());



        return item;
        }
    }

    @Override
    public TauxTaxeLotissementDto toDto(TauxTaxeLotissement item) {
        if (item == null) {
            return null;
        } else {
            TauxTaxeLotissementDto dto = new TauxTaxeLotissementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(item.getDateAppMin()!=null)
                dto.setDateAppMin(DateUtil.dateTimeToString(item.getDateAppMin()));
            if(item.getDateAppMax()!=null)
                dto.setDateAppMax(DateUtil.dateTimeToString(item.getDateAppMax()));
            if(StringUtil.isNotEmpty(item.getMontantParMetreCarre()))
                dto.setMontantParMetreCarre(item.getMontantParMetreCarre());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
