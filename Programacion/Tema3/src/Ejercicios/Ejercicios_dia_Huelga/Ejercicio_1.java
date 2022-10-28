/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios.Ejercicios_dia_Huelga;

import java.awt.font.NumericShaper;
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        char respuesta = 'S';
        int contador = 0;
        int multiploCinco=0;
        int total = 0;
        int numero=0;

        while (respuesta == 'S') {
            System.out.print("Introduce un numero ");
             numero = teclado.nextInt();

            System.out.print("¿Quieres continuar? (S/N) ");
            respuesta = teclado.next().charAt(0);
            contador++;

            if (respuesta == 'N' || respuesta == 'n') {
                System.out.println("Adios...");
            } else if (numero % 5 == 0 ) {
                total = total + numero;
            }
             else {
                System.out.println("El numero introducido no es multiplo de cinco");
            }
        }
        System.out.println("Has introducido " + contador + " numeros");
        System.out.println("La suma de todos los multiplos de cinco es " + numero );

    }
}
