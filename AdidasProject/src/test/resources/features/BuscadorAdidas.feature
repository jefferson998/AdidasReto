Feature: Buscador de productos

  Como ususario de Adidas
  Quiero elegir un producto
  y validar nombre

  Scenario Outline:  <Escenario>
    Given Me encuentro en la pagina de Adidas url <url>
    When Buscar un producto, ver y validar
    Then cerrar browser

    Examples:
      | Escenario                                      | url                    |
      | Buscar producto en la pagina de Adidas exitoso | https://www.adidas.co/ |


