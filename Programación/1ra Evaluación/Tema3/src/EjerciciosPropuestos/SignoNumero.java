/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package src.EjerciciosPropuestos;

import java.util.Scanner;

public class SignoNumero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int n1 = teclado.nextInt();

        if (n1 > 0){
            System.out.println(n1 + " es positivo");
        } else if (n1 == 0 ) {
            System.out.println(n1 + " es 0");
        } else {
            System.out.println(n1 + " es negativo");
        }
    }
}
