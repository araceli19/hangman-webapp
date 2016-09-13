package edu.csumb.cst438fa16.questionsAnswers.rest;


import edu.csumb.cst438fa16.questionsAnswers.QuestionsAnswers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Hangman REST service.
 *
 * See:
 * https://jersey.java.net/documentation/latest/jaxrs-resources.html
 */
@Path("")
public class QuestionsAnswersResource {
	
	private static QuestionsAnswers questions = new QuestionsAnswers(){{
		
		put("What is 5 + 10", "15");
		put("Which ocean is on the west of the US", "Pacific");
		put("How many states are in the US", "52");
	}};
	
	@GET
    @Path("/randomQuestion")
	public static String getQuestion(){
		
		return questions.getRandomQuestion();
	}
	
	@GET
    @Path("/testAnswer")
	 public Response match(
		        @QueryParam("question") String question,
		        @QueryParam("answer") String answer
		       // @QueryParam("newAnswer") String newAnswer
		       
		    ) {
			if (question == null || answer == null) {
		            return Response.status(Response.Status.BAD_REQUEST)
			                   .entity("requires query parameters " +
						   "question, answer")
				           .build();
		        }
			
			if (!questions.testAnswer(answer, question))
					return Response.status(Response.Status.BAD_REQUEST)
			                   .entity("question, answer " +
						   "don't match the answer")
				           .build();	
			else
				return Response.ok("Correct!").build();
	}
}
