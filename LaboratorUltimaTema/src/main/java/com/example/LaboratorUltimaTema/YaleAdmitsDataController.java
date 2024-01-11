package com.example.LaboratorUltimaTema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/yale-admits-data")
public class YaleAdmitsDataController {
    @Autowired
    private YaleAdmitsDataService yaleAdmitsDataService;

    @GetMapping
    public List<YaleAdmitsData> getAllItems() {
        return yaleAdmitsDataService.getAllItems();
    }

    @GetMapping("/get-by-column/{columnName}/{value}")
    public ResponseEntity<YaleAdmitsData> getByColumn(@PathVariable String columnName, @PathVariable String value) {
        YaleAdmitsData result = yaleAdmitsDataService.getByColumn(columnName, value);
        return result != null ? ResponseEntity.ok().body(result) : ResponseEntity.notFound().build();
    }

    @PostMapping("/add-list")
    public ResponseEntity<Void> addList(@RequestBody List<YaleAdmitsData> yaleAdmitsDataList) {
        yaleAdmitsDataService.addList(yaleAdmitsDataList);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/delete-by-column/{columnName}/{value}")
    public ResponseEntity<Void> deleteByColumn(@PathVariable String columnName, @PathVariable String value) {
        yaleAdmitsDataService.deleteByColumn(columnName, value);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update/{id}/{columnName}/{newValue}")
    public ResponseEntity<Void> updateColumn(@PathVariable Long id, @PathVariable String columnName, @PathVariable String newValue) {
        yaleAdmitsDataService.updateColumn(id, columnName, newValue);
        return ResponseEntity.noContent().build();
    }
}
