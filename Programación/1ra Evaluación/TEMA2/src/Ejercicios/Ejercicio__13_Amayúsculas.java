/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio__13_Amayúsculas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduze un caracter en  minusculas del alfabeto de la a a la z : ");

        char alfabeto = teclado.next().charAt(0);

        char eleccion =
        (alfabeto == 'a') ? 'A' :
        (alfabeto == 'b') ? 'B' :
        (alfabeto == 'c') ? 'C' :
        (alfabeto == 'd') ? 'D' :
        (alfabeto == 'E') ? 'E' : '0';

        String minEsta =
        (alfabeto == 'a') ? "esta en minusculas" :
        (alfabeto == 'b') ? "esta en minusculas" :
        (alfabeto == 'c') ? "esta en minusculas" :
        (alfabeto == 'd') ? "esta en minusculas" :
        (alfabeto == 'E') ? "esta en minusculas" : "No esta en minusculas";
        System.out.println();
        System.out.println("El Caracter  " + alfabeto + " en mayusculas es " + eleccion);

        System.out.println();
        System.out.println();

        System.out.println("El caracter que has intoducido " + minEsta);
    }
}
