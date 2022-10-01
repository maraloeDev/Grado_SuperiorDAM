/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero a multiplicar: ");

        int num = teclado.nextInt();

        System.out.println(num + " * " + 1 + ("= " + num * 1));
        System.out.println(num + " * " + 2 + ("= " + num * 2));
        System.out.println(num + " * " + 3 + ("= " + num * 3));
        System.out.println(num + " * " + 4 + ("= " + num * 4));
        System.out.println(num + " * " + 5 + ("= " + num * 5));
        System.out.println(num + " * " + 6 + ("= " + num * 6));
        System.out.println(num + " * " + 7 + ("= " + num * 7));
        System.out.println(num + " * " + 8 + ("= " + num * 8));
        System.out.println(num + " * " + 9 + ("= " + num * 9));
        System.out.println(num + " * " + 10 + ( "= " +num * 10));

    }
}
