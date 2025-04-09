[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/-JQrLgaz)
# 🧠 Trabajo Práctico: Sistema de Gestión de Vehículos (Java + SOLID + GitHub)

## 📌 Objetivo General

Desarrollar una aplicación en Java para gestionar vehículos de una empresa, aplicando los principios de programación orientada a objetos y los **primeros tres principios SOLID**:  
**SRP (Single Responsibility), OCP (Open/Closed) y LSP (Liskov Substitution)**.

A lo largo del trabajo se utilizará también la estructura `ArrayList` para manejar listas dinámicas de vehículos.

Además, deberán aplicar buenas prácticas de **gestión de proyectos usando GitHub**: `Issues`, `Milestones`, `Projects` y `Pull Requests`.

---

## 🧩 Tecnologías y Herramientas

- Java SE (cualquier versión compatible con JDK 8+)
- Git y GitHub
- GitHub Projects
- GitHub Issues
- GitHub Pull Requests

---

## 📘 Etapas del Trabajo

El trabajo está dividido en etapas. Cada etapa deberá registrarse como un **Milestone** en GitHub.

### Etapa 1: Clases Básicas
- Crear la clase `Vehiculo` con atributos: `patente`, `marca`, `año`, `capacidadCargaKg`.
- Agregar constructor, getters/setters y método `mostrarInformacion()`.
- Crear la clase `Main` que cree e imprima al menos 3 vehículos.

### Etapa 2: Aplicar SRP
- Extraer la responsabilidad de impresión a una nueva clase `VehiculoPrinter`.
- Eliminar el método `mostrarInformacion()` de `Vehiculo`.

### Etapa 3: Aplicar OCP
- Crear subclase `Camion` con atributo `tieneAcoplado`.
- Modificar `VehiculoPrinter` para imprimir camiones sin modificar el código existente (usar polimorfismo).

### Etapa 4: Aplicar LSP
- Crear subclase `Auto` con atributo `cantidadPasajeros`.
- Validar que se puedan tratar todos los vehículos desde una misma interfaz (`Vehiculo`).

### Etapa 5: Uso de ArrayList
- Usar `ArrayList<Vehiculo>` para gestionar todos los vehículos.
- Recorrer e imprimir usando `VehiculoPrinter`.
- (Opcional) Buscar por patente dentro de la lista.

---

## ✅ Entrega y Flujo de Trabajo con GitHub

Cada grupo debe:

1. Usar la asignación del repositorio compartido por Slack

2. **Proteger la rama main**:
   - Ir a Settings > Branches > Branch protection rules
   - Agregar regla para la rama `main`
   - Requerir que los tests pasen antes de mergear
   - No permitir push directo a main

3. Crear un **Project** nuevo tipo _Kanban_ con columnas:
   - `To Do`, `In Progress`, `In Review`, `Done`

4. Crear un **Milestone por etapa**:
   - `Etapa 1 - Clases básicas`
   - `Etapa 2 - SRP`
   - `Etapa 3 - OCP`
   - `Etapa 4 - LSP`
   - `Etapa 5 - ArrayList`

5. Crear **Issues** por cada tarea concreta, por ejemplo:
   - "Crear clase Vehiculo"
   - "Crear clase VehiculoPrinter"
   - "Crear subclase Camion"

   Cada Issue debe:
   - Tener un título claro y descripción breve
   - Estar asociado a un `Milestone` y al `Project`
   - Tener asignado al menos un miembro del equipo
   - Incluir labels apropiados (ej: `enhancement`, `bug`, `documentation`)
   - Ser implementado en una nueva rama (branch) creada desde `main`
   - La rama debe seguir el formato: `feature/descripcion-corta` o `fix/descripcion-corta`
   - Ser cerrado mediante un Pull Request (PR) que mergee la rama a `main`
   - Actualizar su estado en el Kanban board según corresponda

6. Hacer **Pull Requests** por cada Issue.
   - Cada PR debe mencionar el Issue que cierra (ej: `Closes #2`)
   - Debe incluir los mismos labels que el Issue asociado
   - Debe estar asociado al mismo Milestone que el Issue
   - Debe estar asociado al mismo Project que el Issue
   - El código debe estar revisado antes de ser fusionado a `main`
   - Al mergear, actualizar el estado del Issue en el Kanban board a `Done`

---

## ✅ Ejemplo de Issue

### Título
Crear clase Vehiculo

### Descripción
Implementar la clase base `Vehiculo` que servirá como punto de partida para la jerarquía de vehículos.

#### Requisitos
- Crear la clase con los siguientes atributos privados:
  ```java
  private String patente;
  private String marca;
  private int anio;
  private double capacidadCargaKg;
  ```
- Implementar:
  - Constructor con todos los atributos
  - Getters y setters para cada atributo
  - Método `mostrarInformacion()` que imprima todos los datos del vehículo

#### Validaciones
- La patente no puede ser null ni vacía
- El año debe ser mayor a 1900 y menor o igual al año actual
- La capacidad de carga debe ser positiva

#### Criterios de Aceptación
- [ ] La clase compila sin errores
- [ ] Se incluyen todos los atributos requeridos
- [ ] Se implementan todos los métodos necesarios
- [ ] Se incluyen las validaciones especificadas
- [ ] Se agrega documentación JavaDoc básica

#### Notas Adicionales
- Considerar agregar constantes para los valores mínimos/máximos
- Incluir mensajes de error descriptivos en las validaciones

### Labels
- `enhancement`
- `good first issue`

### Asignación
- Milestone: `Etapa 1 - Clases básicas`
- Project: `Sistema de Gestión de Vehículos`
- Estado: `To Do`

## ✅ Requisitos para la entrega final

- ✅ Todos los Issues cerrados
- ✅ Todos los Milestones completos
- ✅ Todos los PRs revisados y mergeados
- ✅ Project con todas las tareas en `Done`
- ✅ Este archivo `README.md` completo con:
  - Nombre y apellido del alumno
  - Instrucciones detalladas de cómo ejecutar el proyecto
  - Requisitos previos (JDK, IDE, etc.)
  - Pasos para compilar y ejecutar
  - Ejemplos de uso

> ⏰ **Fecha de vencimiento**: 09/04/2025 a las 13:00 hs

---

## 📝 Licencia

Este trabajo es parte del curso de Programación 2 de Ingeniería en Informática. Uso educativo únicamente.

---------

# Vehicle Management System

 **Alumno:** Juan Alejo Patiño

Este proyecto es una aplicación Java simple que permite gestionar una colección de vehículos, aplicando principios de programación orientada a objetos (POO) y buenas prácticas de desarrollo. Permite buscar vehículos por patente dentro de un ArrayList junto a la impresión de su información.

## ✅ Requisitos previos

Antes de compilar y ejecutar el proyecto, asegurate de tener instalado lo siguiente:

- **JDK 17** o superior  
  [Descargar JDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- **IDE recomendada:** IntelliJ IDEA, Eclipse, NetBeans o VS Code con soporte para Java
- Git (opcional, si se desea clonar el repositorio)

## 🔧 Instrucciones para compilar y ejecutar

1. Cloná el repositorio (si estás usando Git):
   ```bash
   git clone git@github.com:um-programacion-ii/programacion-2-trabajo-practico-1-JuanAlejoP.git
   cd programacion-2-trabajo-practico-1-JuanAlejoP
   ```

2. Abrí el proyecto con tu IDE favorita o compilá manualmente desde consola:
   ```bash
    cd /ruta/a/programacion-2-trabajo-practico-1-JuanAlejoP
    # 2. Compila el código
    javac *.java

    # 3. Ejecuta el programa
    java Main


   ```

3. El programa se ejecutará mostrando información de distintos vehículos y habilitando la funcionalidad de búsqueda por patente.

## 🚗 Ejemplos de uso

### Impresión de vehículos
Al ejecutar el programa, se crearán instancias de `Vehiculo`, `Auto` y `Camion`, y se imprimirá su información utilizando la clase `VehiculoPrinter`. Se aplican pruebas con datos inválidos para mostrar validaciones.

### Búsqueda por patente
El programa mostrará un menú al usuario con opciones para terminar la ejecución o buscar una patente dentro de la lista. Ejemplo de flujo:

```
--- MENÚ ---
1. Buscar vehículo por patente
0. Salir
Seleccione una opción: 1
Ingrese la patente del vehículo a buscar: LSP456
```

Si la patente no existe:

```
Vehículo no encontrado.

--- MENÚ ---
1. Buscar vehículo por patente
0. Salir
Seleccione una opción: 1
Ingrese la patente del vehículo a buscar: ABC123
=== Información del Vehículo ===
Patente: ABC123
Marca: Ford
Año: 2010
Capacidad de carga (kg): 1200.0
===============================

--- MENÚ ---
1. Buscar vehículo por patente
0. Salir
Seleccione una opción: 0
Saliendo del programa...
```

Se puede seguir buscando con `1` o escribir `0` para terminar el programa.

Lista con vehículos en el ArrayList que se pueden buscar:
```
vehiculo1 = new Vehiculo("ABC123", "Ford", 2010, 1200.0);
auto1 = new Auto("DEF456", "Toyota", 2020, 500.0, 5);
camion1 = new Camion("GHI789", "Mercedes", 2015, 2000.0, true);
```

## 📦 Estructura del proyecto

El proyecto incluye las siguientes clases principales:

- `Vehiculo`: Clase base con atributos comunes.
- `Auto`: Subclase con atributo de cantidad de pasajeros.
- `Camion`: Subclase con atributo de acoplado.
- `VehiculoPrinter`: Clase responsable de imprimir cualquier tipo de vehículo.
- `Main`: Clase principal donde se crean objetos y se ejecuta la lógica.

## 📘 JavaDocs

Todas las clases y métodos relevantes del proyecto están documentados con JavaDocs. La documentación incluye descripciones claras de atributos, constructores y métodos, así como las etiquetas `@param` y `@return` donde corresponde.

> Si tu IDE lo permite, podés generar la documentación automáticamente o navegarla desde el propio código.

## ✅ Estado del proyecto

- [x] Clases base y subclases creadas
- [x] Manejo de excepciones por datos inválidos
- [x] Aplicación de SRP, OCP, LSP
- [x] Uso de `ArrayList<Vehiculo>`
- [x] Búsqueda de vehículo por patente
- [x] Proyecto organizado en GitHub con Issues, PRs y Milestones