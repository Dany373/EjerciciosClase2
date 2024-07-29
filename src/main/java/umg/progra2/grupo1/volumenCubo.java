package umg.progra2.grupo1;

import java.util.Scanner;

public class volumenCubo {
    public static double calcularVolumenCubo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitu de cada lado del cubo: ");
        double lado = scanner.nextDouble();
        return Math.pow(lado, 3);
    }
}
