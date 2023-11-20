package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "learning_time")
public class LearningDataManager {
    @Id
    private String id;
    private int userID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private long learningTimeSeconds;
    private int restTime;

    // ゲッターとセッター

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    
    public long getLearningTime() {
        return learningTimeSeconds;
    }

    public void setLearningTime(long learningTimeSeconds) {
        this.learningTimeSeconds = learningTimeSeconds;
    }
    

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }


}