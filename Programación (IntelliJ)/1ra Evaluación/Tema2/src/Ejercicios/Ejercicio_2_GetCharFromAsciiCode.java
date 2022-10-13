/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_2_GetCharFromAsciiCode {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numeroAscii = teclado.nextInt();

        System.out.println("El numero que has introducido en valor ascii es  " + (char) numeroAscii);
    }
}
