/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.Ejercicios_2_Iteraccion;

import java.util.Scanner;

/**
 * Escribe un programa llamado Primo que muestre si un número dado por el usuario es primo
 * o no
 */

public class Ejercicio_1_Primo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número : ");

        int numero = teclado.nextInt();

        boolean primo = true; //considero que nº es primo
        int i = 2;

        while (i < numero && primo) {
            if (numero % 1 == 0) {

            }
            i++; //compruebo ek siguiente número
        }
        //Conpruebo la bandera
        if (primo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }
}
