/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_7_Minutos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero de segundos ");
        int segundos = teclado.nextInt();
        int intercambio = (segundos / 60);
        int intercambio2 = (segundos % 60);

        System.out.println(segundos + " s = " + intercambio + " m " + intercambio2 + " s");
    }
}
