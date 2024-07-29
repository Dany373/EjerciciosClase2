package umg.progra2.grupo2;

import java.util.Scanner;

public class ejercicio1 {
    public static double calcularAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        double altura = scanner.nextDouble();
        return (base * altura)/ 2;
    }
}






