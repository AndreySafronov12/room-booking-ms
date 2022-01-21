package ru.roombooking.employee.repository;

import ru.roombooking.employee.config.search.specification.SearchCriteria;

import java.util.List;

public interface SearchCriteriaViewRepository<Model> {
    List<Model> search(List<SearchCriteria> params);
    void save(Model entity);
}
