/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios.Ejercicios_dia_Huelga;

import java.util.Scanner;

public class Ejercicio_2 {

    /** Contar las veces que aparece una determinada letra en una frase, ambas introducidas por teclado. */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String frase = teclado.nextLine();

        System.out.println("Introduce una letra");
        char letra = teclado.nextLine().charAt(0);

    }
}
