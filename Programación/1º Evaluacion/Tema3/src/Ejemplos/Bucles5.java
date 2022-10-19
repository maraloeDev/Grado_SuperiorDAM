/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejemplos;

import java.util.Scanner;

public class Bucles5 {

    /**
     * NUMEROS
     * Programa que pida al usuario enteros repetidamente, hasta que conteste no a una pregunta
     * <p>
     * Ejemplo :
     * <p>
     * Introduce un número : 2
     * ¿Quieres continuar? (S o N) S
     * Introduce un número : -8
     * ¿Quieres continuar? (S o N) N
     * <p>
     * Has introducido XX numeros
     * Adios...
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String respuesta = "S";
        int numero=0;
        int contador = 0;

        while (respuesta == "S"){

            System.out.println("Introduce un numero");
            numero = teclado.nextInt();
            contador++;

            System.out.println("¿Quieres continuar? (S / N)");
            respuesta = teclado.next();

            if (respuesta == "N") {

                System.out.println("Has introducido " + contador + " numeros");
            } else {
                System.out.println("Salida inesperada");
            }

        }


    }

}

