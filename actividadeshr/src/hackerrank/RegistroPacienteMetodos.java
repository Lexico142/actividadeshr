package hackerrank;

import java.util.Scanner;

public class RegistroPacienteMetodos {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = sc.nextLine();
        String apellido = sc.nextLine();
        int edad = sc.nextInt();
        mostrarPaciente(nombre, apellido, edad);

    }
    public static void mostrarPaciente(String nombre, String apellido, int edad) {
        System.out.println("Paciente registrado");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        if (edad < 18) {
            System.out.println("Categoria: MENOR DE EDAD");
        } else if (edad <= 65) {
            System.out.println("Categoria: ADULTO");
        } else {
            System.out.println("Categoria: ADULTO MAYOR");
        }
    }
}
