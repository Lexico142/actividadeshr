package hackerrank;

import java.util.Scanner;

public class calculosFigurasMetodos {
    public static Scanner src = new Scanner(System.in);

    static void main(String[] args) {

        String figura = src.nextLine();
        switch (figura) {
            case "circulo":
                calcularCirculo();
                break;
            case "triangulo":
                clacularTriangulo();
                break;
            case "cuadrado":
                calcularCuadrado();
                break;
        }
    }
    static void calcularCirculo() {
        double radio = src.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("Area del circulo: %.2f%n", area);
    }
    static void clacularTriangulo() {
        double base = src.nextDouble();
        double altura = src.nextDouble();
        double area = (base * altura) / 2;
        System.out.printf("Area del triangulo: %.1f%n", area);
    }
    static void calcularCuadrado() {
        double lado = src.nextDouble();
        double area = Math.pow(lado, 2);
        System.out.printf("area del cuadrado: %.1f%n", area);
    }

}
