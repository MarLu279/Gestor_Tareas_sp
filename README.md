🗂️ Gestor de Tareas - Spring Boot

Proyecto en desarrollo. Es una aplicación backend que permite gestionar tareas utilizando Java y Spring Boot. Actualmente incluye las funcionalidades básicas de un CRUD en memoria.

---

## 🚀 Tecnologías utilizadas

- ☕ Java 21
- 🌱 Spring Boot 3.5.4
- 📦 Maven
- 🧱 Arquitectura MVC

---

## 📁 Estructura del proyecto

📦 GestorTareasSp

    ┣ 📂 modelo
    ┃ ┗ 📜 Tarea.java
    ┣ 📂 controlador
    ┃ ┗ 📜 TareaControlador.java
    ┗ 📜 GestorTareasSpApplication.java
---

## ✅ Funcionalidades actuales

- ✏️ Crear tareas
- 📋 Listar tareas
- 🔎 Buscar tarea por ID
- 📝 Actualizar tarea
- ❌ Eliminar tarea

---
## 🔌 Endpoints

| Método | Ruta                                             | Descripción               |
|--------|--------------------------------------------------|---------------------------|
| POST   | `/api/tareas`                                    | Crear crear tarea         |
| GET    | `/api/tareas`                                    | Obtener listado de tareas |
| GET    | `/api/tareas/{id}`                               | Obtener tarea por id      |
| PUT    | `/api/tareas/{id}`                               | Actualizar tarea          |
| DELETE | `/api/tareas/{id}`                               | Eliminar tarea            |

---
## 🚧 En desarrollo

- 🗄️ Integración con base de datos (JPA/H2/MySQL)
- 🛡️ Validación de datos (Spring Validation)
- 🔐 Autenticación básica (Spring Security, si se considera necesaria más adelante)

> 🔧 *Nota: Este proyecto está enfocado por ahora únicamente en la lógica de backend. La capa de frontend se implementará en una fase posterior.*

---

## ⚙️ Cómo ejecutar el proyecto

1. 📥 Clona este repositorio:
   ```bash
   git clone https://github.com/MarLu279/Gestor_Tareas_sp.git
   
2. 📂 Accede al directorio del proyecto:
    ```bash
    cd Gestor_Tareas_sp

3. ▶️ Ejecuta la aplicación con Maven Wrapper:
    ```bash
    ./mvnw spring-boot:run

4. 🌐 Abre en tu navegador:
    ```bash
    http://localhost:8080

👤 Autor
Marco
🔗 GitHub: MarLu279