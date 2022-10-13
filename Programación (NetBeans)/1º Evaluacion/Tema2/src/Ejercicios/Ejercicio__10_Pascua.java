/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;


import java.util.Scanner;

public class Ejercicio__10_Pascua {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un anio");
        int anio = teclado.nextInt();

        System.out.println("El año elegido es " + anio);

        /////CALCULO/////
        int A = anio % 19;
        int B = anio % 4;
        int C = anio % 7;;
        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        int N = 22 + D + E; //Puede estar entre 1 y 61

        String pascua=
                (N <= 31)  ? " El domingo de pascua sera el " + N + " de Marzo" :
                (N >= 31)  ? " El domingo de pascua sera el " + (N-31) + " de Abril":"0";

        System.out.println(pascua);


    }
}
