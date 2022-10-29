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
String respuesta="S";
        do {
            System.out.println("Introduce un numero");
            int numero = teclado.nextInt();
            System.out.println("Quieres volver a introducir un numero??? (S o N)");

            } else{
                System.out.println("Has acabado");
            }

        }while (respuesta=="S");

    }
}
