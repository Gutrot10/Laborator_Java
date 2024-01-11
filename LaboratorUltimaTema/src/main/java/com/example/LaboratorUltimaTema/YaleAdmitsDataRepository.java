package com.example.LaboratorUltimaTema;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface YaleAdmitsDataRepository extends JpaRepository<YaleAdmitsData, Long> {
    YaleAdmitsData findByColumn(String columnName, Object columnValue);
    void addList(List<YaleAdmitsData> yaleAdmitsDataList);
    void updateColumn(String columnName, Object oldValue, Object newValue);

    void deleteByColumn(String columnName, Object columnValue);
}