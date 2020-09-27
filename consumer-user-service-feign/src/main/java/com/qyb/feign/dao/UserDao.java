package com.qyb.feign.dao;

import com.qyb.feign.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public User getUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUserName("quanyubin");
        return user;
    }
}
