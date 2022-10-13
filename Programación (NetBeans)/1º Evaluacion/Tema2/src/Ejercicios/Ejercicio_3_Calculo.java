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

        String mensaje = (eleccion==Integer.MIN_VALUE) ? "Error.Operacion no contemplada"
                                                       : "eleccion = " + eleccion;

        System.out.print(eleccion);
    }
}
