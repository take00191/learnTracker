package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SettingRepository extends MongoRepository<SettingManager, String> {
//	ユーザーIDで設定データを取得する
	SettingManager findByUserID(int userID);
}
