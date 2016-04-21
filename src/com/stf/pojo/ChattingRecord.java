package com.stf.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zhaokxkx13 on 2016/3/15.
 */
@Entity
public class ChattingRecord {
    private Integer id;
    private User fromWhom;
    private User toWhom;
    private Date time;
    private String content;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "sendChattingRecords")
    public User getFromWhom() {
        return fromWhom;
    }

    public void setFromWhom(User fromWhom) {
        this.fromWhom = fromWhom;
    }

    @OneToOne
    public User getToWhom() {
        return toWhom;
    }

    public void setToWhom(User toWhom) {
        this.toWhom = toWhom;
    }

    @Column(nullable = false)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
