package  ma.zs.univ.ws.converter.ir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.univ.ws.converter.ir.PaiementIrConverter;
import ma.zs.univ.ws.converter.ir.TauxIrConverter;
import ma.zs.univ.ws.converter.employe.EmployeConverter;

import ma.zs.univ.bean.core.ir.PaiementIr;


import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.ir.PaiementIrDetail;
import ma.zs.univ.ws.dto.ir.PaiementIrDetailDto;

@Component
public class PaiementIrDetailConverter extends AbstractConverter<PaiementIrDetail, PaiementIrDetailDto> {

    @Autowired
    private PaiementIrConverter paiementIrConverter ;
    @Autowired
    private TauxIrConverter tauxIrConverter ;
    @Autowired
    private EmployeConverter employeConverter ;
    private boolean paiementIr;
    private boolean tauxIr;
    private boolean employe;

    public  PaiementIrDetailConverter() {
        super(PaiementIrDetail.class, PaiementIrDetailDto.class);
        init(true);
    }

    @Override
    public PaiementIrDetail toItem(PaiementIrDetailDto dto) {
        if (dto == null) {
            return null;
        } else {
        PaiementIrDetail item = new PaiementIrDetail();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getSalaireBrute()))
                item.setSalaireBrute(dto.getSalaireBrute());
            if(StringUtil.isNotEmpty(dto.getCotisationpatronel()))
                item.setCotisationpatronel(dto.getCotisationpatronel());
            if(StringUtil.isNotEmpty(dto.getCotoisationsalarial()))
                item.setCotoisationsalarial(dto.getCotoisationsalarial());
            if(StringUtil.isNotEmpty(dto.getSalaireNet()))
                item.setSalaireNet(dto.getSalaireNet());
            if(dto.getPaiementIr() != null && dto.getPaiementIr().getId() != null){
                item.setPaiementIr(new PaiementIr());
                item.getPaiementIr().setId(dto.getPaiementIr().getId());
                item.getPaiementIr().setId(dto.getPaiementIr().getId());
            }

            if(this.tauxIr && dto.getTauxIr()!=null)
                item.setTauxIr(tauxIrConverter.toItem(dto.getTauxIr())) ;

            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;




        return item;
        }
    }

    @Override
    public PaiementIrDetailDto toDto(PaiementIrDetail item) {
        if (item == null) {
            return null;
        } else {
            PaiementIrDetailDto dto = new PaiementIrDetailDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getSalaireBrute()))
                dto.setSalaireBrute(item.getSalaireBrute());
            if(StringUtil.isNotEmpty(item.getCotisationpatronel()))
                dto.setCotisationpatronel(item.getCotisationpatronel());
            if(StringUtil.isNotEmpty(item.getCotoisationsalarial()))
                dto.setCotoisationsalarial(item.getCotoisationsalarial());
            if(StringUtil.isNotEmpty(item.getSalaireNet()))
                dto.setSalaireNet(item.getSalaireNet());
            if(this.paiementIr && item.getPaiementIr()!=null) {
                dto.setPaiementIr(paiementIrConverter.toDto(item.getPaiementIr())) ;

            }
            if(this.tauxIr && item.getTauxIr()!=null) {
                dto.setTauxIr(tauxIrConverter.toDto(item.getTauxIr())) ;

            }
            if(this.employe && item.getEmploye()!=null) {
                dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;

            }


        return dto;
        }
    }

    public void copy(PaiementIrDetailDto dto, PaiementIrDetail t) {
    super.copy(dto, t);
    if (dto.getPaiementIr() != null)
        paiementIrConverter.copy(dto.getPaiementIr(), t.getPaiementIr());
    if (dto.getTauxIr() != null)
        tauxIrConverter.copy(dto.getTauxIr(), t.getTauxIr());
    if (dto.getEmploye() != null)
        employeConverter.copy(dto.getEmploye(), t.getEmploye());
    }



    public void initObject(boolean value) {
        this.paiementIr = value;
        this.tauxIr = value;
        this.employe = value;
    }


    public PaiementIrConverter getPaiementIrConverter(){
        return this.paiementIrConverter;
    }
    public void setPaiementIrConverter(PaiementIrConverter paiementIrConverter ){
        this.paiementIrConverter = paiementIrConverter;
    }
    public TauxIrConverter getTauxIrConverter(){
        return this.tauxIrConverter;
    }
    public void setTauxIrConverter(TauxIrConverter tauxIrConverter ){
        this.tauxIrConverter = tauxIrConverter;
    }
    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public boolean  isPaiementIr(){
        return this.paiementIr;
    }
    public void  setPaiementIr(boolean paiementIr){
        this.paiementIr = paiementIr;
    }
    public boolean  isTauxIr(){
        return this.tauxIr;
    }
    public void  setTauxIr(boolean tauxIr){
        this.tauxIr = tauxIr;
    }
    public boolean  isEmploye(){
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }
}
