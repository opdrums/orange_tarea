Feature: Como automatizador quiero hacer test al modulo Pim
  @orange @RegisterUserPim
  Scenario Outline: agregar usuario pim con detalle de login
    Given ingreso a la pagina  <Ambiente>
    When tomo las credenciales del usuario e ingreso las credenciales username y password
    When doy click en el menu lateral <menu>
    When doy click en el boton agregar
    And lleno los formulario del usuario pim <firstPim> <middle> <last> <userPim> <password>
    Then evidenciar alerta de registro exitoso

    Examples:
      | Ambiente | menu| firstPim| middle| last| userPim| password|
      | CO | 2| omarorange| middleorange| lastorange| testorange+2| Qa_123123|

  @orange @RegisterUserPimNormal
  Scenario Outline: agregar usuario pim sin detalle de login
    Given ingreso a la pagina  <Ambiente>
    When tomo las credenciales del usuario e ingreso las credenciales username y password
    When doy click en el menu lateral <menu>
    When doy click en el boton agregar
    And lleno los formulario del usuario sin detalle del login <firstPim> <middle> <last>
    Then evidenciar alerta de registro exitoso

    Examples:
      | Ambiente | menu| firstPim| middle| last|
      | CO | 2| omarorange| middleorange| lastorange|


  @orange @EditUser
  Scenario Outline: seleccionar un usuario y dar click en el boton editar
    Given ingreso a la pagina  <Ambiente>
    When tomo las credenciales del usuario e ingreso las credenciales username y password
    When doy click en el menu lateral <menu>
    When busco al usuario pim

    Examples:
      | Ambiente | menu|
      | CO | 2|
