package umg.progra2.grupo3;

import java.util.Scanner;

public class areaParalelogramo {
    public static double calcularAreaParalelogramo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la base del paralelogramo");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del paralelogramo");
        double altura = scanner.nextDouble();
        return base * altura;
    }
}
