/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_5_EcuacionCuadratica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor de a ");
        int a = teclado.nextInt();

        System.out.println("Introduce el valor de b ");
        int b = teclado.nextInt();

        System.out.println("Introduce el valor de c ");
        int c = teclado.nextInt();

        double potencia = Math.pow(b, 2) - (4 * a * c);

        double x1 = (-b - Math.sqrt(potencia) / 2 * a);

        double x2 = (-b + Math.sqrt(potencia) / 2 * a);

        System.out.println("\nX1 = " + x1);

        System.out.println("\nX2 = " + x2);

    }
}
