package com.qxcjs.aop.config.dao.impl;

import com.qxcjs.aop.config.User;
import com.qxcjs.aop.config.dao.UserDAO;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User user) {
        System.out.println("user saved!");
    }
}
