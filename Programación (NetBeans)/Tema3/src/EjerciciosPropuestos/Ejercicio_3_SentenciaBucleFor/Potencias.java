/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Tema3.src.EjerciciosPropuestos.Ejercicio_3_SentenciaBucleFor;

public class Potencias {

    //Hacer un programa que imprima por pantalla todas las potencias de 2 entre 1 y
    //100 utilizando un bucle for

    public static void main(String[] args) {

        int potencia = 2;
        int aleatorio = 0;

        for (int i = 1; i <= 100; i++) {

             aleatorio = (int) Math.pow(2,i);
        }

        System.out.println(aleatorio);
    }
}
