package EjercicioObjetos1.AplicacionMedica;

public class AplicacionMedica {
    static void main(String[] args) {
        paciente paciente1 = new paciente("Juan", "Pérez", "12345678A", "01/01/1990", 1.75f, 70f, "Ninguna", "Ninguna", "Ninguno", "Ninguna");
        paciente1.mostrarDatos();
        paciente1.imc();

    }
}

class paciente{
    String nombre;
    String apellidos;
    String fechaNacimiento;
    String dni;
    float altura;
    float peso;
    String alergias;
    String enfermedades;
    String medicamentos;
    String operaciones;

    public paciente(String nombre, String apellidos, String dni, String fechaNacimiento, float altura, float peso, String alergias, String enfermedades, String medicamentos, String operaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.alergias = alergias;
        this.enfermedades = enfermedades;
        this.medicamentos = medicamentos;
        this.operaciones = operaciones;
    }

    public void imc(){
        float imc = peso / (altura * altura);
        System.out.println("El IMC de " + nombre + " es: " + imc);
    }

     public void mostrarDatos(){
         System.out.println("Nombre: " + nombre);
         System.out.println("Apellidos: " + apellidos);
         System.out.println("DNI: " + dni);
         System.out.println("Fecha de nacimiento: " + fechaNacimiento);
         System.out.println("Altura: " + altura);
         System.out.println("Peso: " + peso);
         System.out.println("Alergias: " + alergias);
         System.out.println("Enfermedades: " + enfermedades);
         System.out.println("Medicamentos: " + medicamentos);
         System.out.println("Operaciones: " + operaciones);
     }
}