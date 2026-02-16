package EjercicioObjetos1.Magic;

public class Magic {
    static void main(String[] args) {
        carta carta1 = new carta("Serra Angel", 4, "John Avon", 4, "Alpha", 'R', "Flying, Vigilance", "Angel", "https://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=1&type=card", "Creature", 5
        );

        carta1.mostrarInfo();
    }
}

class carta {
    String nombre;
    int costeMana;
    String imagen;
    String tipo;
    String subtipo;
    String habilidad;
    char rareza;
    String expansion;
    String artista;
    int fuerza;
    int resistencia;

    public carta(String nombre, int resistencia, String artista, int fuerza, String expansion, char rareza, String habilidad, String subtipo, String imagen, String tipo, int costeMana) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.artista = artista;
        this.fuerza = fuerza;
        this.expansion = expansion;
        this.rareza = rareza;
        this.habilidad = habilidad;
        this.subtipo = subtipo;
        this.imagen = imagen;
        this.tipo = tipo;
        this.costeMana = costeMana;
    }

    public void mostrarInfo() {
        System.out.println("--- Información de la Carta ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Coste de Mana: " + costeMana);
        System.out.println("Tipo: " + tipo + " - " + subtipo);
        System.out.println("Habilidad: " + habilidad);
        System.out.println("Fuerza/Resistencia: " + fuerza + "/" + resistencia);
        System.out.println("Rareza: " + rareza);
        System.out.println("Expansión: " + expansion);
        System.out.println("Artista: " + artista);
        System.out.println("Imagen: " + imagen);
    }
}