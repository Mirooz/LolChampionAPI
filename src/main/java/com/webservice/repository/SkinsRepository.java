package com.webservice.repository;

import com.webservice.model.Skins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SkinsRepository extends JpaRepository<Skins, Long>, JpaSpecificationExecutor<Skins> {

}