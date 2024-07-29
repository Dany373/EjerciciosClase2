package umg.progra2.grupo3;

import java.util.Scanner;

public class volumenPrisma {
    public static double volumenPrismaRectangular() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el area de la base del prisma: ");
        double area_base = scanner.nextDouble();
        System.out.println("Ingrese la altura del prisma: ");
        double altura = scanner.nextDouble();
        return area_base * altura;
    }
}
