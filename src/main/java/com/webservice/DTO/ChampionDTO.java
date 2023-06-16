package com.webservice.DTO;

import com.library.lolmodel.models.Champions;

public class ChampionDTO {
    private String id;
    private Integer key;
    private String name;
    private String title;
    private String lore;
    private String blurb;
    private String partype;
    private String imageFullname;
    private Object allytips;
    private Object enemytips;
    private Object tags;
    private Integer infoDefense;
    private Integer infoMagic;
    private Integer infoDifficulty;
    private Integer infoAttack;

    public ChampionDTO(Champions champion) {
        this.id = champion.getId();
        this.key = champion.getKey();
        this.name = champion.getName();
        this.title = champion.getTitle();
        this.lore = champion.getLore();
        this.blurb = champion.getBlurb();
        this.partype = champion.getPartype();
        this.imageFullname = champion.getImage().getFullname();
        this.allytips = champion.getAllytips();
        this.enemytips = champion.getEnemytips();
        this.tags = champion.getTags();
        this.infoDefense = champion.getInfoDefense();
        this.infoMagic = champion.getInfoMagic();
        this.infoDifficulty = champion.getInfoDifficulty();
        this.infoAttack = champion.getInfoAttack();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
    }

    public String getImageFullname() {
        return imageFullname;
    }

    public void setImageFullname(String imageFullname) {
        this.imageFullname = imageFullname;
    }

    public Object getAllytips() {
        return allytips;
    }

    public void setAllytips(Object allytips) {
        this.allytips = allytips;
    }

    public Object getEnemytips() {
        return enemytips;
    }

    public void setEnemytips(Object enemytips) {
        this.enemytips = enemytips;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Integer getInfoDefense() {
        return infoDefense;
    }

    public void setInfoDefense(Integer infoDefense) {
        this.infoDefense = infoDefense;
    }

    public Integer getInfoMagic() {
        return infoMagic;
    }

    public void setInfoMagic(Integer infoMagic) {
        this.infoMagic = infoMagic;
    }

    public Integer getInfoDifficulty() {
        return infoDifficulty;
    }

    public void setInfoDifficulty(Integer infoDifficulty) {
        this.infoDifficulty = infoDifficulty;
    }

    public Integer getInfoAttack() {
        return infoAttack;
    }

    public void setInfoAttack(Integer infoAttack) {
        this.infoAttack = infoAttack;
    }



}