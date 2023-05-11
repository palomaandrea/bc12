Feature: Trenes
  Se realizaran una serie de busquedas desde la pagina principal de Rumbo.es


  @aut
  Scenario: Trenes - Busqueda de boletos de ida
    Given se encuentra en la seccion de trenes en la pagina Rumbo.es
    When se presiona el boton de solo ida
    And se completa el formulario de busqueda
    And se presiona el boton de buscar
    Then se muestra la pagina de resultados
  @aut
  Scenario: Trenes - Busqueda de boletos de ida y vuelta
    Given se encuentra en la seccion de trenes en la pagina Rumbo.es
    When se presiona el boton de solo ida y vuelta
    And se completa el formulario de busquedad
    And se presiona el boton de buscar
    Then se muestra la pagina de resultados
  @aut
  Scenario: Trenes - Busqueda de boletos mas baratos
    Given  se realizo la busqueda de pasajes de tren
    When se muestran las opciones
    And se presiona el boton de mas barato
    Then se muestra la pagina de resultados
  @aut
  Scenario: Trenes - Busqueda de boletos mas rapidos
    Given  se realizo la busqueda de pasajes de tren
    When se muestran las opciones
    And se presiona el boton de mas rapido
    Then se muestra la pagina de resultados
  @aut
  Scenario: Trenes - Error de pago
    Given se selecciono un pasaje
    When se muestra la pagina de pago
    And se completan incorrectamente los datos de pago
    Then no se puede llevar a cabo la compra
  @aut
  Scenario: Trenes - Error en datos de pasajeros
    Given se selecciono un pasaje
    When se muestra la pagina de pago
    And se completan incorrectamente los datos del pasajero
    Then no se puede llevar a cabo la compra


