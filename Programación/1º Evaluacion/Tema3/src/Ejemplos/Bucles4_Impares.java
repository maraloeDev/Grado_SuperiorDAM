/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejemplos;

import java.util.Scanner;
        /**
         * Programa que muestre, cuente, sume los impares que hay entre 1 y un número positivo
         * // introducido por teclado
         * //Introduce valor : 10
         * //  2 4 6 8 10
         * //
         * //  Hay : 5 impares
         * //
         * //  Suman 30/
         */
public class Bucles4_Impares {

    static Scanner telclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un valor");
        int numero = telclado.nextInt();

        if (numero < 0){
            System.out.println("Error. Los valores tienen que ser positivos");
        } else {

            int contador=0;
            int impares=0;
            int suma = 0;

            while (contador < numero){
                System.out.println(contador);
                contador=contador+1;
                contador++;

                suma= suma+contador;

                impares++;
            }
            System.out.println("Hay " + impares + " impares");
            System.out.println("Suman " + suma);
        }
    }


}
