/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios.Ejercicios_2_Iteraccion;

import java.util.Scanner;

public class Ejercicio_4_InvertirEntero {

    /**
     * Escribe un programa llamado InvertirEntero que invierta los dígitos de un
     * entero dado por el usuario. Para ello convierte el número a cadena.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        String numero = String.valueOf(teclado.next());

        String resultado = "";

        int invertido = numero.length() - 1;

        while (invertido >= 0) {
            resultado = resultado + numero.charAt(invertido);
            invertido--;
        }
        System.out.println("El numero real " + numero + " invertido es " + resultado);
    }
}
