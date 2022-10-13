/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3_MiNota {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 4 numeros entre 0 y 100");

        int n1 = teclado.nextInt();
        System.out.println("-------------------------");

        int n2 = teclado.nextInt();
        System.out.println("-------------------------");

        int n3 = teclado.nextInt();
        System.out.println("-------------------------");
        int n4 = teclado.nextInt();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("La media de los numeros es de " + media);

        if (media == 90 || media == 100) {
            System.out.println();
            System.out.println("A");
        } else if (media == 80 || media <= 89) {
            System.out.println();
            System.out.println("B");
        } else if (media == 70 || media <= 79) {
            System.out.println();
            System.out.println("C");
        } else if (media == 60 || media <= 69) {
            System.out.println();
            System.out.println("D");
        } else if (media == 0 || media <= 59) {
            System.out.println();
            System.out.println("E");
        }
    }
}
