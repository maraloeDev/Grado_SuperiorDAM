/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios.Ejercicios_dia_Huelga;

import java.util.AbstractList;
import java.util.Scanner;

public class Ejercicio_4 {

    /**
     * Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz.
     * Repetir el proceso tantas veces como deseemos.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double aleatorio = 50 * (Math.random() + 60);

        System.out.println(aleatorio);

    }
}