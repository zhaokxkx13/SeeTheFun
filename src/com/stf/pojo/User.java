package com.stf.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by zhaokxkx13 on 2016/3/14.
 */
@Entity
public class User {
    private Integer id;
    private String name;
    private String email;
    private String gender;
    private String password;
    private Date birthday;
    private String telephone;
    private List<User> friends;
    private List<Topic> myTopic;
    private List<Tendency> tendencies;
    private List<Remark> remarks;

    private List<ChattingRecord> sendChattingRecords;
    private ChattingRecord receiveChattingRecord;
    private List<Topic>myConcernTopics;


    @OneToMany(mappedBy = "fromWhom")
    public List<ChattingRecord> getSendChattingRecords() {
        return sendChattingRecords;
    }

    public void setSendChattingRecords(List<ChattingRecord> sendChattingRecords) {
        this.sendChattingRecords = sendChattingRecords;
    }
    @OneToOne(mappedBy = "toWhom")
    public ChattingRecord getReceiveChattingRecord() {
        return receiveChattingRecord;
    }

    public void setReceiveChattingRecord(ChattingRecord receiveChattingRecord) {
        this.receiveChattingRecord = receiveChattingRecord;
    }

    @ManyToMany(cascade = CascadeType.REFRESH)
    @JoinTable(name = "user_tendency")
    public List<Tendency> getTendencies() {
        return tendencies;
    }

    public void setTendencies(List<Tendency> tendencies) {
        this.tendencies = tendencies;
    }

    @OneToMany(mappedBy = "user",cascade = CascadeType.REFRESH )
    public List<Remark> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<Remark> remarks) {
        this.remarks = remarks;
    }



    @OneToMany(mappedBy = "holder",cascade = CascadeType.REFRESH)
    public List<Topic> getMyTopic() {
        return myTopic;
    }

    public void setMyTopic(List<Topic> myTopic) {
        this.myTopic = myTopic;
    }

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

    @Column(length = 50, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(length = 6, nullable = false)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(length = 16, nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(length = 255, nullable = false)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @ManyToMany()
    @JoinTable(name = "user_friend",
            joinColumns = {@JoinColumn(name = "user1")
            }, inverseJoinColumns = {@JoinColumn(name = "user2")})
    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> frirends) {
        this.friends = frirends;
    }

    @ManyToMany(mappedBy ="concerners")
    public List<Topic> getMyConcernTopics() {
        return myConcernTopics;
    }

    public void setMyConcernTopics(List<Topic> myConcernTopics) {
        this.myConcernTopics = myConcernTopics;
    }
}
