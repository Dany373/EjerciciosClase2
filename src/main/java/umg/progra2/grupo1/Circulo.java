package umg.progra2.grupo1;

import java.util.Scanner;

public class Circulo {

   public static double calcularAreaCirculo () {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingrese el radio del circulo: ");
       double radio = scanner.nextDouble();
       return Math.PI * Math.pow(radio, 2);
   }
}
