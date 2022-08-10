Feature: Happy flow test

  Scenario: Account registration
    Given user is on home page
    When user clicks on sign in, user navigated to sign in page
    And user enter valid email and clicks on register
    Then user sees a registration form and fills it up
    And clicks on register

  @Smoke
  Scenario: Place an order
    Given user navigated to Home page and clicks sign in
    And sign in with valid credentials
    When user navigated to T-shirt block and hoverover on any T-shirt
    And user see Add to cart button and clicks on it
    And user should see a confirmation message and click to continue shopping
    Then user navigated to Home page and go to cart
    And place an order to end

  Scenario: Invalid credentials
    Given user navigated to Home page and clicks sign in
    When sign in with Invalid credentials
    Then user should see error message