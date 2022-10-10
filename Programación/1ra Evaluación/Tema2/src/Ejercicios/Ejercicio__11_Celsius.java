/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio__11_Celsius {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique una temperatura en grados Celsius : ");

        float Celsius = teclado.nextInt();

        float f = (Celsius * 9 / 5) + 32;
        System.out.println(f);
    }
}
