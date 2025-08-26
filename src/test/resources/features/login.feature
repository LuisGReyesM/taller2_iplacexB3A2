Feature: Login

  Scenario: Login exitoso
    Given el usuario ingresa su usuario "admin"
    When ingresa la contraseña "1234"
    Then accede al sistema

  Scenario Outline: Login fallido
    Given el usuario ingresa su usuario "<usuario>"
    When ingresa la contraseña "<password>"
    Then recibe un mensaje de error

    Examples:
      | usuario | password |
      | admin   | 0000     |
      | test    | 1234     |
