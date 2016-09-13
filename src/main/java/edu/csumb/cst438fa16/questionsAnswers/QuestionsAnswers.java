package edu.csumb.cst438fa16.questionsAnswers;

import java.util.HashMap;
import java.util.Random;

public class QuestionsAnswers {
	/**
	* Maps question to answer.
	*/
	HashMap<String, String> questions = new HashMap<String, String>();
	
protected void put(String question, String answer){
	/**
	* Queries if question maps to answer.
	*  */
	questions.put(question, answer);
	
}
public boolean testAnswer(String question, String answer){
	/**
	* Gives out a random question from the key set. */
	
	for (String key : questions.keySet()) {
	    if (questions.get(key).contains(answer)) {
	        return true;
	    }
	}
	return false;
	
	}


public String getRandomQuestion(){
	

	Object[] randQuestion = questions.keySet().toArray();
	
	if(questions.size() > 0){
    Object key = randQuestion[new Random().nextInt(randQuestion.length)];
    // System.out.println(key);
     return (String) key;
	}
	return "Empty";
	
}
public Object match(String answer) {
	// TODO Auto-generated method stub
	return null;
}
}