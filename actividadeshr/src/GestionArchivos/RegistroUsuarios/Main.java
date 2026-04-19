package GestionArchivos.RegistroUsuarios;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Usuario {
    private String nombre;
    private String edad;
    private String correo;

    public Usuario(String nombre, String edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - Edad: " + edad + " - Correo electrónico: " + correo;
    }
}

class GestorArchivo {
    private String ruta = "src/GestionArchivos/RegistroUsuarios/usuarios.txt";

    public void crearArchivoSiNoExiste() {
        try {
            File file = new File(ruta);
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }

    public void leerArchivo() {
        try {
            FileReader myReader = new FileReader(ruta);
            Scanner fileScanner = new Scanner(myReader);
            System.out.println("====== USUARIOS REGISTRADOS ======");
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                System.out.println(data);
            }
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
    }

    public void guardarUsuario(Usuario usuario) {
        try {
            FileWriter myWriter = new FileWriter(ruta, true);
            myWriter.write(usuario.toString() + "\n");
            myWriter.close();
            System.out.println("Usuario registrado exitosamente.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error al registrar el usuario.");
            e.printStackTrace();
        }
    }
}

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorArchivo gestor = new GestorArchivo();

        gestor.crearArchivoSiNoExiste();
        gestor.leerArchivo();

        while (true) {
            System.out.println("Ingresa el nombre del usuario:");
            String nombre = sc.nextLine();
            System.out.println("Ingresa la edad del usuario:");
            String edad = sc.nextLine();
            System.out.println("Ingresa el correo del usuario:");
            String correo = sc.nextLine();

            Usuario nuevoUsuario = new Usuario(nombre, edad, correo);
            gestor.guardarUsuario(nuevoUsuario);

            System.out.println("Quieres registrar otro usuario? (true/false)");
            if (!sc.nextBoolean()) {
                System.out.println("Gracias por usar el sistema de registro de usuarios.");
                break;
            } else {
                sc.nextLine();
            }
        }
    }
}