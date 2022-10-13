/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Tema3.src.Ejercicios;

import java.util.Scanner;

public class Ejercicio_2_Binario {

    static  Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribe 3 numeros binarios");

        int b2 = teclado.nextInt();
        if (b2 !=0 && b2!=1){
            System.out.println("No has introducido un numero binario");
        }
        System.out.println("-------------------");

        int b1 = teclado.nextInt();
        if (b1 !=0 && b1!=1){
            System.out.println("No has introducido un numero binario");
        }
        System.out.println("-------------------");

        int b0 = teclado.nextInt();
        if (b0 !=0 && b0!=1){
            System.out.println("No has introducido un numero binario");
        }

        if (b0 > b1 && b0 > b2){
            System.out.println("La suma es de " + (b2 + b1 + b0));
        }






    }
}
