package umg.progra2.grupo3;

import java.util.Scanner;

public class VolumenCilindro {
    public static double calcularVolumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio de la base del cilindro:");
        double radio = scanner.nextDouble();
        System.out.println("Ingrese el altura del cilindro:");
        double altura = scanner.nextDouble();
        double volumen = calcularVolumenCilindro(radio, altura);
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
