/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_4_TablaMultiplicar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el numero el cual quieres multiplicar: ");
        int numero = teclado.nextInt();

        int contador = 0;

        while (contador <= 10) {
            System.out.println(numero + " * " + contador + " = " + numero * contador);
            contador++;
        }
    }
}
