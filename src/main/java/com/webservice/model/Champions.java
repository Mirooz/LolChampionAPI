package com.webservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "champions")
public class Champions implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * nom du champion
     */
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "key")
    private Long key;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    @Column(name = "lore")
    private String lore;

    @Column(name = "blurb")
    private String blurb;

    @Column(name = "partype")
    private String partype;

    @ManyToOne
    @JoinColumn(name = "image_id", referencedColumnName = "id")
    private Image image;

    @Column(name = "allytips")
    private String allytips;

    @Column(name = "enemytips")
    private String enemytips;

    @Column(name = "tags")
    private String tags;

    @Column(name = "info_defense")
    private Long infoDefense;

    @Column(name = "info_magic")
    private Long infoMagic;

    @Column(name = "info_difficulty")
    private Long infoDifficulty;

    @Column(name = "info_attack")
    private Long infoAttack;

}
