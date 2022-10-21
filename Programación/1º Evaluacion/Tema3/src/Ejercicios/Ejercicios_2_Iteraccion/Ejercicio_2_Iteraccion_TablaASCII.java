/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.Ejercicios_2_Iteraccion;

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
