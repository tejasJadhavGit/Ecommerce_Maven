@Ecommerce
Feature: login system

 Background: 
 Given launching ecommerce site

@Test_001
Scenario Outline: login to ecommerce site

Then verifying home page is displayed
Then ckicked on login button
Then Entered valid email id "<Email_Address>"
Then entered valid password "<password>"
Then clicked on sign in button
Then Mouse Hover on Women Section
Then Click on Tshirt
Examples:
|Email_Address            |password|
|gorerevati91@gmail.com | gore@123  |

