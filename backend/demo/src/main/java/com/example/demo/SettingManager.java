package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "setting")
public class SettingManager {
    @Id
    private String id;
    private int userID;
    private int concentrationTime;
    private int openTime;
    private int targetTime;

    // ゲッターとセッター

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getConcentrationTime() {
        return concentrationTime;
    }

    public void setConcentrationTime(int concentrationTime) {
        this.concentrationTime = concentrationTime;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }
    
    public int getTargetTime() {
        return targetTime;
    }

    public void setTargetTime(int targetTime) {
        this.targetTime = targetTime;
    }
}
