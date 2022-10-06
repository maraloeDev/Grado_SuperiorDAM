/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

public class Ejercicio_6_Intercambio {

    public static void main(String[] args) {
        int a = 10;
        int b = 22;

        int x = a;

        a=b;
        b=x;

        System.out.println("Las varianbles se inicializar con los soguientes valores fijos :" +
                "\n a = " + a + " \n b = " + b);

        System.out.println("El valor de a es ahora " + (a));
        System.out.println("El valor de b es ahora " + (b));

    }
}
