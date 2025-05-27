# Back-SV-Inventory CareConnect

## Descripción
El servicio `back-sv-inventory` es un componente del sistema CareConnect, desarrollado para el Hospital Universitario San Ignacio. Gestiona actividades médicas (e.g., procedimientos o tratamientos) utilizadas en visitas domiciliarias, permitiendo su registro, consulta y eliminación. Se integra con otros módulos a través de un API Gateway, soportando el portal web y la app móvil para la planificación y ejecución de visitas.

## Funcionalidades
- **Gestión de Actividades**: Registro (`POST /actividad/registrar-actividad`), consulta (`GET /actividad/ver-actividades`), y eliminación lógica (`PATCH /actividad/eliminar/{id}`).
- **Integración**: Conexión con API Gateway para interactuar con servicios de pacientes, visitas y suministros.

## Tecnologías
- **Framework**: Spring Boot
- **Lenguaje**: Java 17
- **Base de Datos**: PostgreSQL
- **Dependencias Clave**:
  - `spring-boot-starter-web`
  - `spring-boot-starter-data-jpa`
  - `postgresql`

## Requisitos
- Java 17
- Maven 3.8+
- PostgreSQL
- API Gateway activo
- Archivo `application.properties`:
  ```
  spring.datasource.url=jdbc:postgresql://localhost:5432/careconnect
  spring.datasource.username=your_user
  spring.datasource.password=your_password
  server.port=8087
  ```

## Instalación
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/careconnect/back-sv-inventory.git
   cd back-sv-inventory
   ```

2. Configurar `application.properties` con las credenciales de la base de datos.

3. Compilar e instalar dependencias:
   ```bash
   mvn clean install
   ```

4. Iniciar el servicio:
   ```bash
   mvn spring-boot:run
   ```

   Disponible en `http://localhost:8087`, accesible vía API Gateway.

## Uso
- **Endpoints** (prefijo `/actividad`):
  - Registrar actividad: `POST http://localhost:8080/api/actividad/registrar-actividad`
  - Consultar actividades: `GET http://localhost:8080/api/actividad/ver-actividades`
  - Eliminar actividad: `PATCH http://localhost:8080/api/actividad/eliminar/{id}`
- **Autenticación**: Gestionada por el API Gateway (e.g., JWT).
- **Ejemplo**:
  ```bash
  curl -X POST "http://localhost:8080/api/actividad/registrar-actividad" -H "Content-Type: application/json" -d '{"name": "Administración de insulina", "descripcion": "Inyección subcutánea"}'
  ```
  
## Autoría
- Juan David González
- Lina María Salamanca
- Laura Alexandra Rodríguez
- Axel Nicolás Caro

**Pontificia Universidad Javeriana**  
**Mayo 26, 2025**