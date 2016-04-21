package com.stf.pojo;

import javax.persistence.*;
import java.util.List;

/**
 * Created by zhaokxkx13 on 2016/3/14.
 */
@Entity
public class Manager {
    private Integer id;
    private String name;
    private String telephone;
    private String email;
    private Integer priviledge;
    private String password;
    private List<OperationRecord> operationRecordList;


    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(length = 50, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(length = 30, nullable = false)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Column(length = 50, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(length = 10, nullable = false)
    public Integer getPriviledge() {
        return priviledge;
    }

    public void setPriviledge(Integer priviledge) {
        this.priviledge = priviledge;
    }

    @Column(length = 255, nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToMany(mappedBy = "manager", cascade = CascadeType.REFRESH)
    public List<OperationRecord> getOperationRecordList() {
        return operationRecordList;
    }

    public void setOperationRecordList(List<OperationRecord> operationRecordList) {
        this.operationRecordList = operationRecordList;
    }
}
