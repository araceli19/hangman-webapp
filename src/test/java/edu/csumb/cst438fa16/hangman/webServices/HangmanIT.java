package edu.csumb.cst438fa16.hangman.webServices;



import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * User story:
 *
 *   As a user I want to know when I made the correct guess
 *  used mvn integration-test
 */
public class HangmanIT {
   
    WebDriver driver = new ChromeDriver();

    @Before
    public void setUp() {
        driver.get("http://localhost:8080/hangman.html");
    }

    @After
    public void tearDown() {
        driver.quit();
        // closes the browser
    }

    /**
     * Acceptance test:
     *
     *   Given I am on the hangman page
     *   When I enter "c"
     *   Then the letter should be read
     */
    
    
    @Test
        public void testGoodGuess() {
            driver.findElement(By.id("newGuesses")).sendKeys("c");
            driver.findElement(By.id("submit")).click();
            
            
            (new WebDriverWait(driver, 2))
            .until(ExpectedConditions.textToBe(By.id("oldGuesses"), "c"));
            
            // Success
      }
    
   
}
