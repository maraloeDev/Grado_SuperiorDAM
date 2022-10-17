/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.util.Scanner;

public class Bucles2 {

    //Mostrar numeros naturales entre 0 y 100
    public static void main(String[] args) {
//        int cont = 0;
//
//        while (cont <= 100) {
//            System.out.println(cont);
//            cont++;
//        }

        //Mostrar numeros pares entre 0 y 100
//        int cont = 0;
//        while (cont <= 100) {
//
//            cont = cont + 2;
//            System.out.println(cont);
//        }
        //Numeros naurales entre 100 y 0
//        int cont = 100;
//        
//        while( cont >= 0){
//            
//            System.out.println(cont);
//            cont--;
//        }
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
