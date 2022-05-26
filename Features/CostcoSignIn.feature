Feature: Costco Sign In

In order to shop at Costco
As a user
I want to sign in

@CostcoSignIn_HappyPath

Scenario Outline:

Given user visit Costco home page
When user clicks on sign in/register
When user type valid "<email>" and "<password>" 
When user clicks on Sign In button
Then user will be able to sign in successfully 

Examples:
|email|password|
|tasnia.chowdhury@yahoo.com|abcdEgh1nh$|