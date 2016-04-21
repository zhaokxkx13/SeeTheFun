package com.stf.dao;

import com.stf.pojo.User;

import java.util.List;

/**
 * Created by zhaokxkx13 on 2016/3/26.
 */
public interface UserDao {
    void insertUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    User getUser(Integer id);
    User loadUser(Integer id);
    List<User> getUsers(Object... objects);
    List<User> loadUsers(Object... objects);//
}
