/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class Ejercicio_2_Divisor {

    Scanner teclado = new Scanner(System.in);

    public static int divisor(int numero) {
        int i = numero - 1;
        while (i > 0);
        {
            if (numero % 1 == 0) {
                return i;
            } else {
                i--;
            }
        }
        return numero;
    }

}
