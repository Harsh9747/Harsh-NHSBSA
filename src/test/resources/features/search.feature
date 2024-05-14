Feature: As a jobSeeker on NHS Jobs website
  I want to search for a job with my preferences
  So that I can get recently posted job results

  @search
  Scenario Outline: Verify if user can search a job with my preferences with recently posted job results successfully
    Given I am a jobSeeker on NHS Jobs website
    When I put my "<job_preferences>" into the Search functionality
    Then I should get a list of jobs which matches my preferences
    And sort my search results with the newest Date Posted

    Examples:
      | job_preferences         |
      | Automation Test Analyst |
#      | Test Analyst            |
#      | Data Engineer           |
#      | Test Engineer           |
#      | SDET                    |
