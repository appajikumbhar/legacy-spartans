Feature: Login Action
    
      Background: 
        Given User is on Home Page
    
      Scenario Outline: Login with parameters
        When User enters "<UserName>" and "<Password>"
        Then User is able to Login Successfully
        When User LogOut from the Application
        Then Message displayed LogOut Successfully
        
    
        Examples: 
          | UserName  | Password |
          | mercury	  | mercury  |
          | mercury	  | mercury  |