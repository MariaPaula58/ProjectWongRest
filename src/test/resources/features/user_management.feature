Feature: User Management
  I want manage an user

  Scenario: create an user
    When I create an user
      | id | name  | email                     | gender | status | created_at                    | updated_at                    |
      | 01 | Maria | paulithaherrera@gmail.com | Female | Active | 2020-10-26T03:50:04.368+05:30 | 2020-10-26T03:50:04.368+05:30 |
    Then I sees the user created

  Scenario: search an user
    When I consult an user
      | id | name | email | gender | status | created_at | updated_at |
      | 01 |      |       |        |        |            |            |