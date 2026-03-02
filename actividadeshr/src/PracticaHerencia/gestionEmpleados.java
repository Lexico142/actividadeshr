package PracticaHerencia;

public class gestionEmpleados {
    public static void main(String[] args) {
        Programador programador = new Programador("Juan", "Desarrollo", 2000, "Perez", "Java", 10);
        Gerente gerente = new Gerente("Maria", "Administracion", 3000, "Gomez", 5);
        programador.mostrarInformacion();
        programador.calcularSalario();
        System.out.println("-----------------------------");
        gerente.mostrarInformacion();
        gerente.calcularSalario();

    }

}

class Empleado{
    private String nombre;
    private String apellidos;
    private int salarioBase;
    private String departamento;

    public Empleado(String nombre, String departamento, int salarioBase, String apellidos) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salarioBase = salarioBase;
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getApellidos() {
        return apellidos;
    }
}

class Programador extends Empleado{
    private String lenguaje;
    private int horasExtra;

    public Programador(String nombre, String departamento, int salarioBase, String apellidos, String lenguaje, int horasExtra) {
        super(nombre, departamento, salarioBase, apellidos);
        this.lenguaje = lenguaje;
        this.horasExtra = horasExtra;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void calcularSalario() {
        int salarioTotal = super.getSalarioBase()  + (horasExtra * 20);
        System.out.println("Salario total del programador: " + salarioTotal);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Departamento: " + super.getDepartamento());
        System.out.println("Salario Base: " + super.getSalarioBase());
        System.out.println("Apellidos: " + super.getApellidos());
        System.out.println("Lenguaje: " + getLenguaje());
        System.out.println("Horas Extra: " + getHorasExtra());
    }
}


class Gerente extends Empleado{
    private int numeroEmpleados;
    private int bono;

    public Gerente(String nombre, String departamento, int salarioBase, String apellidos, int numeroEmpleados) {
        super(nombre, departamento, salarioBase, apellidos);
        this.numeroEmpleados = numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public int getBono() {
        return bono;
    }

    public void calcularSalario() {
        int salarioTotal = super.getSalarioBase() + (numeroEmpleados * 50) + bono;
        System.out.println("Salario total del gerente: " + salarioTotal);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Departamento: " + super.getDepartamento());
        System.out.println("Salario Base: " + super.getSalarioBase());
        System.out.println("Apellidos: " + super.getApellidos());
        System.out.println("Número de Empleados: " + getNumeroEmpleados());
        System.out.println("Bono: " + getBono());
    }
}