# Sistema Registros Estudiantes
## Indice
1. [Descripción del proyecto](#descripcion_del_proyecto)
2. 



## **Descripción del Proyecto**
Este proyecto consiste en el desarrollo de un programa en Java para la gestión de registros de estudiantes, permitiendo registrar, buscar, listar y eliminar estudiantes mediante una interfaz de línea de comandos.<br> Cada estudiante es identificado por su nombre, edad, matrícula y carrera.<br>
La práctica reforzará conocimientos en estructuras de control, manejo de arreglos y uso de la clase `Scanner` para la entrada de datos.

## **Funcionalidades**
1. Registrar nuevos estudiantes.
2. Mostrar la lista de estudiantes registrados.
3. Buscar un estudiante por matrícula.
4. Eliminar un estudiante de la lista.
5. Salir del programa.

# Menú
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
