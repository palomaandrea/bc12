Feature: Busquedas de vuelos en rumboes
  Se realizaran una serie de busquedas desde el sitio rumboes

  @aut
  Scenario: Buscar Vuelo - ida y vuelta - Por mas barato
    Given que estoy en el Home de rumboes
    When selecciono vuelos
    Then me lleva a la pagina de vuelos
    When selecciono la opcion ida y vuelta
    And escribo el lugar de origen y destino
    And selecciono la fecha de ida y vuela
    And selecciono la cantidad de pasajeros
    And presiono el boton buscar
    Then me lleva a la pagina de resultados