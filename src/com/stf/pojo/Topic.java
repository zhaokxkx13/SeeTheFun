package com.stf.pojo;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by zhaokxkx13 on 2016/3/14.
 */
@Entity
public class Topic {
    private Integer id;
    private String name;
    private String video_url;
    private String audio_url;
    private String picture_url;
    private User holder;
    private Integer concerns;
    private Date submitDate;
    private String state;
    private String summarization;
    private String category;
    private Integer shareTimes;
    private Integer remarkTimes;
    private Integer likesTimes;
    private Integer dislikesTimes;
    private Date lastRemarkTime;
    private List<Remark> remarks;
    private List<OperationRecord> operationRecords;
    private List<User> concerners;


    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(nullable = false, length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    @Column
    public String getAudio_url() {
        return audio_url;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    @Column
    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    @ManyToOne(cascade =CascadeType.REFRESH)
    @JoinColumn(name = "myTopic", insertable = false, updatable = false)
    public User getHolder() {
        return holder;
    }

    public void setHolder(User owner) {
        this.holder = owner;
    }

    @Column(length = 10, nullable = false)
    public Integer getConcerns() {
        return concerns;
    }

    public void setConcerns(Integer concerns) {
        this.concerns = concerns;
    }

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    @Column(nullable = false)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(nullable = false)
    public String getSummarization() {
        return summarization;
    }

    public void setSummarization(String summarization) {
        this.summarization = summarization;
    }

    @Column(length = 20, nullable = false)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(length = 10, nullable = false)
    public Integer getShareTimes() {
        return shareTimes;
    }

    public void setShareTimes(Integer shareTimes) {
        this.shareTimes = shareTimes;
    }

    @Column(length = 10, nullable = false)
    public Integer getRemarkTimes() {
        return remarkTimes;
    }

    public void setRemarkTimes(Integer remarkTimes) {
        this.remarkTimes = remarkTimes;
    }

    @Column(length = 10, nullable = false)
    public Integer getLikesTimes() {
        return likesTimes;
    }

    public void setLikesTimes(Integer likesTimes) {
        this.likesTimes = likesTimes;
    }

    @Column(length = 10, nullable = false)
    public Integer getDislikesTimes() {
        return dislikesTimes;
    }

    public void setDislikesTimes(Integer dislikesTimes) {
        this.dislikesTimes = dislikesTimes;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    public Date getLastRemarkTime() {
        return lastRemarkTime;
    }

    public void setLastRemarkTime(Date lastRemarkTime) {
        this.lastRemarkTime = lastRemarkTime;
    }

    @OneToMany(mappedBy = "topic")
    public List<OperationRecord> getOperationRecords() {
        return operationRecords;
    }

    public void setOperationRecords(List<OperationRecord> operationRecords) {
        this.operationRecords = operationRecords;
    }

    @OneToMany(mappedBy = "topic")
    public List<Remark> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<Remark> remarks) {
        this.remarks = remarks;
    }

    @ManyToMany(cascade = CascadeType.REFRESH)
    @JoinTable(name = "user_topic")
    public List<User> getConcerners() {
        return concerners;
    }

    public void setConcerners(List<User> concerners) {
        this.concerners = concerners;
    }
}
