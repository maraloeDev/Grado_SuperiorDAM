/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class toFahrenheit {

    static Scanner teclado = new Scanner(System.in);
    static float celsius;

    public static void Farenheit() {
        System.out.println("Indique una temperatura en grados Celsius : ");

        celsius = teclado.nextInt();
        
        float f = (celsius * 9 / 5) + 32;
        System.out.println(f);
    }

    public static void main(String[] args) {

        
        Farenheit();
    }

}
