package edu.csumb.cst438fa16.questionsAnswers;

import static org.junit.Assert.*;
import org.junit.Test;

public class QuestionsAnswersTest {
	
	QuestionsAnswers testQuestion = new QuestionsAnswers();
	
	@Test
	
	public void testAnswers() {
		//System.out.println(testQuestion.getRandomQuestion());
		
		assertEquals(false, testQuestion.testAnswer("What does HTML stand for", "Hypertext Markup Language"));
		//testQuestion.put("What does HTML stand for?", "Hypertext Markup Language");
		testQuestion.put("What is 5 + 10", "15");
		assertEquals(true, testQuestion.testAnswer("What is 5 + 10", "15"));
	}
	
	@Test
	public void testRandom(){
		

		testQuestion.put("What does HTML stand for", "Hypertext Markup Language");
		String test2 = testQuestion.getRandomQuestion();
	
		assertNotEquals("Empty", test2);
		assertEquals("What does HTML stand for", test2);
	}

}
