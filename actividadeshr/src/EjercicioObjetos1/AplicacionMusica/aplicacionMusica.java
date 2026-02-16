package EjercicioObjetos1.AplicacionMusica;

public class aplicacionMusica {
    static void main(String[] args) {
        canciones cancion1 = new canciones("Bohemian Rhapsody", "Queen", "A Night at the Opera", "Rock", 354, 1500000);
        canciones cancion2 = new canciones("Shape of You", "Ed Sheeran", "Divide", "Pop", 233, 2000000);
        canciones cancion3 = new canciones("Despacito", "Luis Fonsi", "Vida", "Pop Latino", 228, 3000000);

        usuario user1 = new usuario("JuanPerez", "2023-10-27", true, "juan@email.com");

        user1.agregarCancion(cancion1);
        user1.agregarCancion(cancion2);
        user1.agregarCancion(cancion3);

        user1.mostrarPerfil();
    }
}

class usuario {
    String nombre;
    String email;
    boolean premium;
    String fechaRegistro;

    canciones[] listaReproduccion;
    int contadorCanciones;

    public usuario(String nombre, String fechaRegistro, boolean premium, String email) {
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.premium = premium;
        this.email = email;

        this.listaReproduccion = new canciones[10];
        this.contadorCanciones = 0;
    }

    public void agregarCancion(canciones nuevaCancion) {
        if (contadorCanciones < listaReproduccion.length) {
            listaReproduccion[contadorCanciones] = nuevaCancion;
            contadorCanciones++;
            System.out.println("Canción añadida a la playlist de " + nombre + ": " + nuevaCancion.nombre);
        } else {
            System.out.println("La lista de reproducción está llena.");
        }
    }

    public void mostrarPerfil() {
        System.out.println("\n--- PERFIL DE USUARIO ---");
        System.out.println("Usuario: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Tipo de cuenta: " + (premium ? "Premium" : "Gratuita"));
        System.out.println("Fecha registro: " + fechaRegistro);

        System.out.println("\n--- LISTA DE REPRODUCCIÓN ---");
        for (int i = 0; i < contadorCanciones; i++) {
            listaReproduccion[i].mostrarInfoCancion();
        }
    }
}

class canciones {
    String nombre;
    String artista;
    String album;
    String genero;
    int duracion;
    int numeroReproducciones;

    public canciones(String nombre, String artista, String album, String genero, int duracion, int numeroReproducciones) {
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.duracion = duracion;
        this.numeroReproducciones = numeroReproducciones;
    }

    public void mostrarInfoCancion() {
        System.out.println("🎵 " + nombre + " - " + artista);
        System.out.println("   Álbum: " + album + " | Género: " + genero);
        System.out.println("   Duración: " + duracion + "s | Reproducciones: " + numeroReproducciones);
        System.out.println("   -------------------------");
    }
}