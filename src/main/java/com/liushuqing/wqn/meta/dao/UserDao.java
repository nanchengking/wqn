/**
 * 
 */
package com.liushuqing.wqn.meta.dao;

import java.util.List;

import com.liushuqing.wqn.meta.entity.User;

/**
 * @author nancheng
 *
 */
public interface UserDao {
    /**
     * 插入一个user
     * 
     * @param user
     * @return 插入的user的id
     */
    public int insertUser(User user);

    /**
     * 插入一系列user
     * 
     * @param user
     * @return 一共插入的多少个user
     */
    public int insertUsers(List<User> user);

    /**
     * 删除一个user
     * 
     * @param id
     * @return 删除的user的id
     */
    public int deleteUser(int id);

    /**
     * 删除一系列user
     * 
     * @param id
     * @return 一共成功删除了多少
     */
    public int deleteUsers(List<Integer> id);

    /**
     * 更新一个user
     * 
     * @param user
     * @return
     */
    public User updateUser(User user);

    /**
     * 更新一系列user
     * 
     * @param users
     * @return 成功更新了多少个
     */
    public int updateUsers(List<User> users);
}
