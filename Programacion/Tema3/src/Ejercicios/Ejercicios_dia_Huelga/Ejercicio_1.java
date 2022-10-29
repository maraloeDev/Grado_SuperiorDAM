/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios.Ejercicios_dia_Huelga;

import java.awt.font.NumericShaper;
import java.util.Scanner;

public class Ejercicio_1 {

    /**
     * Introducir por teclado una serie de números. Sumar los múltiplos de 5, decir cuál es el mayor y cuántos números se han introducido
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        char respuesta = 'S';
        int contador = 0;
        int numero = 0;
        int multiploCinco = 5;

        while (respuesta == 'S') {
            System.out.print("Introduce un numero");
            numero = teclado.nextInt();
            contador++;

            System.out.print("Quiere volver a introducir el numero? (S o N)");
            respuesta = teclado.next().charAt(0);

            if ((numero % 5) == 0) {
                numero += multiploCinco;

            } else {

                System.out.println("El numero que has introducido NO es un multiplo de 5");
            }

        }
        System.out.println("Has acabado...");
        System.out.println("El total de los numeros es de " + multiploCinco);
    }
}


