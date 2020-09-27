package com.qyb.feign.service.impl;

import com.qyb.feign.dao.UserDao;
import com.qyb.feign.pojo.User;

import com.qyb.feign.service.MovieServiceFeign;
import com.qyb.movieService.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl {

    @Autowired
    UserDao userDao;

    @Autowired
    MovieServiceFeign movieServiceFeign;
    /**
     * 根据ID得到用户对象
     *
     * @param id
     * @return
     */
    public User getUserById(Integer id) {
        User user = userDao.getUser(id);
        return user;
    }

    /**
     * 购买最新的电影票
     * @param id 用户ID
     * @return
     */
    public Map<String, Object> buyMovie(Integer id) {
        Map<String, Object> result = new HashMap<>();
        //1.查询用户信息
        User user = this.getUserById(id);
        result.put("user", user);
        //2.使用feign调用电影服务查询电影票
        Movie movie = movieServiceFeign.getNewMovie();

        result.put("movie", movie);
        return result;
    }
}
