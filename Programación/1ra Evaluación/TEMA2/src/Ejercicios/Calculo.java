/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double num1= teclado.nextInt();

        System.out.println("Introduce un numero");
        double num2= teclado.nextInt();

        System.out.println("-----------------------------------");

        System.out.println("\tSUMA :" + (num1 + num2));
        System.out.println("\tRESTA : " + (num1 - num2));
        System.out.println("\tMULTIPLICACIÓN : " + (num1 * num2));
        System.out.println("\tDIVISION : " + (num1 / num2));
        System.out.println("\tRESTO : " + (num1 % num2));
    }
}
