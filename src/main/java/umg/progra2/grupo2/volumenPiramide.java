package umg.progra2.grupo2;

import java.util.Scanner;

public class volumenPiramide {
    public static double calcularVolumenPiramide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la base de la piramide: ");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura de la piramide: ");
        double altura = scanner.nextDouble();
        return (base * altura) / 3;
    }
}
