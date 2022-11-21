/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class Ejercicio_2_Invertir {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cadena original :");
        String cadena1 = teclado.nextLine();

        String inverso = "";

        for (int i = 0; i < cadena1.length(); i++) {
            char caracter = cadena1.charAt(i);

            if (Character.isLowerCase(caracter)) {
                inverso = inverso + Character.toUpperCase(caracter);
            } else {
                inverso = inverso + Character.toLowerCase(caracter);
            }

        }
        System.out.println(inverso);
    }

}
