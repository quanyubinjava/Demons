package com.qyb.movieService.service;

import com.qyb.movieService.dao.MovieDao;
import com.qyb.movieService.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl {

    @Autowired
    MovieDao movieDao;



    public Movie getNewMovie() {
        return movieDao.getNewMovie();
    }

}
