package sistemaregistroestudiantes;

import java.util.Scanner;

class Estudiante {
    String nombre;
    int edad;
    String matricula;
    String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String matricula, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    /*
    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("--------------------------");
    }
    */
}

public class SistemaRegistroEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[100];
        int numEstudiantes = 0, opcion;

        do {
            System.out.println("\n--- Sistema de Registro de Estudiantes ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante por matrícula");
            System.out.println("4. Eliminar estudiante");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Registrar estudiante
                    if (numEstudiantes < estudiantes.length) {
                        estudiantes[numEstudiantes] = RegistrarEstudiante.registrarEstudiante(scanner);
                        numEstudiantes++;
                        System.out.println("Estudiante registrado con éxito.");
                    } else {
                        System.out.println("No se pueden registrar más estudiantes. Capacidad máxima alcanzada.");
                    }
                    break;

                case 2:
                    /*
                    // Mostrar estudiantes
                    System.out.println("\n--- Lista de Estudiantes ---");
                    if (numEstudiantes == 0) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        for (int i = 0; i < numEstudiantes; i++) {
                            estudiantes[i].mostrarInformacion();
                        }
                    }
                    break;
                    */
                    
                case 3:
                    // Buscar estudiante por matrícula
                    System.out.print("Ingrese la matrícula a buscar: ");
                    String matriculaBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < numEstudiantes; i++) {
                        if (estudiantes[i].matricula.equals(matriculaBuscar)) {
                            System.out.println("\nEstudiante encontrado:");
                            //estudiantes[i].mostrarInformacion();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró un estudiante con esa matrícula.");
                    }
                    break;

                case 4:
                    // Eliminar estudiante
                    System.out.print("Ingrese la matrícula del estudiante a eliminar: ");
                    String matriculaEliminar = scanner.nextLine();
                    int indexEliminar = -1;
                    for (int i = 0; i < numEstudiantes; i++) {
                        if (estudiantes[i].matricula.equals(matriculaEliminar)) {
                            indexEliminar = i;
                            break;
                        }
                    }
                    if (indexEliminar != -1) {
                        for (int i = indexEliminar; i < numEstudiantes - 1; i++) {
                            estudiantes[i] = estudiantes[i + 1];
                        }
                        estudiantes[numEstudiantes - 1] = null;
                        numEstudiantes--;
                        System.out.println("Estudiante eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró un estudiante con esa matrícula.");
                    }
                    break;

                case 0:
                    // Salir
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
