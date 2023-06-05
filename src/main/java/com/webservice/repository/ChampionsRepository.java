package com.webservice.repository;

import com.webservice.model.Champions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

public interface ChampionsRepository extends JpaRepository<Champions, String>, JpaSpecificationExecutor<Champions> {

}