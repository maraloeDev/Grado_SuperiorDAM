/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Tema3.src.EjerciciosPropuestos.Ejercicio_3_SentenciaBucleFor;

public class Pares {

    //Hacer un programa que sume los números pares positivos menores o iguales
    //que 100 utilizando un bucle for.

    public static void main(String[] args) {

        int resultado = 0;
        int i;

        for ( i = 0; i <= 100 ; i++) {
            if (i % 2 == 0 ){
                System.out.println(i);
            }
            resultado++;

        }
            System.out.println("La suma de todos los numeros pares es de :" + (resultado + i) );

    }
}
