package umg.progra2;


import umg.progra2.grupo1.Circulo;
import umg.progra2.grupo1.circunferenciaCirculo;
import umg.progra2.grupo1.volumenCubo;
import umg.progra2.grupo2.areaPiramideCuadrada;
import umg.progra2.grupo2.ejercicio1;
import umg.progra2.grupo2.volumenPiramide;
import umg.progra2.grupo3.VolumenCilindro;
import umg.progra2.grupo3.areaParalelogramo;
import umg.progra2.grupo3.volumenPrisma;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu de Paquetes");
            System.out.println("1. Grupo 1");
            System.out.println("2. Grupo 2");
            System.out.println("3. Grupo 3");
            System.out.println("4. Salir");
            System.out.println("Elija un paquete");
            int paquete = scanner.nextInt();
            switch (paquete) {
                case 1:
                    mostrarMenuGrupo1(scanner);
                    break;
                case 2:
                    mostrarMenuGrupo2(scanner);
                    break;
                case 3:
                    mostrarMenuGrupo3(scanner);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Salida exitosamente");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println();
        }
       scanner.close();
    }

    public static void mostrarMenuGrupo1(Scanner scanner) {
        boolean volver = false;
        System.out.println("Menu Grupo 1");
        System.out.println("1. Calcular area de un circulo");
        System.out.println("2.Calcular la circunferencia de un circulo");
        System.out.println("3. Calcular volumen de un cubo");
        System.out.println("4. Volver al menu principal");
        System.out.println("Elija una opcion");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                double areaCirculo = Circulo.calcularAreaCirculo();
                System.out.println("El area del circulo es: " + areaCirculo);
                break;
            case 2:
                double circunCirculo = circunferenciaCirculo.calcularCircunCirculo();
                System.out.println("El circunferencia del circulo es: " + circunCirculo);
                break;
            case 3:
                double volCubo = volumenCubo.calcularVolumenCubo();
                System.out.println("El volumen del cubo es: " + volCubo);
                break;
            case 4:
                volver = true;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        System.out.println();
    }
      public static void mostrarMenuGrupo2(Scanner scanner) {
        boolean volver = false;

         System.out.println("Menu Grupo 2");
         System.out.println("1. Calcular area de una piramide cuadrada");
         System.out.println("2. Calcular el volumen de una piramide cuadrada");
         System.out.println("3. Calcular area de un triangulo");
         System.out.println("4. Volver al menu principal");
         System.out.println("Elija una opcion");
         int opcion = scanner.nextInt();
         switch (opcion) {
             case 1:
                 double areaTriangulo = ejercicio1.calcularAreaTriangulo();
                 System.out.println("El area del triangulo es: " + areaTriangulo);
                 break;
             case 2:
                 double areaPiramide = areaPiramideCuadrada.calcularAreaPiramide();
                 System.out.println("El area del piramide es: " + areaPiramide);
                 break;
             case 3:
                 double volPiramide = volumenPiramide.calcularVolumenPiramide();
                 System.out.println("El volumen del piramide cuadrada es: " + volPiramide);
                 break;
             case 4:
                 volver = true;
                 break;
             default:
                 System.out.println("Opcion no valida");
         }
         System.out.println();
      }
      public static void mostrarMenuGrupo3(Scanner scanner) {
        boolean volver = false;

        System.out.println("Menu Grupo 3");
        System.out.println("1. Calcular el volumen de un prisma rectangular");
          System.out.println("2. Calcular el area de un paralelogramo");
          System.out.println("3. Calcular el volumen de un cilindro");
          System.out.println("4. Volver al menu principal");
          System.out.println("Elija una opcion");
          Scanner scanner1 = new Scanner(System.in);
          int opcion = scanner1.nextInt();
          switch (opcion) {
              case 1:
                  double volCilindro = VolumenCilindro.calcularVolumenCilindro();
                  System.out.println("El volumen del cilindro es: " + volCilindro);
                  break;
              case 2:
                  double volPrisma = volumenPrisma.volumenPrismaRectangular();
                  System.out.println("El volumen del prisma rectangular es: " + volPrisma);
                  break;
              case 3:
                  double areaPrllogmo = areaParalelogramo.calcularAreaParalelogramo();
                  System.out.println("El area del paralelogramo es: " + areaPrllogmo);
                  break;
              case 4:
                  volver = true;
                  break;
              default:
                  System.out.println("Opcion no valida");
                  break;
          }

          System.out.println();
      }
    }

