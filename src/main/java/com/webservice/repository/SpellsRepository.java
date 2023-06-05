package com.webservice.repository;

import com.webservice.model.Spells;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SpellsRepository extends JpaRepository<Spells, String>, JpaSpecificationExecutor<Spells> {

}