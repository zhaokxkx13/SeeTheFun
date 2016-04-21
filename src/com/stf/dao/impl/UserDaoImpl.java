package com.stf.dao.impl;

import com.stf.dao.UserDao;
import com.stf.pojo.User;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhaokxkx13 on 2016/3/26.
 */
@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public void insertUser(User user) {
        super.getHibernateTemplate().persist(user);
    }

    @Override
    public void deleteUser(User user) {
        super.getHibernateTemplate().delete(user);
    }

    @Override
    public void updateUser(User user) {
        super.getHibernateTemplate().update(user);
    }

    @Override
    public User getUser(Integer id) {
       return  super.getHibernateTemplate().get(User.class,id);
    }

    @Override
    public User loadUser(Integer id) {
        return  super.getHibernateTemplate().load(User.class,id);
    }

    @Override
    public List<User> getUsers(Object... objects) {
        return null;
    }

    @Override
    public List<User> loadUsers(Object... objects) {
        return null;
    }
}
