/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class MayordDe3 {
        static Scanner teclado = new Scanner(System.in);
public static void elMayor(){
        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();

        System.out.println("Introduce un numero: ");
        int numero2 = teclado.nextInt();

        System.out.println("Introduce un numero: ");
        int numero3 = teclado.nextInt();

        if ((numero >numero2) && (numero > numero3)){

            System.out.println("El numero mas mayor es " + numero);
        } else if ((numero2 > numero) && (numero2 > numero3) ) {
            System.out.println("El numero mas mayor es " + numero2);
        } else {
            System.out.println("El numero mas mayor es " + numero3);
        }

        }
    public static void main(String[] args) {
    elMayor();
    }

}
