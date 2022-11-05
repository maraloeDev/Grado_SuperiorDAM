/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejemplos.Bucle_For;

public class Anidados4 {

    /**
      *
      **
      ***
      ****
      ***
      **
      *
     * @param args
     */
    public static void main(String[] args) {
        int base = (int) (10 * Math.random() + 2);

        for (int i = 0; i <= base; i++) {

            for (int j = 1; j <= base; j++) {
                for (int k = 0; k <= base; k++) {
                    System.out.println("*");

                }

            }
            System.out.println();
        }


    }
}
