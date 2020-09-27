package com.qyb.feign.service;

import com.qyb.feign.service.impl.MovieServiceFeignImpl;
import com.qyb.movieService.pojo.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "ProviderMovie",fallback = MovieServiceFeignImpl.class)
public interface MovieServiceFeign {

    @GetMapping("getNewMovie")
    public Movie getNewMovie();
}
