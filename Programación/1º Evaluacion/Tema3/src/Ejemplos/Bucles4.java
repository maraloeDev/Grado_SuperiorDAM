package Ejemplos;

import java.awt.*;
import java.util.Scanner;

public class Bucles4 {

    /**
     * Programa que muestre. cuente. sume los pares que hay entre 1 y un numero positivo
     * // introducido por teclado
     * //  Introduce valor : 10
     * //  2 4 6 8 10
     * //
     * //  Hay : 5 pares
     * //
     * //  Suman 30/
     */

    //Hay 5 pares suman 30
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un numero : ");
        int num = teclado.nextInt();
        int contpares = 0;
        int contador = 2;
        int suma = 0;

        if (num <0 ){
            System.out.println("NO SE PUEDE");
        } else {

        while (contador <= num) {

            System.out.println(contador);
            contador=contador+1;
            contpares++;
            contador++;

            suma= suma + contador;
        }
        System.out.println("Hay " + contpares + " pares");
        System.out.println("Suman " + (suma));
        }




    }
}
