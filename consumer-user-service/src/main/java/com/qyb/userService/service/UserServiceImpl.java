package com.qyb.userService.service;

import com.qyb.movieService.pojo.Movie;
import com.qyb.userService.dao.UserDao;
import com.qyb.userService.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl {

    @Autowired
    UserDao userDao;

    @Autowired
    RestTemplate restTemplate;

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
        //2.查到最新电影票
        ResponseEntity<Movie> forEntity = restTemplate.getForEntity("http://PROVIDERMOVIE/getNewMovie", Movie.class);
        Movie movie = forEntity.getBody();
        //TODO 暂时为null
        result.put("movie", movie);
        return result;
    }
}
