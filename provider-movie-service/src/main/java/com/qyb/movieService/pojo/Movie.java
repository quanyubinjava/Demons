package com.qyb.movieService.pojo;

import java.io.Serializable;

public class Movie implements Serializable {

    private Integer id;
    private String movieName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
