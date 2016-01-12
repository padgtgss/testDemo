package com.test.dao;

import com.test.persist.jpa.User;
import org.springframework.data.repository.Repository;

/**
 * @Description: UserDao
 * @anthor: shi_lin
 * @CreateTime: 2016-01-12
 */

public interface UserDao extends Repository<User,Long>{

    User findByUserId(Long userId);
}
