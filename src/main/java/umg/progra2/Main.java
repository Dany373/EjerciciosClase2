package umg.progra2;


import umg.progra2.grupo1.Circulo;
import umg.progra2.grupo2.ejercicio1;
import umg.progra2.grupo3.VolumenCilindro;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double radio = 5.0;
       double area = Circulo.calcularAreaCirculo(radio);
       System.out.println("El area de la circulo con radio " + radio + " es: " + area);


       //Area del Triangulo

        System.out.println("Ingrese la base del triangulo");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        double altura = scanner.nextDouble();
        double areaTriangulo = ejercicio1.calcularAreaTriangulo(base,altura);
        System.out.println("El area del triangulo es: " + areaTriangulo);

        //Volumen del cilindro

        System.out.println("Ingrese el radio de la base del cilindro");
        double radioCilindro = scanner.nextDouble();
        System.out.println("Ingrese la altura del cilindro");
        double alturaCilindro = scanner.nextDouble();
        double volumenCilindro = VolumenCilindro.calcularVolumenCilindro(radioCilindro,alturaCilindro);
        System.out.println("El volumen del cilindro es: " + volumenCilindro);

    }

}