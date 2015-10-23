/**
 * 
 */
package com.liushuqing.wqn.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liushuqing.wqn.meta.dao.UserDao;
import com.liushuqing.wqn.meta.entity.User;
import com.liushuqing.wqn.service.UserServce;

/**
 * @author nancheng
 *
 */
@Service
public class UserServiceImpl implements UserServce {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        userDao.insertUser(user);
        return user.getId();
    }

    @Override
    public int insertUsers(List<User> users) {
        Iterator<User> user = users.iterator();
        while (user.hasNext()) {
            insertUser(user.next());
        }
        return users.size();
    }

    @Override
    public int deleteUser(int id) {
        userDao.deleteUser(id);
        return id;
    }

    @Override
    public int deleteUsers(List<Integer> ids) {
        Iterator<Integer> id = ids.iterator();
        while (id.hasNext()) {
            deleteUser(id.next());
        }
        return ids.size();
    }

    @Override
    public User updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int updateUsers(List<User> users) {
        Iterator<User> user = users.iterator();
        while (user.hasNext()) {
            updateUser(user.next());
        }
        return users.size();
    }

}
