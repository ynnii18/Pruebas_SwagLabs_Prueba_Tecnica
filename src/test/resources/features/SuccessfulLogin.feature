@Autor_Jennifer_Pacheco_Meza

@Login
Feature: Como cliente de SwagLabs
  Quiero ingresar a la App desde el móvil
  Con el objetivo de realizar compras

  Scenario Outline: Intento de realizar login exitoso en la App de SWAGLABS
    Given Que <nombre> este en la app de SWAGLABS
    When  Diligencie el formulario de ingreso con <user> y <pass>
    Then  Verá el mensaje de <msg_home>

    Examples:
      | nombre | user          | pass         | msg_home  |
      | Jose   | standard_user | secret_sauce | PRODUCTOS |
