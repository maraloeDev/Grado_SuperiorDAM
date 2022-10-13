/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Tema3.src.Ejercicios;

import java.util.Scanner;

public class Ejercicio_1_EstanEnOrden {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n1 = teclado.nextInt();
        System.out.println("--------------");

        int n2 = teclado.nextInt();
        System.out.println("--------------");

        int n3 = teclado.nextInt();

        if ((n1 == n2) && (n2 == n3) && (n1 == n3)) {
            System.out.println("Son iguales");
        } else if ((n1 > n2) && (n2 > n3) && (n1 > n3)) {
            System.out.println("Estan ordenados ascendentemente");
        } else if ((n1 < n2) && (n2 < n3) && (n1 < n3)) {
            System.out.println("Estan ordenados descendentemente");
        } else {
            System.out.println("Estan desordenados");

        }
    }
}