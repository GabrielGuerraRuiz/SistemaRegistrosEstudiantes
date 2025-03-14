import java.util.*;

class Estudiante {
    String nombre;
    int edad;
    String matricula;
    String carrera;
}

public class SistemaRegistroEstudiantes {
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
                    break;

                case 2:
                    // Mostrar estudiantes
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