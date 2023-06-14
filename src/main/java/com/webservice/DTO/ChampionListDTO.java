package com.webservice.DTO;

public class ChampionListDTO {
    private String id;
    private Integer key;
    private String name;
    private String title;
    private String lore;
    private String blurb;
    private String partype;
    private String imageFullName;
    private Object allytips;
    private Object enemytips;
    private Object tags;
    private Integer infoDefense;
    private Integer infoMagic;
    private Integer infoDifficulty;
    private Integer infoAttack;

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

    public String getImageFullName() {
        return imageFullName;
    }

    public void setImageFullName(String imageFullName) {
        this.imageFullName = imageFullName;
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

    @Override
    public String toString() {
        return "ChampionListDTO{" +
                "id='" + id + '\'' +
                ", key=" + key +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", lore='" + lore + '\'' +
                ", blurb='" + blurb + '\'' +
                ", partype='" + partype + '\'' +
                ", imageFullName='" + imageFullName + '\'' +
                ", allytips=" + allytips +
                ", enemytips=" + enemytips +
                ", tags=" + tags +
                ", infoDefense=" + infoDefense +
                ", infoMagic=" + infoMagic +
                ", infoDifficulty=" + infoDifficulty +
                ", infoAttack=" + infoAttack +
                '}';
    }
}