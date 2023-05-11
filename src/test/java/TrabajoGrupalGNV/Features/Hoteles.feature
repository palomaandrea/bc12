Feature: Hotel
  Se realizaran una serie de busquedas desde la pagina principal de Rumbo.es

  @aut
  Scenario: Hotel - Busqueda de hotel
    Given se encuentra en la seccion de hotel en la pagina Rumbo.es
    When se completa el formulario de busqueda h
    And se presiona el boton de buscar h
    Then se muestra la pagina de resultados
  @aut
  Scenario: Hotel - Selecciona de un hotel
    Given se encuentra en la seccion de hotel en la pagina Rumbo.es
    When se completa el formulario de busqueda h
    And se presiona el boton de buscar h
    And se muestra la pagina de resultados
    Then se selecciona un hotel h
  @aut
  Scenario: Hotel - Falla en la busqueda del hotel
    Given se encuentra en la seccion de hotel en la pagina Rumbo.es
    When  no se completa el formulario de busqueda h
    And se presiona el boton de buscar h
    Then no se lleva a cabo la busqueda de hoteles
  @aut
  Scenario: Hotel - Falla en la reserva
    Given se selecciona un hotel
    When  se muestra la pagina de pagos
    And se completan incorrectamente los datos de pago
    Then no se puede llevar a cabo la compraf

  @aut
  Scenario: Hotel - Busqueda de hotel con filtro de cantidad maxima de estrellas
    Given se realizo la busqueda de hoteles
    When  se muestra la pagina de resultadosh
    And se selecciona el filtro max de estrellas
    Then se muestra la pagina de resultados
  @aut
  Scenario: Hotel - Busqueda de hotel con filtro de cantidad minima de estrellas
    Given se realizo la busqueda de hoteles
    When  se muestra la pagina de resultadosh
    And se selecciona el filtro min de estrellas
    Then se muestra la pagina de resultados






