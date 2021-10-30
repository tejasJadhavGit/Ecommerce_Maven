@Ecommerce
Feature: login system

@Test_001
Scenario Outline: login to ecommerce site
Given launching ecommerce site
Then verifying home page is displayed
Then ckicked on login button
Then Entered valid email id "<Email_Address>"
Then entered valid password "<password>"
Then clicked on sign in button
Examples:
|Email_Address            |password|
|gorerevati91@gmail.com | gore@123  |