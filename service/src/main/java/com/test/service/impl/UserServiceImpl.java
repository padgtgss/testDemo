package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.persist.jpa.User;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: UserServiceImpl
 * @anthor: shi_lin
 * @CreateTime: 2016-01-12
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User findByUserId(Long userId) {

        return userDao.findByUserId(userId);
    }
}
