/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

public class Ejercicio_2_Iteraccion_TablaASCII {

    public static void main(String[] args) {
        int carac = 255;
        int minimo = 0;

        while (carac >= minimo){

            System.out.println(carac + " " + (char)carac);
            carac--;
        }
    }
}
