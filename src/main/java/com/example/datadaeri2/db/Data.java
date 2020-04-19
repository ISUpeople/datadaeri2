package com.example.datadaeri2.db;

import org.springframework.data.annotation.Id;

public abstract class Data {

    @Id
    private String id;

    private String userId;//User id
    private int quality;
    private String date;
    private String task;//image, text, audio etc
    private String subTask;//object detection, q/a, voice recognition etc

    public void setUserId(String userId){
        this.userId = userId;
    }   

    public String getUserId(){
        return userId;
    }

    public void setQuality(int quality){
        this.quality = quality;
    }   

    public int getQuality(){
        return quality;
    }

    public void setDate(String date){
        this.date = date;
    }   

    public String getDate(){
        return date;
    }

    public void setTask(String task){
        this.task = task;
    }   

    public String getTask(){
        return task;
    }

    public void setSubTask(String subTask){
        this.subTask = subTask;
    }   

    public String getSubTask(){
        return subTask;
    }
}