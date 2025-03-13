package sistemaregistroestudiantes;

import java.util.Scanner;

public class RegistrarEstudiante {
    public static Estudiante registrarEstudiante(Scanner scanner) {
        System.out.println("\n--- Registro de Estudiante ---");
        
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        System.out.print("Ingrese la matrícula del estudiante: ");
        String matricula = scanner.nextLine();
        
        System.out.print("Ingrese la carrera del estudiante: ");
        String carrera = scanner.nextLine();
        
        return new Estudiante(nombre, edad, matricula, carrera);
    }
}
