/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejemplos.Bucle_For;

public class Anidados3 {

    public static void main(String[] args) {

        int base = (int) (10 * Math.random() + 2);

        for (int i = 1; i <= base; i++) {

            for (int j = base; j >= i; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
