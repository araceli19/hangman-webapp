  Feature: Hangman web page
   As a user I want to know what letter I typed. 

  Scenario: GuessesLetter
    Given I am on the hangman page
    When I entered "c"
    Then the letter should be read

    