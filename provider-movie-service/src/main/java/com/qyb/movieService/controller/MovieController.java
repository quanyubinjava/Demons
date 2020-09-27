package com.qyb.movieService.controller;

import com.qyb.movieService.pojo.Movie;
import com.qyb.movieService.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    MovieServiceImpl movieServiceImpl;

    /**
     * 获取电影
     * @return
     */
    @GetMapping("getNewMovie")
    public Movie getNewMovie(){
        return movieServiceImpl.getNewMovie();
    }
}
