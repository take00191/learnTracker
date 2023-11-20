package com.example.demo;

import java.time.Duration;

public class LearningUtils {
	// コンストラクタをprivateにしてインスタンス化を防ぐ
    private LearningUtils() {
    }
    
	public static String convertLearingTime(Duration durationTime) {
        /**
         * learningDataから差分の時間を取得して、「？時間？分？秒」の形式にする
         * @param startTime 		学習開始時間
         * @param endTime  		学習終了時間
         * @return learningTime	？時間？分？秒
         */
    	long hours = durationTime.toHours();
        long minutes = durationTime.toMinutesPart();
        long seconds = durationTime.toSecondsPart();
        String stringTime = "";
        
        if (hours != 0) {
        	stringTime += hours + "時間";
        }
        if (minutes != 0) {
        	stringTime += minutes + "分";
        }
        if (seconds != 0) {
        	stringTime += seconds + "秒";
        }
        
        return stringTime;
    }
}
