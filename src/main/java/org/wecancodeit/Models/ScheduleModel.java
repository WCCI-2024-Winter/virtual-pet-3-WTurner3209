package org.wecancodeit.Models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "t_scheduleModel")
public class ScheduleModel {
    @Id
    @GeneratedValue
    private long id;
    
    private long volunteerId;
    
    private long petId;
    
    private long taskId;

    private Date nextScheduleTime;

    public ScheduleModel() {
    }

    public ScheduleModel(long volunteerId, long petId, long taskId, Date nextScheduleTime) {

        this.volunteerId = volunteerId;
        this.petId = petId;
        this.taskId = taskId;
        this.nextScheduleTime = nextScheduleTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public long getVolunteerId() {
        return volunteerId;
    }

    public long getPetId() {
        return petId;
    }

    public long getTaskId() {
        return taskId;
    }

    public Date getNextScheduleTime() {
        return nextScheduleTime;
    }

    @Override
    public String toString() {
        return super.toString() + "ScheduleModel [id=" + id + ", volunteerId=" + volunteerId + ", petId=" + petId
                + ", taskId=" + taskId
                + ", nextScheduleTime=" + nextScheduleTime + "]";
    }

}
