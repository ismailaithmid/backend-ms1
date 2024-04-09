package  ma.zs.univ.ws.converter.lotissement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.univ.ws.converter.commun.RedevableConverter;



import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.lotissement.TaxeLotissement;
import ma.zs.univ.ws.dto.lotissement.TaxeLotissementDto;

@Component
public class TaxeLotissementConverter extends AbstractConverter<TaxeLotissement, TaxeLotissementDto> {

    @Autowired
    private RedevableConverter redevableConverter ;
    private boolean redevable;

    public  TaxeLotissementConverter() {
        super(TaxeLotissement.class, TaxeLotissementDto.class);
        init(true);
    }

    @Override
    public TaxeLotissement toItem(TaxeLotissementDto dto) {
        if (dto == null) {
            return null;
        } else {
        TaxeLotissement item = new TaxeLotissement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateDePresentation()))
                item.setDateDePresentation(DateUtil.stringEnToDate(dto.getDateDePresentation()));
            if(StringUtil.isNotEmpty(dto.getSurface()))
                item.setSurface(dto.getSurface());
            if(StringUtil.isNotEmpty(dto.getMontantDeBase()))
                item.setMontantDeBase(dto.getMontantDeBase());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(this.redevable && dto.getRedevable()!=null)
                item.setRedevable(redevableConverter.toItem(dto.getRedevable())) ;




        return item;
        }
    }

    @Override
    public TaxeLotissementDto toDto(TaxeLotissement item) {
        if (item == null) {
            return null;
        } else {
            TaxeLotissementDto dto = new TaxeLotissementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateDePresentation()!=null)
                dto.setDateDePresentation(DateUtil.dateTimeToString(item.getDateDePresentation()));
            if(StringUtil.isNotEmpty(item.getSurface()))
                dto.setSurface(item.getSurface());
            if(StringUtil.isNotEmpty(item.getMontantDeBase()))
                dto.setMontantDeBase(item.getMontantDeBase());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(this.redevable && item.getRedevable()!=null) {
                dto.setRedevable(redevableConverter.toDto(item.getRedevable())) ;

            }


        return dto;
        }
    }

    public void copy(TaxeLotissementDto dto, TaxeLotissement t) {
    super.copy(dto, t);
    if (dto.getRedevable() != null)
        redevableConverter.copy(dto.getRedevable(), t.getRedevable());
    }



    public void initObject(boolean value) {
        this.redevable = value;
    }


    public RedevableConverter getRedevableConverter(){
        return this.redevableConverter;
    }
    public void setRedevableConverter(RedevableConverter redevableConverter ){
        this.redevableConverter = redevableConverter;
    }
    public boolean  isRedevable(){
        return this.redevable;
    }
    public void  setRedevable(boolean redevable){
        this.redevable = redevable;
    }
}
