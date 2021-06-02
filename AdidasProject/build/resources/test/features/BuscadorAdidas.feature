Feature: Buscador de productos

  Como ususario de Adidas
  Quiero elegir un producto
  y validar nombre

  Scenario Outline: Buscar producto en la pagina de Adidas y url <url>
    Given Me encuentro en la pagina de Adidas
    When Buscar un producto
    Then Ver el producto

    Examples:
      | Escenario                                    | Url |
      | Buscar palabra en el buscador de OLX exitoso | https://www.adidas.co/    |


