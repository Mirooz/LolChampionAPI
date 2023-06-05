package com.webservice.repository;

import com.webservice.model.Passive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PassiveRepository extends JpaRepository<Passive, Long>, JpaSpecificationExecutor<Passive> {

}