package com.webservice.model;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "stats")
public class Stats implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "championid")
    private String championid;

    @Column(name = "hp")
    private Long hp;

    @Column(name = "hpperlevel")
    private Long hpperlevel;

    @Column(name = "mp")
    private Long mp;

    @Column(name = "mpperlevel")
    private Long mpperlevel;

    @Column(name = "movespeed")
    private Long movespeed;

    @Column(name = "armor")
    private Long armor;

    @Column(name = "armorperlevel")
    private Double armorperlevel;

    @Column(name = "spellblock")
    private Long spellblock;

    @Column(name = "spellblockperlevel")
    private Double spellblockperlevel;

    @Column(name = "attackrange")
    private Long attackrange;

    @Column(name = "hpregen")
    private Double hpregen;

    @Column(name = "hpregenperlevel")
    private Double hpregenperlevel;

    @Column(name = "mpregen")
    private Double mpregen;

    @Column(name = "mpregenperlevel")
    private Double mpregenperlevel;

    @Column(name = "crit")
    private Double crit;

    @Column(name = "critperlevel")
    private Double critperlevel;

    @Column(name = "attackdamage")
    private Double attackdamage;

    @Column(name = "attackdamageperlevel")
    private Double attackdamageperlevel;

    @Column(name = "attackspeedperlevel")
    private Double attackspeedperlevel;

    @Column(name = "attackspeed")
    private Double attackspeed;

}
