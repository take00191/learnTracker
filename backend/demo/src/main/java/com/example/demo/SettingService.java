package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SettingService {
	private final SettingRepository settingRepository;
	
	public SettingService( SettingRepository settingRepository) {
        this.settingRepository = settingRepository;
    }
	
	public SettingManager getSettingData(int userID) {
		/**
		 * 時間設定の値を取得する
		 * @param userID ユーザーID
		 * @return 時間設定情報
		 * */
    	SettingManager settingManager = new SettingManager();
        settingManager.setUserID(userID);
        SettingManager  settingData= settingRepository.findByUserID(userID);
        return settingData;
    }
    
    public  SettingManager updateSettingData(int userID, int concentrationTime, int openTime, int targetTime) {
    	/**
		 * 時間設定の値を更新する
		 * @param userID ユーザーID
		 * @param concentrationTime 学習時間
		 * @return 時間設定情報
		 * */
        SettingManager settingData = getSettingData(userID);
        if (settingData != null) {
        	settingData.setConcentrationTime(concentrationTime);
            settingData.setOpenTime(openTime);
            settingData.setTargetTime(targetTime);
        } else {
//        	ユーザーが存在しませんのエラーを後で書く
        }
        return settingRepository.save(settingData);
    }
}
