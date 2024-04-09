package  ma.zs.univ.ws.facade.admin.lotissement;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.univ.bean.core.lotissement.TauxTaxeLotissement;
import ma.zs.univ.dao.criteria.core.lotissement.TauxTaxeLotissementCriteria;
import ma.zs.univ.service.facade.admin.lotissement.TauxTaxeLotissementAdminService;
import ma.zs.univ.ws.converter.lotissement.TauxTaxeLotissementConverter;
import ma.zs.univ.ws.dto.lotissement.TauxTaxeLotissementDto;
import ma.zs.univ.zynerator.controller.AbstractController;
import ma.zs.univ.zynerator.dto.AuditEntityDto;
import ma.zs.univ.zynerator.util.PaginatedList;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.zs.univ.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.zs.univ.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/tauxTaxeLotissement/")
public class TauxTaxeLotissementRestAdmin  extends AbstractController<TauxTaxeLotissement, TauxTaxeLotissementDto, TauxTaxeLotissementCriteria, TauxTaxeLotissementAdminService, TauxTaxeLotissementConverter> {



    @Operation(summary = "upload one tauxTaxeLotissement")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple tauxTaxeLotissements")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all tauxTaxeLotissements")
    @GetMapping("")
    public ResponseEntity<List<TauxTaxeLotissementDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  tauxTaxeLotissement")
    @PostMapping("")
    public ResponseEntity<TauxTaxeLotissementDto> save(@RequestBody TauxTaxeLotissementDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  tauxTaxeLotissement")
    @PutMapping("")
    public ResponseEntity<TauxTaxeLotissementDto> update(@RequestBody TauxTaxeLotissementDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of tauxTaxeLotissement")
    @PostMapping("multiple")
    public ResponseEntity<List<TauxTaxeLotissementDto>> delete(@RequestBody List<TauxTaxeLotissementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified tauxTaxeLotissement")
    @DeleteMapping("")
    public ResponseEntity<TauxTaxeLotissementDto> delete(@RequestBody TauxTaxeLotissementDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified tauxTaxeLotissement")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple tauxTaxeLotissements by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }



    @Operation(summary = "Finds a tauxTaxeLotissement and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TauxTaxeLotissementDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds tauxTaxeLotissements by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TauxTaxeLotissementDto>> findByCriteria(@RequestBody TauxTaxeLotissementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated tauxTaxeLotissements by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TauxTaxeLotissementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports tauxTaxeLotissements by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TauxTaxeLotissementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets tauxTaxeLotissement data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TauxTaxeLotissementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TauxTaxeLotissementRestAdmin (TauxTaxeLotissementAdminService service, TauxTaxeLotissementConverter converter) {
        super(service, converter);
    }




}
