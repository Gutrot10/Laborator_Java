package com.example.LaboratorUltimaTema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YaleAdmitsDataService {
    @Autowired
    private YaleAdmitsDataRepository repository;

    public List<YaleAdmitsData> getAllItems() {
        return repository.findAll();
    }

    public YaleAdmitsData getByColumn(String columnName, String value) {
        switch (columnName) {
            case "yearEntered":
                return repository.findByColumn("yearEntered", Integer.parseInt(value));

            case "applications":
                return repository.findByColumn("applications", Integer.parseInt(value));
            case "admits":
                return repository.findByColumn("admits", Integer.parseInt(value));
            case "admitRate":
                return repository.findByColumn("admitRate", Double.parseDouble(value));
            case "matriculare":
                return repository.findByColumn("matriculare", Integer.parseInt(value));
            case "yield":
                return repository.findByColumn("yield", Double.parseDouble(value));
            case "verbal10th":
                return repository.findByColumn("verbal10th", Integer.parseInt(value));
            case "verbal25th":
                return repository.findByColumn("verbal25th", Integer.parseInt(value));
            case "verbal50th":
                return repository.findByColumn("verbal50th", Integer.parseInt(value));
            case "verbal75th":
                return repository.findByColumn("verbal75th", Integer.parseInt(value));
            case "verbal90th":
                return repository.findByColumn("verbal90th", Integer.parseInt(value));
            case "math10th":
                return repository.findByColumn("math10th", Integer.parseInt(value));
            case "math25th":
                return repository.findByColumn("math25th", Integer.parseInt(value));
            case "math50th":
                return repository.findByColumn("math50th", Integer.parseInt(value));
            case "math75th":
                return repository.findByColumn("math75th", Integer.parseInt(value));
            case "math90th":
                return repository.findByColumn("math90th", Integer.parseInt(value));
            case "SAT10":
                return repository.findByColumn("SAT10", Integer.parseInt(value));
            case "SAT25":
                return repository.findByColumn("SAT25", Integer.parseInt(value));
            case "SAT50":
                return repository.findByColumn("SAT50", Integer.parseInt(value));
            case "SAT75":
                return repository.findByColumn("SAT75", Integer.parseInt(value));
            case "SAT90":
                return repository.findByColumn("SAT90", Integer.parseInt(value));
            case "legacyCount":
                return repository.findByColumn("legacyCount", Integer.parseInt(value));
            case "newHaven":
                return repository.findByColumn("newHaven", Integer.parseInt(value));
            case "newEngland":
                return repository.findByColumn("newEngland", Integer.parseInt(value));
            case "newYorkState":
                return repository.findByColumn("newYorkState", Integer.parseInt(value));
            case "EOM":
                return repository.findByColumn("EOM", Integer.parseInt(value));


            default:
                throw new IllegalArgumentException("Column name not supported: " + columnName);
        }

    public void addList(List<YaleAdmitsData> yaleAdmitsDataList) {

        repository.saveAll(yaleAdmitsDataList);
    }

    public void deleteByColumn(String columnName, String value) {

    }

    public void updateColumn(Long id, String columnName, String newValue) {

    }
}

