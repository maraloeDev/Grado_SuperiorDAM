/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3_Calculo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un  numero");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce un  numero");
        int numero2 = teclado.nextInt();

        //HACER CON OPERADOR TERNARIO


        //HACER CON SWITCH

        System.out.println("\tSUMA " + (numero1 + numero2));
        System.out.println("\tRESTA " + (numero1 - numero2));
        System.out.println("\tMULTIPLICACION " + (numero1 * numero2));
        System.out.println("\tDIVISION " + (numero1 / numero2));
        System.out.println("\tRESTO " + (numero1 % numero2));
    }
}
