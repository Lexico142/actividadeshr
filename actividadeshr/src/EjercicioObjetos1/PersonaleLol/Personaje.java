package EjercicioObjetos1.PersonaleLol;

public class Personaje {
    static void main(String[] args) {

        Campeon campeon = new Campeon("Ahri", "Media", "Mana", 526, 53, 0, 20, 30);
        habilidades habilidad1 = new habilidades("Orbe de Engaño", "Ahri lanza un orbe que inflige daño mágico a los enemigos que atraviesa y explota al impactar, infligiendo daño mágico adicional a los enemigos cercanos.", 7, 'Q', 40, 1);
        habilidades habilidad2 = new habilidades("Fuego Zorruno", "Ahri lanza tres llamas en forma de abanico que infligen daño mágico a los enemigos alcanzados. Ahri puede volver a lanzar esta habilidad para que las llamas vuelvan a ella, infligiendo daño mágico adicional a los enemigos que atraviesan.", 9, 'W', 60, 1);
        habilidades habilidad3 = new habilidades("Encanto", "Ahri lanza un beso que inflige daño mágico a un enemigo y lo enamora, lo que hace que se dirija hacia ella durante un breve período de tiempo. El enemigo encantado también recibe daño mágico adicional de Ahri y sus habilidades.", 12, 'E', 80, 1);
        habilidades habilidad4 = new habilidades("Espíritu Zorruno", "Ahri libera su esencia, lo que le otorga velocidad de movimiento adicional durante un breve período de tiempo. Al activar esta habilidad, Ahri puede volver a activarla para lanzarse hacia una dirección, infligiendo daño mágico a los enemigos en su camino.", 130, 'R', 100, 1);

        campeon.agregarHabilidad(habilidad1, 0);
        campeon.agregarHabilidad(habilidad2, 1);
        campeon.agregarHabilidad(habilidad3, 2);
        campeon.agregarHabilidad(habilidad4, 3);

        campeon.mostrarInformacion();

    }
}

class Campeon{
    String nombre;
    String dificultad;
    String recurso;
    int vidaMax;
    int dano;
    int poderHabilidad;
    int armadura;
    int resistenciaMagica;
    habilidades[] habilidades = new habilidades[4];

    public Campeon(String nombre, String dificultad, String recurso, int vidaMax, int dano, int poderHabilidad, int armadura, int resistenciaMagica) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.recurso = recurso;
        this.vidaMax = vidaMax;
        this.dano = dano;
        this.poderHabilidad = poderHabilidad;
        this.armadura = armadura;
        this.resistenciaMagica = resistenciaMagica;
    }

    public void agregarHabilidad(habilidades habilidad, int posicion) {
        habilidades[posicion] = habilidad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dificultad: " + dificultad);
        System.out.println("Recurso: " + recurso);
        System.out.println("Vida Máxima: " + vidaMax);
        System.out.println("Daño: " + dano);
        System.out.println("Poder de Habilidad: " + poderHabilidad);
        System.out.println("Armadura: " + armadura);
        System.out.println("Resistencia Mágica: " + resistenciaMagica);
        System.out.println("Habilidades:");
        for (int i = 0; i < habilidades.length; i++) {
            if (habilidades[i] != null) {
                System.out.println((i+1) + ". " + habilidades[i].nombre);
                System.out.println("   Descripción: " + habilidades[i].descripcion);
                System.out.println("   Enfriamiento: " + habilidades[i].enfriamiento + " segundos");
                System.out.println("   Tecla: " + habilidades[i].tecla);
                System.out.println("   Coste de Recurso: " + habilidades[i].costeRecurso);
                System.out.println("   Nivel: " + habilidades[i].nivel);
            }
        }
    }




}

class habilidades{
    String nombre;
    String descripcion;
    int enfriamiento;
    char tecla;
    int costeRecurso;
    int nivel;

    public habilidades(String nombre, String descripcion, int enfriamiento, char tecla, int costeRecurso, int nivel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enfriamiento = enfriamiento;
        this.tecla = tecla;
        this.costeRecurso = costeRecurso;
        this.nivel = nivel;
    }
}