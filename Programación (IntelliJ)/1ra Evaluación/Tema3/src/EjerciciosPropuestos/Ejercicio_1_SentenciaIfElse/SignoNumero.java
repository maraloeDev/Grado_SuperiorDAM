/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Tema3.src.EjerciciosPropuestos.Ejercicio_1_SentenciaIfElse;

import java.util.Scanner;

public class SignoNumero {


    // Hacer un programa llamado SignoNumero que reciba por teclado un número real
    // e imprima por pantalla si el número es positivo, negativo o cero.
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        double n1 = teclado.nextInt();

        if (n1 > 0) {
            System.out.println(n1 + " es positivo");
        } else if (n1 < 0) {
            System.out.println(n1 + " es negativo");
        } else {
            System.out.println(n1 + " es cero");
        }
    }
}
