/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class Ejercicio_1_2_3 {

    static Scanner teclado = new Scanner(System.in);
    static float celsius;

    public static void Farenheit() {
        System.out.println("Indique una temperatura en grados Celsius : ");

        celsius = teclado.nextInt();
        
        float f = (celsius * 9 / 5) + 32;
        System.out.println(f);
    }



    public static int divisor(int numero) {
        System.out.println("Introduce un numero :");
        numero= teclado.nextInt();
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
    public static boolean esPar(boolean par) {
        System.out.println("Introduce un numero :");
        int numero = teclado.nextInt();


        par= ((numero % 2) == 0);
        return par;
    }

}
