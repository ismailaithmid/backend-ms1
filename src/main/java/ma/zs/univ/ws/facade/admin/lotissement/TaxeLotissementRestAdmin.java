package  ma.zs.univ.ws.facade.admin.lotissement;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.univ.bean.core.lotissement.TaxeLotissement;
import ma.zs.univ.dao.criteria.core.lotissement.TaxeLotissementCriteria;
import ma.zs.univ.service.facade.admin.lotissement.TaxeLotissementAdminService;
import ma.zs.univ.ws.converter.lotissement.TaxeLotissementConverter;
import ma.zs.univ.ws.dto.lotissement.TaxeLotissementDto;
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
@RequestMapping("/api/admin/taxeLotissement/")
public class TaxeLotissementRestAdmin  extends AbstractController<TaxeLotissement, TaxeLotissementDto, TaxeLotissementCriteria, TaxeLotissementAdminService, TaxeLotissementConverter> {



    @Operation(summary = "upload one taxeLotissement")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple taxeLotissements")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all taxeLotissements")
    @GetMapping("")
    public ResponseEntity<List<TaxeLotissementDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  taxeLotissement")
    @PostMapping("")
    public ResponseEntity<TaxeLotissementDto> save(@RequestBody TaxeLotissementDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  taxeLotissement")
    @PutMapping("")
    public ResponseEntity<TaxeLotissementDto> update(@RequestBody TaxeLotissementDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of taxeLotissement")
    @PostMapping("multiple")
    public ResponseEntity<List<TaxeLotissementDto>> delete(@RequestBody List<TaxeLotissementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified taxeLotissement")
    @DeleteMapping("")
    public ResponseEntity<TaxeLotissementDto> delete(@RequestBody TaxeLotissementDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified taxeLotissement")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple taxeLotissements by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by redevable id")
    @GetMapping("redevable/id/{id}")
    public List<TaxeLotissementDto> findByRedevableId(@PathVariable Long id){
        return findDtos(service.findByRedevableId(id));
    }
    @Operation(summary = "delete by redevable id")
    @DeleteMapping("redevable/id/{id}")
    public int deleteByRedevableId(@PathVariable Long id){
        return service.deleteByRedevableId(id);
    }

    @Operation(summary = "Finds a taxeLotissement and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TaxeLotissementDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds taxeLotissements by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TaxeLotissementDto>> findByCriteria(@RequestBody TaxeLotissementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated taxeLotissements by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TaxeLotissementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports taxeLotissements by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TaxeLotissementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets taxeLotissement data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TaxeLotissementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TaxeLotissementRestAdmin (TaxeLotissementAdminService service, TaxeLotissementConverter converter) {
        super(service, converter);
    }




}
