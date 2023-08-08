Feature: Como automatizador requiero hacer login

  @orange @login
  Scenario Outline: Hacer login tomando las credenciales de la pagina
    Given ingreso a la pagina  <Ambiente>
    When tomo las credenciales del usuario e ingreso las credenciales username y password
    Then visualizar el nombre del usuario
    Examples:
      | Ambiente |
      | CO |

  @orange @loginCredential
    Scenario Outline: Hacer login con credenciales
    Given ingreso a la pagina  <Ambiente>
    When ingreso las credenciales <Name> y <password>
    Then visualizar el nombre del usuario
    Examples:
      | Ambiente |Name |password|
      | CO |Admin|admin123|
