package com.qxcjs.aop.annotation.dao.impl;

import com.qxcjs.aop.annotation.User;
import com.qxcjs.aop.annotation.dao.UserDAO;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User user) {
        System.out.println("user saved!");
    }
}
