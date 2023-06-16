package com.webservice.DTO;

public class ChampionListDTO {

    private String id;
    private String name;
    private String imageFullname;

    public ChampionListDTO(String id, String name, String imageFullname) {
        this.id = id;
        this.name = name;
        this.imageFullname = imageFullname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageFullname() {
        return imageFullname;
    }

    public void setImageFullname(String imageFullname) {
        this.imageFullname = imageFullname;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
