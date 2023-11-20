package com.example.demo.request;
import java.time.Duration;
import java.time.LocalDateTime;

public class RequestDate {
	private int userID;
	private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Duration learningTime;

    // ゲッターとセッター
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate.withNano(0);
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate.withNano(0);
    }

    public Duration getLearningTime() {
        return learningTime;
    }

    public void setLearningTime(Duration learningTime) {
        this.learningTime = learningTime;
    }
}
