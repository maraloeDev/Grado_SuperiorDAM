/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios.Ejercicios_dia_Huelga;

import java.util.AbstractList;
import java.util.Scanner;

public class Ejercicio_4 {

    /**
     * Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz.
     * Repetir el proceso tantas veces como deseemos.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String respuesta = "S";

         while (respuesta == "S"){

            for (int i = (int) (Math.random()*10); i <= 10; i++) {

                if (i < 5){
                    System.out.println("Ha salido cara");
                } else {
                    System.out.println("Ha salido cruz");
                }
            System.out.println("Quiere volver a repetir la tirada (S o N)");
            respuesta= teclado.nextLine();
            }

         }

    }
}

