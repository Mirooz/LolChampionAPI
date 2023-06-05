package com.webservice.model;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "skins")
public class Skins implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "championid")
    private String championid;

    @Column(name = "num")
    private Long num;

    @Column(name = "name")
    private String name;

    @Column(name = "chromas")
    private Boolean chromas;

}
