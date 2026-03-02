package PracticaHerencia;

public class gestionCoches {
    public static void main(String[] args) {
        CocheElectrico tesla = new CocheElectrico("Tesla", "Model S", 85000.0, 250, 600, 8);

        CocheDeportivo porsche = new CocheDeportivo("Porsche", "911", 120000.0, 310, 450, true);

        System.out.println("== Coche eléctrico ==");
        tesla.mostrarInfo();

        System.out.println("== Coche deportivo ==");
        porsche.mostrarInfo();

        System.out.println("== Actualización coche deportivo ==");
        porsche.setModoCarrera(false);
        porsche.getRuedas()[0].setDesgaste(40);
        porsche.getRuedas()[0].setEstado("Usada");

        porsche.mostrarInfo();
    }
}

class Rueda {
    private int desgaste;
    private String estado;

    public Rueda(int desgaste, String estado) {
        this.desgaste = desgaste;
        this.estado = estado;
    }

    public int getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(int desgaste) {
        this.desgaste = desgaste;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarInfoRueda(int numeroRueda) {
        System.out.println("  - Rueda " + numeroRueda + " -> Estado: " + estado + ", Desgaste: " + desgaste + "%");
    }
}

class Coche {
    private String marca;
    private String modelo;
    private double precio;
    private int velocidadMaxima;
    private Rueda[] ruedas;

    public Coche(String marca, String modelo, double precio, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.velocidadMaxima = velocidadMaxima;

        this.ruedas = new Rueda[4];
        for (int i = 0; i < 4; i++) {
            this.ruedas[i] = new Rueda(0, "Nueva");
        }
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Rueda[] getRuedas() {
        return ruedas; }
    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
        System.out.println("Precio: " + precio + "€ | Vel. Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Estado de las ruedas:");
        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i].mostrarInfoRueda(i + 1);
        }
    }
}


class CocheElectrico extends Coche {
    private int autonomia;
    private int tiempoCarga;

    public CocheElectrico(String marca, String modelo, double precio, int velocidadMaxima, int autonomia, int tiempoCarga) {
        super(marca, modelo, precio, velocidadMaxima);
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
    }

    public int getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getTiempoCarga() {
        return tiempoCarga;
    }
    public void setTiempoCarga(int tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Eléctrico | Autonomía: " + autonomia + " km | Tiempo de carga: " + tiempoCarga + " horas");
    }
}

class CocheDeportivo extends Coche {
    private int caballos;
    private boolean modoCarrera;

    public CocheDeportivo(String marca, String modelo, double precio, int velocidadMaxima, int caballos, boolean modoCarrera) {
        super(marca, modelo, precio, velocidadMaxima);
        this.caballos = caballos;
        this.modoCarrera = modoCarrera;
    }

    public int getCaballos() {
        return caballos;
    }
    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public boolean isModoCarrera() {
        return modoCarrera;
    }
    public void setModoCarrera(boolean modoCarrera) {
        this.modoCarrera = modoCarrera;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        String estadoCarrera;
        if (modoCarrera) {
            estadoCarrera = "Activado";
        } else {
            estadoCarrera = "Desactivado";
        }
        System.out.println("Tipo: Deportivo | Caballos: " + caballos + " CV | Modo Carrera: " + estadoCarrera);
    }
}