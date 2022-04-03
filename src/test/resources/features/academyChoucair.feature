#Autor: KIMBERLY GARCES

  @stories
  Feature: Academy Choucair
    As a user I want to automate in screamplay for technical test in choucair
    @scenario1
    Scenario Outline: User register
      Given The user wants to register a new user on the platform
      When FThe user enters the registration data
        |name|last|address|email|phone|languages|country|year|mont|day|password|password_confim|
        |<name>|<last>|<address>|<email>|<phone>|<languages>|<country>|<year>|<mont>|<day>|<password>|<password_confim>|

      Then  End user registration
        |str_respuestafinal|
        |<str_respuestafinal>|


      Examples:
        |name|last|address|email|phone|languages|country|year|mont|day|password|password_confim|str_respuestafinal|
        |kim|garces|cra4D#96-12|kim@mail|1234567891|Bulgarian|Colombia|1994|December|5|1234|1234|- Double Click on Edit Icon to EDIT the Table Row.|

