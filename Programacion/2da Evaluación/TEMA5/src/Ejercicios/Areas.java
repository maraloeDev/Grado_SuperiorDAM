/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Areas {

    static Scanner teclado = new Scanner(System.in);

    public static void Circulo() { //Metodo que calcula el area del CIRCULO

        System.out.print("Introduce un valor para el radio: ");
        double radio = teclado.nextInt();
        double areaCirculo = (Math.PI) * (Math.pow(radio, 2));

        System.out.println((int) areaCirculo);
    }

    public static void Cuadrado() { //Metodo que calcula el area del CUADRADO

        System.out.print("Introduce un valor para el lado 1: ");
        double l1 = teclado.nextInt();

        System.out.print("Introduce un valor para el lado 2: ");
        double l2 = teclado.nextInt();
        double areaCuadrado = (l1 * l2);

        System.out.println((int) areaCuadrado);
    }

    public static void Rectangulo() { //Metodo que calcula el area del RECTANGULO

        System.out.print("Introduce un valor para el largo: ");
        double largo = teclado.nextInt();

        System.out.print("Introduce un valor para el ancho: ");
        double ancho = teclado.nextInt();
        double areaRectrangulo = (largo * ancho);

        System.out.println((int) areaRectrangulo);
    }

    public static void Triangulo() { //Metodo que calcula el area del TRIANGULO

        System.out.print("Introduce un valor para el base: ");
        double base = teclado.nextInt();

        System.out.print("Introduce un valor para el altura: ");
        double altura = teclado.nextInt();
        double areaTriangulo = (base * altura) / 2;

        System.out.println((int) areaTriangulo);
    }

    public static void main(String[] args) {
        try {


            int eleccion;

            do {
                //Creacion del menu para la eleccion de Area a calcular
                System.out.println("Seleccione el Area a calcular" + "\n"
                        + "1- Circulo" +
                        "\n" + "2-Cuadrado" +
                        "\n" + "3-Rectangulo" +
                        "\n" + "4-Triangulo");
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
                    default:
                        System.out.println("Error");

                }

            } while (eleccion != 1 || eleccion != 4);


        } catch (InputMismatchException Error) {
            System.out.println("Eleccion incorrecta, vuelve a intentarlo");

        }
    }

}
