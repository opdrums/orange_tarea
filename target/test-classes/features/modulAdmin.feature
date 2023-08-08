Feature: Como automatizador requiero hacer el modulo del admin
  @orange @DeleteUser
  Scenario Outline: Eliminar usuario
    Given ingreso a la pagina  <Ambiente>
    When ingreso las credenciales <Name> y <password>
    When doy click en el menu lateral <menu>
    And ingreso la informacion del usuario doy click en buscar

    Examples:
      | Ambiente |Name |password|menu|
      | CO |Admin|admin123|Admin|
