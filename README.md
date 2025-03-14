# Sistema Registros Estudiantes
## Indice
1. [Descripción del proyecto](#descripcion_del_proyecto)
2. [Desarrollo](#desarrollo)
3. [Instrucciones para compilar y ejecutar el programa](#instrucciones_para_compilar_y_ejecutar_el_programa)
4. [Capturas de pantalla del programa en funcionamiento](#captura_de_pantalla_del_programa_en_funcionamiento)
5. [Enlace al repositorio de GitHub](#enlace_al_repositorio_de_github)



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

Este código define un arreglo para almacenar hasta 100 estudiantes, las variables para contar el número de estudiantes `numEstudiantes` y para capturar datos como nombre, matrícula y carrera. Se usa un `Scanner` para leer datos del usuario en la consola.

```sh
public class SistemaRegistroEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[100];
        int numEstudiantes=0, opcion;
        String nombre, matricula, carrera;
```

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
