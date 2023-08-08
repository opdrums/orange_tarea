Feature: Como automatizador requiero hacer el modulo del admin
  @orange @DeleteUser
  Scenario Outline: Eliminar usuario
    Given ingreso a la pagina  <Ambiente>
    When tomo las credenciales del usuario e ingreso las credenciales username y password
    When doy click en el menu lateral <menu>
    And ingreso la informacion del usuario doy click en buscar

    Examples:
      | Ambiente |menu|
      | CO |Admin|
