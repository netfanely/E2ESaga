Feature: Validación del Carrito de Compras

  @smoke
  Scenario: Verificar items en el carrito
    Given El usuario ha agregado 4 productos al carrito
    When Accede al carrito de compras
    Then El sistema debe mostrar 4 items en el resumen
    And El usuario procede al checkout