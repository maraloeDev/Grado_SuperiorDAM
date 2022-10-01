/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class GetASCIICodeFromChar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un caracter : ");

        char caracter = teclado.nextLine().charAt(0);

        System.out.println("La palabra elegida pasada a ASCII es :" + (int) caracter);
    }
}
