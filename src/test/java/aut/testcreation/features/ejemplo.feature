Feature:  busqueda simple google

  #1 criterio de aceptacion
  @aut
  Scenario: buscar algo en google
    Given que estoy en el sitio de google
    When selecciono la caja de busqueda
    And ingreso en la caja de busqueda el valor "algo"
    Then se despliega pagina con listado de coincidencias de busqueda