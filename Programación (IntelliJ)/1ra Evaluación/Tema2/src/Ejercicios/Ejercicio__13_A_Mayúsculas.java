/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio__13_A_Mayúsculas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduze un caracter en  minusculas del alfabeto de la a a la z : ");
        char caracter = teclado.next().charAt(0);
//Comprobación de minusculas
        String resultado1 = (caracter >=97 && caracter<=122) ? "Su mayuscula es :" + (char)(caracter-32) 
                : "Error";
        System.out.println(resultado1);
        

    }
}
