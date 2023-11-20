package com.example.demo;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.RequestDate;

@RestController
@RequestMapping("/learning")
public class LearningController {
    private final LearningService learningService;

    public LearningController(LearningService learningService) {
        this.learningService = learningService;
    }

    @PostMapping("/")
    public  ResponseEntity<LearningDataManager> createLearningData(@RequestBody RequestDate requestDate) {
//    	新たにlearning_dataコレクションを作成して、連続した学習時間を管理するやつを作る
//		{ _id : ,  learning_time: [{ "learning_timeコレクションの_id":  , 休憩時間: },....]}
//    	requestに_idを追加して、持っていたら追加、持っていないならlearing_dataを作成する
//    	レスポンスに_idを追加する
    	int userID = requestDate.getUserID();
    	LocalDateTime startDate = requestDate.getStartDate();
    	LocalDateTime endDate = requestDate.getEndDate();
    	LearningDataManager learningData = learningService.createLearningData(userID, startDate, endDate);
    	
//    	LocalDate learningDate = startDate.toLocalDate(); // 今日の総学習時間を取得するために日付のみを取得
    	
    	
    	
//    	ResponseLearningTime response = new ResponseLearningTime();
//    	response.setMessage("Learning data created successfully");
//    	response.setLearningTime(learningData.getLearningTime());
    	
    	return ResponseEntity.ok(learningData);
        
    }

    @GetMapping("/search")
    public List<LearningDataManager> getSessionsByTimeRange(
    		@RequestParam(required = false) LocalDateTime lowerStartDate,
    		@RequestParam(required = false) LocalDateTime upperStartDate,
    		@RequestParam(required = false) LocalDateTime lowerEndDate,
    		@RequestParam(required = false) LocalDateTime upperEndDate,
    		@RequestParam(required = false) Integer lowerLearningTime,
    	    @RequestParam(required = false) Integer upperLearningTime) {
    	
    	
    	
        return learningService.getLearningData(
        		lowerStartDate, upperStartDate, lowerEndDate, upperEndDate, lowerLearningTime, upperLearningTime);
    }

    @DeleteMapping("/{sessionId}")
    public void deleteSession(@PathVariable String sessionId) {
        learningService.deleteLearningData(sessionId);
    }

    @PutMapping("/{sessionId}")
    public void updateSessionEndTime(@PathVariable String sessionId, @RequestParam LocalDateTime newStartTime, @RequestParam LocalDateTime newEndTime) {
        learningService.updateLearningData(sessionId, newStartTime, newEndTime);
    }
}
