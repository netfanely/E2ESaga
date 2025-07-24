# 🛒 Automatización E2E - Falabella Perú 

[![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=Selenium&logoColor=white)](https://selenium.dev)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![TestNG](https://img.shields.io/badge/TestNG-%23D00000.svg?style=for-the-badge)](https://testng.org)
[![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=for-the-badge&logo=github-actions&logoColor=white)](https://github.com/features/actions)

Proyecto de automatización web con Selenium que simula un flujo completo de compra en [sagafalabella.com.pe](https://www.sagafalabella.com.pe), incluyendo búsqueda de productos, añadido al carrito y checkout.

![Demo del Test](https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExcW0yN3V5Z3V5eWZ6Y2VjYzF6eGZ4a2RqY2Z6eGZ4a2RqY2Z6eGZ4a2RqY2Z6eGZ4a2Rq/giphy.gif) *(Reemplazar con tu GIF)*

## 📌 Funcionalidades Automatizadas
- ✅ Búsqueda y selección de 4 productos (zapatillas, monitor LG, Blu-ray, Nintendo Switch).
- ✅ Manejo dinámico de pop-ups (garantías, avisos de cookies).
- ✅ Validación del carrito de compras.
- ✅ Simulación de checkout con datos de prueba.
- 📊 Generación de reportes Allure.

## 🛠 Tecnologías Utilizadas
| Tecnología         | Uso                                                                 |
|--------------------|---------------------------------------------------------------------|
| Selenium WebDriver | Automatización del navegador.                                       |
| Page Object Model  | Diseño mantenible y escalable.                                      |
| TestNG             | Gestión de suites de pruebas y aserciones.                          |
| Maven              | Gestión de dependencias.                                            |
| GitHub Actions     | CI/CD para ejecución automática en pushes.                          |
| Allure Report      | Reportes visuales interactivos.                                     |

## ⚙️ Configuración
### Requisitos Previos
- Java JDK 11+
- Maven 3.8+
- ChromeDriver (compatible con tu versión de Chrome)

### Instalación
1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/automatizacion-falabella.git

    Instala dependencias:
    bash

    mvn clean install

🚀 Ejecución de Pruebas

    Ejecutar todos los tests:
    bash

mvn test

Ejecutar con Allure Report:
bash

    mvn test
    allure serve allure-results

📂 Estructura del Proyecto
text

/src
├── main/java/pages
│   ├── HomePage.java
│   ├── SearchPage.java
│   └── ... (otros POMs)
├── test/java/tests
│   └── E2ETest.java
├── resources
│   ├── config.properties
│   └── test-data.csv

📸 Capturas
Paso	Imagen
Búsqueda	https://screenshots/search.png
Carrito	https://screenshots/cart.png
🌟 Plus: CI/CD con GitHub Actions

El workflow .github/workflows/main.yml ejecuta las pruebas en cada push:
yaml

- name: Run Tests
  run: mvn test

📝 Problemas Comunes y Soluciones
Problema	Solución
Selectores dinámicos	Usar wait.until(ExpectedConditions)
Pop-ups inesperados	Añadir try-catch para manejarlos
Productos agotados	Implementar lógica de skip en el test
📬 Contribuciones

¡Issues y PRs son bienvenidos! Si encuentras un fallo o quieres mejorar el proyecto, sigue estos pasos:

    Haz fork del repositorio.

    Crea una rama con tu feature (git checkout -b feature/nueva-funcionalidad).

    Haz commit de tus cambios (git commit -m 'Añade X funcionalidad').

    Haz push a la rama (git push origin feature/nueva-funcionalidad).

    Abre un Pull Request.

📜 Licencia

MIT © FANNY PASTOR
