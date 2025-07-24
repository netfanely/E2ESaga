Feature: Proceso de Checkout Simulado

  @e2e
  Scenario: Completar checkout con datos de prueba
    Given El usuario está en la página de checkout
    When Ingresa los datos de envío:
      | Campo       | Valor            |
      | Nombre      | Juan Perez       |
      | Dirección   | Av. Lima 123     |
      | Email       | juan@test.com    |
    And Confirma el pedido
    Then Debe ver el resumen de la compra
    And El total debe ser mayor que S/0