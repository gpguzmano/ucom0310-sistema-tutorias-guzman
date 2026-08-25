# Diseño de Software - Sistema Tutorías

## Información general

- **Universidad:** Universidad de Especialidades Espíritu Santo
- **Carrera:** IngeniComputación
- **Asignatura:** Diseño de Software
- **Código:** UCOM0310
- **Periodo:** PEL 4 - 2026
- **Estudiante:** Gonzalo Guzmàn Ordòñez
- **Docente:** Ph.D. Jaime Paul Sayago Heredia

## Descripción

Una institución educativa desea implementar un Sistema de gestión de tutorías que centralice la publicación de horarios, las solicitudes de los estudiantes, la confirmación de las tutorías, las cancelaciones, la reprogramación, el historial y las notificaciones asociadas a cada cambio.
Actualmente se presentan dificultades como reservas duplicadas, poca visibilidad de la disponibilidad de los docentes, falta de confirmación y ausencia de un historial centralizado. El reto consiste en analizar este problema desde la perspectiva del diseño orientado a objetos.

## Objetivos

- Confirmar una reserva.
- Cancelar una reserva.
- Verificar disponibilidad.
- Enviar notificaciones.
- Evitar reservas duplicadas.

## Tecnologías

- Java 21
- Apache Maven 3.9.x
- Git y GitHub
- JUnit 5
- Spring Boot, cuando corresponda

## Requisitos previos

- JDK 21 instalado.
- Maven disponible en PATH.
- Git configurado.

## Instalación

```bash
git clone https://github.com/gpguzmano/ucom0310-sistema-tutorias-guzman.git
cd REPOSITORIO
mvn clean test
```

## Ejecución

```bash
mvn package
java -jar target/NOMBRE-DEL-ARCHIVO.jar
```

Adapte los comandos de ejecución a la estructura real del proyecto.

## Estructura del proyecto

```text
src/
├── main/
│   └── java/
│       └── edu/uees/tutorias/
│           └── domain/
│           └── infrastructure/
│           └── usecase/
│── test/
│   └── java/
docs/
│──modelo-clases.png
│──modelo-clases.puml
pom.xml
README.md
```

## Funcionalidades

- Funcionalidad implementada 1.
- Funcionalidad implementada 2.
- Funcionalidad pendiente.

## Pruebas

Para ejecutar las pruebas:

```bash
mvn clean test
```

## Control de versiones

El proyecto utiliza la rama `main`. Las funcionalidades se desarrollan en ramas específicas y se integran mediante revisión.

## Evidencias

## Uso de inteligencia artificial

Indique si utilizó herramientas de inteligencia artificial, la herramienta empleada, el propósito y las partes revisadas o adaptadas. El estudiante es responsable de comprender, probar y justificar todo el contenido entregado.

## Autor

Gonzalo Guzmàn Ordòñez - gonzalo.guzman@uees.edu.ec
