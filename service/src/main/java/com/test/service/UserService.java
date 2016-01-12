package com.test.service;

import com.test.persist.jpa.User;

/**
 * @Description: UserService
 * @anthor: shi_lin
 * @CreateTime: 2016-01-12
 */
public interface UserService {

    User findByUserId(Long userId);
}
