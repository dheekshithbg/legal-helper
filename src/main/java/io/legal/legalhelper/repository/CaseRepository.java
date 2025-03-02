package io.legal.legalhelper.repository;

import org.springframework.data.repository.CrudRepository;

import io.legal.legalhelper.model.Case;

public interface CaseRepository extends CrudRepository<Case, Long> {
    
}
