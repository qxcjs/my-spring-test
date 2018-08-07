package com.qxcjs.aop.annotation.service;

import com.qxcjs.aop.annotation.User;
import com.qxcjs.aop.annotation.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void init() {
        System.out.println("init");
    }

    public void add(User user) {
        userDAO.save(user);
    }
    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO( UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
