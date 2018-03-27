Feature: ChatBox Scenarios

@Chatbox
  Scenario: Login to Prutopia Chat Box Application
    When User Login to Prutopia Application
    When User Navigates to Chatbox Window
    Then User Validates Elements in ChatBox Window

@LeaveBalance
  Scenario: User Request for Leave Balance
    When User Initiates Discusion with PruBuddy
    When User Request for  Leave Balance
    Then PruBuddy asks Job Level
    When User Enters Job Level
    Then PruBuddy asks for Term of Service
    When User Enter Term of Service
    Then PruBuddy Responds with Number of eligible leaves

@SharePrice
  Scenario: User Request for Share Price
   ## When User Initiates Discusion with PruBuddy
    When User Request for  Shares Eligibility
    Then PruBuddy responds about PRUSharePlus

@ParkingSlots
  Scenario: User Request for Parking Slots
   ## When User Initiates Discusion with PruBuddy
    When User Request for  Car Parking Slots
    Then PruBuddy responds about Available Parking Slots



