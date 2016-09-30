package feature.webclient;


import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HangmanWebSteps {
	WebDriver driver = new ChromeDriver();

    @After
    public void tearDown() {
        driver.quit(); // close browser
    }

    @Given("^I am on the (\\w+) page$")
    public void i_am_on_the_hangman_page(String nameOfPage) throws Throwable {
        driver.get("http://localhost:8080/" + nameOfPage + ".html");
    }

    
   
    @When("^I entered \"([^\"]*)\"$")
    public void i_entered(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    	driver.findElement(By.id("newGuesses")).sendKeys(arg1);
          driver.findElement(By.id("submit")).click();
         
    }
    

    @Then("^the letter should be read$")
    public void the_letter_should_be_read() throws Throwable {
    	 driver.get("http://localhost:8080/hangman.html");
    	      assert(driver.findElement(By.id("mainGuess")).getText().equals("Letter"));
    }
    
  
  
}
