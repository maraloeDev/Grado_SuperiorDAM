/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios.Ejercicios_dia_Huelga;

/**
 * Simular cien tiradas de dos dados y contar las veces que entre los dos suman 10.
 */

public class Ejercicio_5 {

    public static void main(String[] args) {

        int contador=0;
        int veces = 0;
        while (contador < 100){
            int dado1 = (int) (Math.random() *6) +1 ;
            int dado2 = (int) (Math.random() *6) +1 ;

            System.out.println("Tirada " + contador + " " + 1);
            System.out.println("------------------------------------");
            System.out.println("Dado 1 " + dado1);
            System.out.println("Dado 2 " + dado2);

            if (dado1 + dado2==10){
                veces++;
            }else {
                contador++;
            }
        }
        System.out.println("Ha salido el 10 " + veces + " veces");






    }
}