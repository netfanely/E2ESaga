Feature: Búsqueda y Selección de Productos en Falabella Perú

  Background:
    Given El usuario está en la página de inicio de Falabella Perú

  @regression
  Scenario: Buscar y agregar "Zapatillas Nike" al carrito
    When El usuario busca el producto "Zapatillas Nike"
    And Selecciona el primer resultado de búsqueda
    And Agrega el producto al carrito
    Then Debe aparecer un mensaje de confirmación

  @regression
  Scenario Outline: Agregar múltiples productos al carrito
    When El usuario busca el producto "<producto>"
    And Selecciona el primer resultado de búsqueda
    And Agrega el producto al carrito
    Then El carrito debe mostrar "<cantidad>" items

    Examples:
      | producto            | cantidad |
      | Monitor LG 24"      | 1        |
      | Blu-ray Sony        | 2        |
      | Nintendo Switch OLED| 3        |