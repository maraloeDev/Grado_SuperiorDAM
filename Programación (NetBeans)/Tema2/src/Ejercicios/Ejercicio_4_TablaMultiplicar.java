/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_4_TablaMultiplicar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el numero el cual quieres multiplicar: ");


        int numero=teclado.nextInt();

        System.out.println(numero  + " * 1 = " + numero * 1);
        System.out.println(numero  + " * 2 = " + numero * 2);
        System.out.println(numero  + " * 3 = " + numero * 3);
        System.out.println(numero  + " * 4 = " + numero * 4);
        System.out.println(numero  + " * 5 = " + numero * 5);
        System.out.println(numero  + " * 6 = " + numero * 6);
        System.out.println(numero  + " * 7 = " + numero * 7);
        System.out.println(numero  + " * 8 = " + numero * 8);
        System.out.println(numero  + " * 9 = " + numero * 9);
        System.out.println(numero  + " * 10 = " + numero * 10);

    }
}
