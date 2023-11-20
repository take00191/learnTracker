package com.example.demo.request;

public class RequestSetting {
	private int userID;
    private int concentrationTime;
    private int openTime;
    private int targetTime;

    // ゲッターとセッター
//    ユーザーが複数に対応した際はユーザーIDに変更する　※現在は仮の値
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
