# Sistema Registros Estudiantes
## Indice
1. [Descripción del proyecto](#descripcion_del_proyecto)
2. [Desarrollo](#desarrollo)
3. [Instrucciones para compilar y ejecutar el programa](#instrucciones_para_compilar_y_ejecutar_el_programa)
4. [Capturas de pantalla del programa en funcionamiento](#capturas_de_pantalla_del_programa_en_funcionamiento)
5. [Enlace al repositorio de GitHub](#enlace_al_repositorio_de_GitHub)



## **Descripción del Proyecto**
Este proyecto consiste en el desarrollo de un programa en Java para la gestión de registros de estudiantes, permitiendo registrar, buscar, listar y eliminar estudiantes mediante una interfaz de línea de comandos.<br> Cada estudiante es identificado por su nombre, edad, matrícula y carrera.<br>
La práctica reforzará conocimientos en estructuras de control, manejo de arreglos y uso de la clase `Scanner` para la entrada de datos.

### **Funcionalidades**
1. Registrar nuevos estudiantes.
2. Mostrar la lista de estudiantes registrados.
3. Buscar un estudiante por matrícula.
4. Eliminar un estudiante de la lista.
5. Salir del programa.
# Desarrollo
## Menú
En está parte se muestra la realización del menú junto a sus opciones.

```sh
System.out.println("\n--- Sistema de Registro de Estudiantes ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante por matrícula");
            System.out.println("4. Eliminar estudiante");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
```
## **Estructura del Código y Explicación**

### **Clase `Estudiante`**
```java
class Estudiante {
    String nombre;
    int edad;
    String matricula;
    String carrera;
}
```
Esta clase representa a un estudiante con cuatro atributos esenciales:
- `nombre`: Nombre completo del estudiante.
- `edad`: Edad del estudiante.
- `matricula`: Número de matrícula que identifica al estudiante.
- `carrera`: Carrera en la que está inscrito.

### **Método `mostrarEstudiantes`**
```java
public static void mostrarEstudiantes(Estudiante[] estudiantes) {
    for (Estudiante estudiante : estudiantes) {
        if (estudiante != null) {
            System.out.println("Nombre: " + estudiante.nombre);
            System.out.println("Edad: " + estudiante.edad);
            System.out.println("Matrícula: " + estudiante.matricula);
            System.out.println("Carrera: " + estudiante.carrera);
            System.out.println("--------------------------");
        }
    }
}
```
Este método recorre el arreglo de estudiantes e imprime la información de cada uno. Además, omite los valores `null` para evitar errores en la ejecución.

### **Método `eliminarEstudiante`**
```java
public static int eliminarEstudiante(Estudiante[] estudiantes, int numEstudiantes, String matricula) {
    for (int i = 0; i < numEstudiantes; i++) {
        if (estudiantes[i].matricula.equals(matricula)) {
            for (int j = i; j < numEstudiantes - 1; j++) {
                estudiantes[j] = estudiantes[j + 1];
            }
            estudiantes[numEstudiantes - 1] = null;
            System.out.println("Estudiante eliminado exitosamente.");
            return numEstudiantes - 1;
        }
    }
    System.out.println("No se encontró ningún estudiante con esa matrícula.");
    return numEstudiantes;
}
```
Este método busca a un estudiante por su matrícula y lo elimina del arreglo, reorganizando los elementos restantes para mantener la integridad de la lista.

### **Método `registrarEstudiante`**
```java
if (numEstudiantes < 100) {
    Estudiante nuevo = new Estudiante();
    System.out.print("Ingrese el nombre: ");
    nuevo.nombre = scanner.nextLine();
    System.out.print("Ingrese la edad: ");
    nuevo.edad = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer
    System.out.print("Ingrese la matrícula: ");
    nuevo.matricula = scanner.nextLine();
    System.out.print("Ingrese la carrera: ");
    nuevo.carrera = scanner.nextLine();

    estudiantes[numEstudiantes] = nuevo;
    numEstudiantes++;
    System.out.println("Estudiante registrado exitosamente.");
} else {
    System.out.println("No se pueden registrar más estudiantes.");
}
```
Este bloque de código permite registrar nuevos estudiantes en el sistema, asegurando que no se supere el límite de 100 registros.

### **Búsqueda de Estudiante por Matrícula**
```java
System.out.print("Ingrese la matrícula del estudiante: ");
matricula = scanner.nextLine();
int encontrado = 0;
for (int i = 0; i < numEstudiantes; i++) {
    if (estudiantes[i] != null && estudiantes[i].matricula.equals(matricula)) {
        System.out.println("Nombre: " + estudiantes[i].nombre);
        System.out.println("Edad: " + estudiantes[i].edad);
        System.out.println("Carrera: " + estudiantes[i].carrera);
        encontrado = 1;
        break;
    }
}
if (encontrado == 0) {
    System.out.println("No se encontró ningún estudiante con esa matrícula.");
}
```
En este bloque de código:
1. Se solicita al usuario ingresar la matrícula del estudiante a buscar.
2. Se recorre la lista de estudiantes evitando valores `null`.
3. Se compara la matrícula ingresada con las matrículas almacenadas.
4. Si hay coincidencia, se muestran los datos del estudiante.
5. Si no se encuentra, se notifica al usuario.


# Instrucciones para compilar y ejecutar el programa
Para compilar el programa, utiliza el siguiente comando:

 **Compilar**:
   - Usa el comando `javac` para compilar. Ejemplo:<br>
     ```
     javac SistemaRegistroEstudiantes.java
     ```
   - Esto generará un archivo `SistemaRegistroEstudiantes.class` en el mismo directorio si el código no tiene errores.

 **Ejecutar**:
   - Una vez compilado, ejecuta el archivo `.class` con el comando `java` (sin la extensión `.class`):<br>
     ```
     java SistemaRegistroEstudiante
     ```


# Capturas de pantalla del programa en funcionamiento


# Enlace al repositorio de GitHub 

[https://github.com/GabrielGuerraRuiz/SistemaRegistrosEstudiantes/issues](https://github.com/GabrielGuerraRuiz/SistemaRegistrosEstudiantes)
