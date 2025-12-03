import java.util.Scanner;

public class EstadisticasPartido {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int golesLocal = src.nextInt();
        int golesVisitante = src.nextInt();

        System.out.println("EMPIEZA EL PARTIDO, EMPATE: " + golesLocal + " " + golesVisitante);

        while (true) {
            int nuevoLocal = src.nextInt();
            int nuevoVisitante = src.nextInt();

            if (nuevoLocal == -1 && nuevoVisitante == -1) {
                String resultadoFinal = "";
                if (golesLocal > golesVisitante) resultadoFinal = "GANA LOCAL";
                else if (golesVisitante > golesLocal) resultadoFinal = "GANA VISITANTE";
                else resultadoFinal = "EMPATE";
                System.out.println("FINAL DEL PARTIDO, " + resultadoFinal + ": " + golesLocal + " " + golesVisitante);
                break;
            }

            if (nuevoLocal > golesLocal) System.out.print("GOL LOCAL, ");
            else if (nuevoVisitante > golesVisitante) System.out.print("GOL VISITANTE, ");

            if (nuevoLocal > nuevoVisitante) System.out.println("GANA LOCAL: " + nuevoLocal + " " + nuevoVisitante);
            else if (nuevoVisitante > nuevoLocal) System.out.println("GANA VISITANTE: " + nuevoLocal + " " + nuevoVisitante);
            else System.out.println("EMPATE: " + nuevoLocal + " " + nuevoVisitante);

            golesLocal = nuevoLocal;
            golesVisitante = nuevoVisitante;
        }
    }
}
