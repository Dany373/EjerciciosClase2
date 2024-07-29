package umg.progra2.grupo1;

import java.util.Scanner;

public class circunferenciaCirculo {
    public static double calcularCircunCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();
        return 2 * Math.PI * radio;
    }
}
