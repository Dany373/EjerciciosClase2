package umg.progra2.grupo3;

import java.util.Scanner;

public class VolumenCilindro {
    public static double calcularVolumenCilindro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio de la base del cilindro: ");
        double radio = scanner.nextDouble();
        System.out.println("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}
