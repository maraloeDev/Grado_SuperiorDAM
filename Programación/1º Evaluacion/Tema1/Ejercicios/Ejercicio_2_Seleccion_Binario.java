/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_2_Seleccion_Binario {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce bit 2");
        char bit2 = teclado.next().charAt(0);

        System.out.println("Introduce bit 1");
        char bit1 = teclado.next().charAt(0);

        System.out.println("Introduce bit0 ");
        char bit0 = teclado.next().charAt(0);

        if (bit2 != 0 && bit2 != 1 || bit1 != 0 && bit1 != 1 || bit0 != 0 && bit0 != 1) {
            System.out.println("El numero es Incorrecto");
        } else {
            int resultado = (bit2 + 2 * bit1 + bit0 + bit0 * 1);
            System.out.println("El resultado decimal es: " + resultado);
        }
    }

}
