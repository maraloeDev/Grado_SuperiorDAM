/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;
//Ejemplos de operadores relacionales, aritmeticos y logicos

import java.util.Scanner;

public class Operadores {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //Aritmeticos
        System.out.println("OPERACIONES ARITMETICAS");
        System.out.println("-----------------------");

        System.out.print("Introduce primer numero");
        double n1 = teclado.nextDouble();

        System.out.print("Introduce segundo numero");
        double n2 = teclado.nextDouble();

        double suma = n1 + n2;
        double resta = n1 - n2;
        double producto = n1 * n2;
        double division = n1 / n2;
        double resto = n1 % n2;

        System.out.println("\tSuma " + suma);
        System.out.println("\tResta " + resta);
        System.out.println("\tProducto " + producto);
        System.out.println("\tDivision " + division);
        System.out.println("\tResto " + resto);

        System.out.println();
        //Relacionales
        System.out.println("COMPARACIONES");
        System.out.println("-------------");

        boolean mayor = (n1 > n2);
        boolean menor = (n1 < n2);
        boolean iguales = (n1 == n2);
        boolean distinto = (n1 != n2);

        System.out.println("\tn1 es mayor que n2 : " + mayor);
        System.out.println("\tn1 es menor que n2 : " + menor);
        System.out.println("\tn1 es igual que n2 : " + iguales);
        System.out.println("\tn1 es distinto que n2 : " + distinto);




    }
}
