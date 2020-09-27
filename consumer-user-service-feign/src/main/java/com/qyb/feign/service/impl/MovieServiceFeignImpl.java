package com.qyb.feign.service.impl;

import com.qyb.feign.service.MovieServiceFeign;
import com.qyb.movieService.pojo.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieServiceFeignImpl implements MovieServiceFeign {

    @Override
    public Movie getNewMovie() {
        Movie movie = new Movie();
        movie.setId(121);
        movie.setMovieName("调用不到该服务. . . .");
        return movie;
    }
}
