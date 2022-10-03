/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3_Calculo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un  numero");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce un  numero");
        int numero2 = teclado.nextInt();


            //HACER CON OPERADOR TERNARIO

        System.out.println("\tSelecciona un operador \n +\n -\n *\n / \n %");

        String operador = teclado.next();

        int eleccion =

                (operador == "+") ? (numero1 + numero2) :
                (operador == "-") ? (numero1 - numero2) :
                (operador == "*") ? (numero1 * numero2) :
                (operador == "/") ? (numero1 / numero2) :
                (operador == "%") ? (numero1 % numero2) : 0;
        System.out.println("-----------------------------");

        System.out.println(eleccion);



             //HACER CON SWITCH

        //System.out.println("\tSelecciona un operador \n\t 1. +\n\t 2. -\n\t 3. *\n\t 4. /\n\t 5. %");
//
        //int eleccion =teclado.nextInt();
//
        //switch (eleccion){
//
        //    case 1 :
        //        System.out.println((numero1 + numero2));
//
        //    case 2 :
        //        System.out.println((numero1 - numero2));
//
        //    case 3 :
        //        System.out.println((numero1 * numero2));
//
        //    case 4 :
        //        System.out.println((numero1 / numero2));
//
        //    case 5 :
        //        System.out.println((numero1 % numero2));
        //}

        //NORMAL
        //System.out.println("\tSUMA " + (numero1 + numero2));
        //System.out.println("\tRESTA " + (numero1 - numero2));
        //System.out.println("\tMULTIPLICACION " + (numero1 * numero2));
        //System.out.println("\tDIVISION " + (numero1 / numero2));
        //System.out.println("\tRESTO " + (numero1 % numero2));
    }
}
