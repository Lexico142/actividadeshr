package VectoresDinamicos.ToDoList;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {

        ArrayList<Tarea> listaTareas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("\n=== MENÚ GESTIÓN DE TAREAS ===");
            System.out.println("1. Añadir una nueva tarea");
            System.out.println("2. Ver todas las tareas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n=== NUEVA TAREA ===");

                    System.out.print("Introduce el nombre de la tarea: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Introduce el nombre del autor: ");
                    String autor = teclado.nextLine();

                    System.out.print("Introduce una descripción: ");
                    String descripcion = teclado.nextLine();

                    System.out.print("Introduce la duración en horas (ej: 2): ");
                    int duracion = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Selecciona el estado de la tarea:");
                    System.out.println("1. Pendiente");
                    System.out.println("2. En Progreso");
                    System.out.println("3. Completada");
                    System.out.print("Elige una opción: ");
                    String estado = teclado.nextLine();

                    Tarea nuevaTarea = new Tarea(nombre, autor, descripcion, duracion, estado);

                    listaTareas.add(nuevaTarea);

                    System.out.println("Tarea añadida con éxito");
                    break;

                case 2:
                    System.out.println("\n=== LISTA DE TAREAS ===");
                    if (listaTareas.isEmpty()) {
                        System.out.println("No hay tareas registradas todavía.");
                    } else {
                        for (Tarea t : listaTareas) {
                            System.out.println(t.toString());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige 1, 2 o 3.");
            }
        }
    }
}