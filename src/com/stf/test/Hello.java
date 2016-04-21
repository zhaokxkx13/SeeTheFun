package com.stf.test;

import org.springframework.stereotype.Repository;

/**
 * Created by zhaokxkx13 on 2016/3/16.
 */
@Repository
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

