package com.example.hw31_3m;

public class Dorama {
    private String name;
    private String genres;
    private String imgDorama;

    public Dorama(String name, String genres, String imgDorama) {
        this.name = name;
        this.genres = genres;
        this.imgDorama = imgDorama;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getImgDorama() {
        return imgDorama;
    }

    public void setImgDorama(String imgDorama) {
        this.imgDorama = imgDorama;
    }


}
