package umg.progra2.grupo2;

import java.util.Scanner;

public class ejercicio1 {
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base del triangulo: ");
        double base = scanner.nextDouble();

        System.out.println("Ingrese el valor de la altura del triangulo: ");
        double altura = scanner.nextDouble();

        double area = (base*altura)/2;

        System.out.println("El area del triangulo es: " + area);

        scanner.close();
    }


    }

