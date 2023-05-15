Feature: Vuelos
  Se realizaran una serie de busquedas desde la pagina principal de Rumbo.es

  @aut
  Scenario: Vuelos - Busqueda de boletos de ida
    Given se encuentra en la seccion de vuelos en la pagina Rumbo.es
    When se presiona el boton de solo ida vuelos
    And se completa el formulario de busqueda vuelo
    And se presiona el boton de buscar vuelo
    Then se muestra la pagina de resultados
  @aut
  Scenario: Vuelos - Busqueda de boletos con fecha del dia
    Given se encuentra en la seccion de vuelos en la pagina Rumbo.es
    When se presiona el boton de solo ida vuelos
    And se completa el formulario de busqueda con la fecha actual
    And se presiona el boton de buscar vuelo
    Then se muestra la pagina de resultados
  @aut
  Scenario: Vuelos - Busqueda con campos de busqueda vacios
    Given se encuentra en la seccion de vuelos en la pagina Rumbo.es
    When se presiona el boton de solo ida vuelos
    And no se completa el formulario de busqueda
    And se presiona el boton de buscar vuelo
    Then no se lleva a cabo la busqueda de pasajes
  @aut
  Scenario: Vuelos - Busqueda de boletos sin escalas
    Given se encuentra en la seccion de vuelos en la pagina Rumbo.es
    When se presiona el boton de solo ida vuelos
    And se completa el formulario de busqueda con la fecha actual
    And se presiona el boton de buscar vuelo
    Then se presiona el boton de sin escalas

  @aut
  Scenario: Vuelos - Busqueda de boletos mas baratos
    Given  se realizo la busqueda de pasajes avion
    When se muestran las opciones
    And se presiona el boton de mas barato vuelo
    Then se muestra la pagina de resultados
  @aut
  Scenario: Vuelos - Busqueda de boletos con la mejor opcion
    Given  se realizo la busqueda de pasajes avion
    When se muestran las opciones
    And se presiona el boton de mejor opcion
    Then se muestra la pagina de resultados




