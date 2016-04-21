package com.stf.pojo;

import javax.persistence.*;
import java.util.List;

/**
 * Created by zhaokxkx13 on 2016/3/14.
 */
@Entity
public class Tendency {
    private Integer id;
    private String name;
    private String englishName;
    private List<User> users;

    @ManyToMany(mappedBy = "tendencies",cascade = CascadeType.REFRESH)
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(length = 30,nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(length = 30,nullable = false)
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
}
