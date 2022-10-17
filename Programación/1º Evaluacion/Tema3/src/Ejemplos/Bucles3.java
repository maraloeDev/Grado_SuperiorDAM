/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.util.Scanner;

public class Bucles3 {

    public static void main(String[] args) {
        //Numeros naturares entre 2 valores introducidos por teclado 
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un numero");
        int num = teclado.nextInt();

        System.out.print("Escribe un numero");
        int num2 = teclado.nextInt();

        if (num2 <= 0 || num2 <= 0) {
            System.out.println("Los valores deben de ser positivos");
        } else {

            while (num >= num2) {
                System.out.println(num);
                num--;
            }

            while (num <= num2) {
                System.out.println(num);
                num++;
            }

        }
    }
}
