package com.example.demo.response;

import java.time.Duration;

public class ResponseLearningTime {
	private String message;
    private Duration learningTime;
    
 // ゲッターとセッター
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public  Duration getLearningData() {
        return learningTime;
    }

    public void setLearningTime(Duration LearningTime) {
        this.learningTime = LearningTime;
    }
}
