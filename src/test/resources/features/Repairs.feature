
Feature: Repairs Functionality

  Background:
    When user login with right "usernamePM2" and "password"
    When the user navigates to module "Repairs"

  @will
  Scenario: Creating Repair Orders
    Given the user should click create Button
    When the user creates a new Repair Order using following info

      | Product to Repair | [///] iphone 8 |
      | Customer          | James Hollaway |
      | Delivery Address  | DZone, UK      |
      | Product date      | 07/02/2020     |