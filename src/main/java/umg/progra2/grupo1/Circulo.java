package umg.progra2.grupo1;

public class Circulo {
   private double radio;

   public static double calcularAreaCirculo (double radio) {
       return Math.PI * Math.pow(radio, 2);
   }
   public static void main (String[] args) {
       double radio = 5.0;
       double area = calcularAreaCirculo(radio);
       System.out.println("El area del circulo es: " + area);

   }


}
