/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.POO.Punto;

public class PuntoApp {

    public static void main(String[] args) {

        Punto p1 = new Punto(45,87);

        System.out.println(p1);

        System.out.println("------------------------------------------");

        p1.distancia(2,3);

        System.out.println("El DESPLAZAMIENTO ES " + '\n' + p1);

        System.out.println("------------------------------------------");

        System.out.println("LA DISTANCIA ENTRE X e Y ES " + '\n' + p1 );
    }

}
