/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.Ejercicios_2_Iteraccion;

import java.util.Scanner;

public class Ejercicio_4_InvertirEntero {
    /**
     * Escribe un programa llamado InvertirEntero que invierta los dígitos de un entero dado por el
     * usuario. Para ello convierte el número a ca
     * dena.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();

        String longitud = String.valueOf(numero);
        int total = longitud.length();

        while (total >= longitud.length() ){
            total--;
        }
        System.out.println(total);

        //int numero = teclado.nextInt();
//
        //String mensaje = String.valueOf(numero);
        //StringBuilder cadena = new StringBuilder(mensaje);
        //String fin = cadena.reverse().toString();
        //System.out.println("El numero invertido " + numero + " invertido es " + fin);
    }
}
