package  ma.zs.univ.ws.facade.admin.employe;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.univ.bean.core.employe.GradeEmploye;
import ma.zs.univ.dao.criteria.core.employe.GradeEmployeCriteria;
import ma.zs.univ.service.facade.admin.employe.GradeEmployeAdminService;
import ma.zs.univ.ws.converter.employe.GradeEmployeConverter;
import ma.zs.univ.ws.dto.employe.GradeEmployeDto;
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
@RequestMapping("/api/admin/gradeEmploye/")
public class GradeEmployeRestAdmin  extends AbstractController<GradeEmploye, GradeEmployeDto, GradeEmployeCriteria, GradeEmployeAdminService, GradeEmployeConverter> {



    @Operation(summary = "upload one gradeEmploye")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple gradeEmployes")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all gradeEmployes")
    @GetMapping("")
    public ResponseEntity<List<GradeEmployeDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  gradeEmploye")
    @PostMapping("")
    public ResponseEntity<GradeEmployeDto> save(@RequestBody GradeEmployeDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  gradeEmploye")
    @PutMapping("")
    public ResponseEntity<GradeEmployeDto> update(@RequestBody GradeEmployeDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of gradeEmploye")
    @PostMapping("multiple")
    public ResponseEntity<List<GradeEmployeDto>> delete(@RequestBody List<GradeEmployeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified gradeEmploye")
    @DeleteMapping("")
    public ResponseEntity<GradeEmployeDto> delete(@RequestBody GradeEmployeDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified gradeEmploye")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple gradeEmployes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }



    @Operation(summary = "Finds a gradeEmploye and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<GradeEmployeDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds gradeEmployes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<GradeEmployeDto>> findByCriteria(@RequestBody GradeEmployeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated gradeEmployes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody GradeEmployeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports gradeEmployes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody GradeEmployeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets gradeEmploye data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody GradeEmployeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public GradeEmployeRestAdmin (GradeEmployeAdminService service, GradeEmployeConverter converter) {
        super(service, converter);
    }




}
