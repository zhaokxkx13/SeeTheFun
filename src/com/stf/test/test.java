package com.stf.test;

import com.stf.dao.UserDao;
import com.stf.dao.impl.UserDaoImpl;
import com.stf.pojo.Topic;
import com.stf.pojo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Created by zhaokxkx13 on 2016/3/18.
 */
@ContextConfiguration("file:E:/SeeTheFun/web/WEB-INF/applicationContext.xml")
public class test extends AbstractJUnit4SpringContextTests{
    @Resource
    UserDaoImpl userDaoImpl;
    @Test
    public void test1(){
        System.out.print(userDaoImpl.getUser(1).getBirthday());
    }
}
