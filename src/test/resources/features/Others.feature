Feature: Others
Scenario:  Application Launch
When User Launch Prutopia Application
Then User should be able to  see Splash Screen with Prudential Logo
Then User can see Login Screen in Web Page

@LoginCheck
Scenario Outline: Wrong Credentials in Active Directory First Time
When User Enters User name <username>
When User enters Password <password>
When User Clicks on Login Button
Then User can see error Message for Invalid Credentials
Examples:
|username|password|
|  A      |    B    |
|   C     |    D    |

Scenario Outline: Empty Credentials in Active Directory First Time
When User Clicks on Login Button
Then User can see error Message for Invalid Credentials
Examples:
|username|password|
|        |        |
|        |        |


Scenario Outline: Positive Login in Active Directory
When User Enters User name <username>
When User enters Password <password>
When User Clicks on Login Button
Then User is navigated to Application MainScreen to see News Feed
Examples:
|username|password|
|        |        |
|        |        |


Scenario: User can Navigate to ChatPage from Main Application Page
When User Clicks on ChatBox Icon on Main Application Page
Then User is Navigated to Chat Box Application Page
Then User Exits Prutopia Application

Scenario: User Prompted for Face ID / Touch ID for second time Login
When User Launch Prutopia Application for second time
Then User is Prompted for Face ID/Touch ID