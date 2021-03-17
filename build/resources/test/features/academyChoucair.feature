#Autor: Ramses Camilo Torres
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Chourcair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Camilo wants to learn automation at the academy Choucair
    | strUser  | strPassword |
    | 1085292335| Choucair2021* |
    When he search for the course on the choucair academy platform
    | strCourse               |
    |Metodologia Bancolombia  |
    Then he finds the course called
    | strCourse                |
    |Metodologia Bancolombia   |