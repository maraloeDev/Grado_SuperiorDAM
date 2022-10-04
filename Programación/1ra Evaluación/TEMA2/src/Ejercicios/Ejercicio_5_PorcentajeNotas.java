/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_5_PorcentajeNotas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero correspondiente al numero de sobresalientes :");
        int n1 = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de notables :");
        int n2 = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de aprobados :");
        int n3 = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de suspensos :");
        int n4 = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de no presentados :");
        int n5 = teclado.nextInt();

        System.out.print("El numero total de alumnos es de: " + (n1+n2+n3+n4+n5) + " alumnos");




    }
}
