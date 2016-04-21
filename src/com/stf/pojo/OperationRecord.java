package com.stf.pojo;

import javax.persistence.*;

/**
 * Created by zhaokxkx13 on 2016/3/14.
 */
@Entity
public class OperationRecord {
    private Integer id;
    private Manager manager;
    private Topic topic;
    private Integer operationType;
    private Integer operationDate;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "operationRecordList")
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name="operationRecords")
    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public Integer getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Integer operationDate) {
        this.operationDate = operationDate;
    }
}
