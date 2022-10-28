/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
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
        int j =0;
        while (j < numero.length()){
            if (!Character.isDigit(numero.charAt(j))){ //Si el caracter no es un dígito, entonces

                System.out.println("Error");
            }
            j++;
        }
        String resultado = "";

        int invertido = numero.length() - 1;

        while (invertido >= 0) { //Se incluye 0 por que es el primero character
            resultado = resultado + numero.charAt(invertido);
            invertido--;
        }
        System.out.println("El numero real " + numero + " invertido es " + resultado);
    }
}
