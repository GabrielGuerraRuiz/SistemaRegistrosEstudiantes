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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[100];

        int numEstudiantes=0, opcion, encontrado;
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
                    mostrarEstudiantes(estudiantes);
                    break;
                case 3:
                    // Buscar estudiante por matrícula
                    System.out.print("Ingrese la matricula del estudiante: ");
                    matricula = scanner.nextLine();
                    encontrado=0;
                    for (int i=0; i<numEstudiantes; i++) {

                        if (estudiantes[i].matricula.equals(matricula)) {
                            System.out.println("Nombre: " + estudiantes[i].nombre);
                            System.out.println("Edad: " + estudiantes[i].edad);
                            System.out.println("Carrera: " + estudiantes[i].carrera);
                            encontrado=1;
                            break;
                        }
                    }
                    if (encontrado==0) {
                        System.out.println("No se encontro ningun estudiante con esa matricula.");

                    }
                    break;

                case 4:
                    System.out.print("Ingrese la matrícula del estudiante a eliminar: ");
                    matricula = scanner.nextLine();
                    numEstudiantes = eliminarEstudiante(estudiantes, numEstudiantes, matricula);
                    break;

                case 0:
                    System.out.println("Saliendo del sistema");
                    // Salir
                    break;

                default:
                    System.out.println("Opcion no valida.");

            }
        } while (opcion != 0);

        scanner.close();
    }
}
