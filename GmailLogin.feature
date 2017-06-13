@testGmail 
Feature: validate Gmail site is working 

Background: 
	Given I am at the Login screen 
	#    And I am logged into the application with valid credentials
	#    And Already opened Asset should get closed
	
	
@CreatePolicyName 
Scenario Outline: verify gmail accounts 
	And I enter EmailID as <emailID> 
	
	Examples: 
		| emailID          | Password|
		| chandrahasm2010@gmail.com  |Pass@1389  |
		| rama.mullamgi@gmail.com  |Pass@1389  |

	
#@CreatePolicyName 
#Scenario: verify gmail accounts 
#	And I enter EmailID as chandrahasm2010@gmail.com	
		