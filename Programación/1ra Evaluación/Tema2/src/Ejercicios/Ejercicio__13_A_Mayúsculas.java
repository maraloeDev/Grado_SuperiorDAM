/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio__13_A_Mayúsculas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduze un caracter en  minusculas del alfabeto de la a a la z : ");

        char caracter = teclado.next().charAt(0);
        
        String eleccion = (caracter >= 97) && (caracter <= 122) ? "El caracter " + caracter + " esta en minusculas" :
                          (caracter >= 65) && (caracter <= 90)  ? "El caracter " + caracter + " esta en mayusculas" : "Esta fuera de rango";

        System.out.println(eleccion);
    }
}
