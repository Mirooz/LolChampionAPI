package com.webservice.model;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "spells")
public class Spells implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "championid")
    private String championid;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "tooltip")
    private String tooltip;

    @Column(name = "maxrank")
    private Long maxrank;

    @Column(name = "cooldown")
    private String cooldown;

    @Column(name = "cooldownburn")
    private String cooldownburn;

    @Column(name = "cost")
    private String cost;

    @Column(name = "costburn")
    private String costburn;

    @Column(name = "resource")
    private String resource;

    @Column(name = "rangeburn")
    private String rangeburn;

    @Column(name = "leveltip_label")
    private String leveltipLabel;

    @Column(name = "leveltip_effect")
    private String leveltipEffect;

    @Column(name = "effect")
    private String effect;

    @Column(name = "effectburn")
    private String effectburn;

    @Column(name = "costtype")
    private String costtype;

    @Column(name = "maxammo")
    private Long maxammo;

    @Column(name = "range")
    private String range;

    @Column(name = "image_id")
    private Long imageId;

}
