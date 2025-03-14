import java.util.*;

class Estudiante {
    String nombre;
    int edad;
    String matricula;
    String carrera;
}

public class SistemaRegistroEstudiantes {

    public static void mostrarEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.nombre);
            System.out.println("Edad: " + estudiante.edad);
            System.out.println("Matrícula: " + estudiante.matricula);
            System.out.println("Carrera: " + estudiante.carrera);
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[100];
        int numEstudiantes=0, opcion;
        String nombre, matricula, carrera;

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
                    break;

                case 2:
                    mostrarEstudiantes(estudiantes);
                    break;

                case 3:
                    // Buscar estudiante por matrícula
                    break;

                case 4:
                    // Eliminar estudiante
                    
                    break;

                case 0:
                    // Salir
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}