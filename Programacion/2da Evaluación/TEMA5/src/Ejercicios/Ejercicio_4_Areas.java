/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_4_Areas {

    static Scanner teclado = new Scanner(System.in);

    public static double Circulo() { //Metodo que calcula el area de un circulo

        System.out.println("Introduce un radio para el circulo");
        double radio = teclado.nextDouble();

        double areaCirculo = (Math.PI * Math.pow(radio, 2));
        return areaCirculo;
    }

    public static double Cuadrado() { //Metodo que calcula el area de un cuadrado

        System.out.println("Introduce un lado para el cuadrado");
        double lado = teclado.nextDouble();

        double areaCuadrado = (Math.pow(lado, lado));
        return areaCuadrado;
    }

    public static double Rectangulo() { //Metodo que calcula el area de un rectangulo

        System.out.println("Introduce la base del rectangulo");
        double base = teclado.nextDouble();

        System.out.println("Introduce la altura del rectangulo");
        double altura = teclado.nextDouble();

        double areaRectangulo = (base * altura);
        return areaRectangulo;
    }

    public static double Triangulo() { //Metodo que calcula el area de un triangulo

        System.out.println("Introduce la base del rectangulo");
        double base = teclado.nextDouble();

        System.out.println("Introduce la altura del rectangulo");
        double altura = teclado.nextDouble();

        double areaTriangulo = (base * altura) / 2;
        return areaTriangulo;
    }

    public static void main(String[] args) {
        int eleccion;


        do {

            System.out.println("Introduce el numero de la figura geometrica a calcular" + "\n" +
                    "\t" + "1 Circulo" + "\n" +
                    "\t" + "2 Cuadrado" + "\n" +
                    "\t" + "3 Rectangulo" + "\n" +
                    "\t" + "4 Triangulo");
            eleccion = teclado.nextInt();

            switch (eleccion) {
                case 1:
                    Circulo();
                    break;
                case 2:
                    Cuadrado();
                    break;
                case 3:
                    Rectangulo();
                    break;
                case 4:
                    Triangulo();
                    break;
                default:
                    System.out.println("Ese numero no figura en la lista");
            }
        } while ((eleccion!=1 || eleccion!=4));


    }


}
