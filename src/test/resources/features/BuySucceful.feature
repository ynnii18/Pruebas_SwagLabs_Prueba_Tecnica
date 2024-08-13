@Autor_Jennifer_Pacheco_Meza

@Compra
Feature: Como cliente de SwagLabs
  Quiero ingresar a la App desde el móvil
  Con el objetivo de realizar compras

  Background:
    Given Que Jose este en la app de SWAGLABS
    And Diligencie el formulario de ingreso con standard_user y secret_sauce

  Scenario Outline: Intento de compra exitosa en la app de swaglabs
    When  Quiero comprar un articulo
      | nombreArticulo   | NombreCheck   | ApellidoCheck   | CodPostalCheck   |
      | <nombreArticulo> | <NombreCheck> | <ApellidoCheck> | <CodPostalCheck> |
    Then  Vera el mensaje <msg_confCompra> en el Checkout

    Examples:
      | nombreArticulo      | NombreCheck | ApellidoCheck | CodPostalCheck | msg_confCompra        |
      | Mameluco Sauce Labs | Jennifer    | Pacheco       | 1111           | CHECKOUT: COMPLETADO! |