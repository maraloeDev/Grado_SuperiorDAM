/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class GetCharFromAsciiCode {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero :");

        double numAscii= teclado.nextDouble();

        System.out.println("El numero introducio pasado a letra es el " + (char) numAscii);
    }
}
