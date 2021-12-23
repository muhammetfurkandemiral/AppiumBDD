Feature:
  - Open app
  - Skip Splash Screen
  - Choose Gender
  - Choose Manuel Edit
  - Choose Face
  - Choose Hair
  - Choose Eye
  - Choose Beard for Boy
  - Click Notifications
  - Save Gallery and Verify

  Background: Skip Splash Screen
    Given Skip steps

  @test1 @all
  Scenario: Make Avatar for Boy
    Given Choose gender "boy"
    When Choose Manuel Edit
    When Choose Face
    Then Choose Hair
    And Choose Eye
    And Choose Beard
    And Click Notifications
    And Save Gallery and Verify

  @test2 @all
  Scenario: Make Avatar for Girl
    Given Choose gender "girl"
    When Choose Manuel Edit
    When Choose Face
    Then Choose Hair
    And Choose Eye
    And Click Notifications
    And Save Gallery and Verify
