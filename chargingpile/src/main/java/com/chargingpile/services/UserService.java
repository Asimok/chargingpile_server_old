package com.chargingpile.services;

import com.chargingpile.dao.UserDao;
import com.chargingpile.data.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
    public void saveUserInfo(User user) {
        userDao.save(user);
    }
}
