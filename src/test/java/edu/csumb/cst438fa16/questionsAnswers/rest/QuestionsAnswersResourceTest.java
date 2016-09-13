package edu.csumb.cst438fa16.questionsAnswers.rest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.*;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

/**
 * See:
 * https://jersey.java.net/documentation/latest/test-framework.html
 * https://jersey.java.net/apidocs/latest/jersey/index.html
 */
public class QuestionsAnswersResourceTest extends JerseyTest {
	
	//QuestionsAnswersResource test = 
	
	 @Override
	    protected Application configure() {
	        return new ResourceConfig(QuestionsAnswersResource.class);
	    }
	@Test
	public void testQuestion(){
		//testing the random question rest point
		WebTarget webTarget = target("randomQuestion");
        String thestart = webTarget.request().get(String.class);
        assertThat(thestart, anyOf(is("What is 5 + 10"),is("Which ocean is on the west of the US"),is("How many states are in the US")));
	}
	

	
	
}
