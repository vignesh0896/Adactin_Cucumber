@RegressionTest
Feature: Hotel Booking In Adactin Application
Scenario: User Login The Web Application
Given user Launch The Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page
@RegressionTest
Scenario: User Search The Hotel
When user Needs To Select The Location Of Their Chioce
And user Needs TO Select The Hotel Of Their Choice
And user Selects The Room Type 
And user Select The Total Number Of Rooms To Be Booked
And user Selects The Checkin Date
And user Selects The Checkout Date
And user Selects The Number Of Adults Per Room
And user Selects The Number Of Childrens Per Room
Then user Click The Search Button And It Navigates To Select Hotel Page
@RegressionTest
Scenario: User Confirming The Details Given 
When user Click The Radio Button By Confirming The Details 
Then user Click The Continue Button And It Navigates To Book A Hotel Page
@RegressionTest
Scenario: User Books The Hotel
When user Needs To Fill The First Name In The Text Field
And user Needs To Fill The Last Name In The Text Field
And user Needs To Fill The Billing Address Of Their Respective Location
And user Needs To Enter The Credit Card Number 
And user Needs To Select The Type Of Credit Card They Have
And user Needs To Fill The Expiry Date Of Their Card In Respective Field
And user Needs to Enter Their Cvv Number In The Card
Then user Click The Book Button And It Navigates To Booking Confirmation Page
@RegressionTest
Scenario: User Gets The Booking Confirmation Page
Then user On Clicking The Logoutbutton It Sucessfully Logouts From The Application 
   