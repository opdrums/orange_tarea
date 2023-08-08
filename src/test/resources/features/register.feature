Feature: Yo como automatizador requiero crear usuarios

  @orange @register
  Scenario Outline: Crear usuario con el rol admin
    Given ingreso a la pagina  <Ambiente>
    When tomo las credenciales del usuario e ingreso las credenciales username y password
    When doy click en el menu lateral <menu>
    And seleccionar elemento de la lista del formulario <userrol> <userState> <empresa>
    And lleno los formularios de <nombre> <password> <comfirmarPassword>
    Then que se cree de la forma correcta

    Examples:
      | Ambiente | menu| userrol| userState| empresa| nombre| password| comfirmarPassword|
      | CO |Admin|2|2|1|test2|Test_123|Test_123|
