/*
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 */

package Problema1;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        int adivina = (int) (Math.random() * 100) + 1; //Numero aleatorio entre 1 y 100
    int minimo=1; //Numero minimo
    int maximo=100; //Numero maximo
    boolean acierto =false;

    while (acierto==false){
        System.out.println("El nº secreto está entre " + minimo + " y " + maximo + "\n" +
                "¿Cuál es?");
        int numero = teclado.nextInt();

        if (numero==adivina){
            System.out.println("Acertaste!!");
            acierto=true;

        } else {
            if (adivina > (minimo + maximo) /2){
                minimo= (int) (minimo + maximo) / 2;
                System.out.println("El nº secreto está entre " + minimo + " y " + maximo + "\n" +
                        "¿Cuál es?");

            } else {
                maximo= (int) (minimo + maximo) / 2;
                System.out.println("El nº secreto está entre " + minimo + " y " + maximo + "\n" +
                        "¿Cuál es?");
            }

        }
    }

    }
}
