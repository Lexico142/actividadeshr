package EjercicioObjetos1.Pokedex;

public class Pokemon {
    String nombre;
    String tipo;
    int nivel;
    int generacion;
    boolean capturado;
    int id;
    String evolucion;
    String involucion;

    public Pokemon(String nombre, String tipo, int nivel, int generacion, boolean capturado, int id, String evolucion, String involucion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.generacion = generacion;
        this.capturado = capturado;
        this.id = id;
        this.evolucion = evolucion;
        this.involucion = involucion;
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nivel: " + nivel);
        System.out.println("Generación: " + generacion);
        System.out.println("Capturado: " + capturado);
        System.out.println("ID: " + id);
    }

    public void mostrarEvolucion(){
        System.out.println("Evolución: " + evolucion);
    }

    public void mostrarInvolucion(){
        System.out.println("Involución: " + involucion);
    }
}
