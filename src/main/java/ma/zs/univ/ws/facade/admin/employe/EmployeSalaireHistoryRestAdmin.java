package  ma.zs.univ.ws.facade.admin.employe;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.univ.bean.core.employe.EmployeSalaireHistory;
import ma.zs.univ.dao.criteria.core.employe.EmployeSalaireHistoryCriteria;
import ma.zs.univ.service.facade.admin.employe.EmployeSalaireHistoryAdminService;
import ma.zs.univ.ws.converter.employe.EmployeSalaireHistoryConverter;
import ma.zs.univ.ws.dto.employe.EmployeSalaireHistoryDto;
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
@RequestMapping("/api/admin/employeSalaireHistory/")
public class EmployeSalaireHistoryRestAdmin  extends AbstractController<EmployeSalaireHistory, EmployeSalaireHistoryDto, EmployeSalaireHistoryCriteria, EmployeSalaireHistoryAdminService, EmployeSalaireHistoryConverter> {



    @Operation(summary = "upload one employeSalaireHistory")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple employeSalaireHistorys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all employeSalaireHistorys")
    @GetMapping("")
    public ResponseEntity<List<EmployeSalaireHistoryDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  employeSalaireHistory")
    @PostMapping("")
    public ResponseEntity<EmployeSalaireHistoryDto> save(@RequestBody EmployeSalaireHistoryDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  employeSalaireHistory")
    @PutMapping("")
    public ResponseEntity<EmployeSalaireHistoryDto> update(@RequestBody EmployeSalaireHistoryDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of employeSalaireHistory")
    @PostMapping("multiple")
    public ResponseEntity<List<EmployeSalaireHistoryDto>> delete(@RequestBody List<EmployeSalaireHistoryDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified employeSalaireHistory")
    @DeleteMapping("")
    public ResponseEntity<EmployeSalaireHistoryDto> delete(@RequestBody EmployeSalaireHistoryDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified employeSalaireHistory")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple employeSalaireHistorys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by societe id")
    @GetMapping("societe/id/{id}")
    public List<EmployeSalaireHistoryDto> findBySocieteId(@PathVariable Long id){
        return findDtos(service.findBySocieteId(id));
    }
    @Operation(summary = "delete by societe id")
    @DeleteMapping("societe/id/{id}")
    public int deleteBySocieteId(@PathVariable Long id){
        return service.deleteBySocieteId(id);
    }
    @Operation(summary = "find by employe id")
    @GetMapping("employe/id/{id}")
    public List<EmployeSalaireHistoryDto> findByEmployeId(@PathVariable Long id){
        return findDtos(service.findByEmployeId(id));
    }
    @Operation(summary = "delete by employe id")
    @DeleteMapping("employe/id/{id}")
    public int deleteByEmployeId(@PathVariable Long id){
        return service.deleteByEmployeId(id);
    }

    @Operation(summary = "Finds a employeSalaireHistory and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EmployeSalaireHistoryDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds employeSalaireHistorys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EmployeSalaireHistoryDto>> findByCriteria(@RequestBody EmployeSalaireHistoryCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated employeSalaireHistorys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EmployeSalaireHistoryCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports employeSalaireHistorys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EmployeSalaireHistoryCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets employeSalaireHistory data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EmployeSalaireHistoryCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public EmployeSalaireHistoryRestAdmin (EmployeSalaireHistoryAdminService service, EmployeSalaireHistoryConverter converter) {
        super(service, converter);
    }




}
