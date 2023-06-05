package com.webservice.repository;

import com.webservice.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StatsRepository extends JpaRepository<Stats, Long>, JpaSpecificationExecutor<Stats> {

}