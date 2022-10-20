/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.util.Scanner;

public class Bucles5 {

    /**
     * NUMEROS Programa que pida al usuario enteros repetidamente, hasta que
     * conteste no a una pregunta
     * <p>
     * Ejemplo :
     * <p>
     * Introduce un número : 2 ¿Quieres continuar? (S o N) S Introduce un número
     * : -8 ¿Quieres continuar? (S o N) N
     * <p>
     * Has introducido XX numeros Adios...
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        char respuesta = 'S';
        int contador = 0;
        while (respuesta == 'S') {
            System.out.print("Introduce un numero ");
            int numero = teclado.nextInt();
            contador++;

            if (respuesta == 'S' || respuesta == 's') {

                System.out.print("¿Quieres continuar? (S/N) ");
                respuesta = teclado.next().charAt(0);

            } else if (respuesta == 'N' || respuesta == 'n') {
                System.out.println("Adios...");
            }

        }
            System.out.println("Has introducido " + contador + " numeros");
    }

}
