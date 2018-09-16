package po;

import java.util.HashMap;
import java.util.Map;

public class Exam {
	private Map<Integer, String> answerMap=new HashMap<Integer, String>();;

	public Map<Integer, String> getAnswerMap() {
		return answerMap;
	}

	public void setAnswerMap(Map<Integer, String> answerMap) {
		this.answerMap = answerMap;
	}
	
}
