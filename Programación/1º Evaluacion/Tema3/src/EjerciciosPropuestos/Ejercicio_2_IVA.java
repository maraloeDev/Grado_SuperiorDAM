/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package EjerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio_2_IVA {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //Realiza un programa que solicite al usuario una cantidad (real) 
        //y el tipo de IVA (G: 21%, R: 10%, S: 4%), y muestre el desglose de la siguiente forma:
        //
        //BI: (base imponible -> total menos el IVA)
        //
        //IVA: (% de IVA aplicado sobre la base imponible)
        //
        //Por ejemplo, si la cantidad es 1210 y el IVA es G, el resultado del programa será:
        //
        //BI: 1000
        //
        //IVA: 210
        System.out.println("Introduce una cantidad en euros ");
        double bi = teclado.nextDouble();
        
        double G = (bi * 0.21);
        double R = (bi * 0.10);
        double S = (bi * 0.04);

        System.out.println("--------------");

        System.out.println("Introduce el tipo de IVA " + "\n"
                + " G: 21% " + "\n"
                + " R: 10% " + "\n"
                + " S: 4% ");
        String eleccion = teclado.next();

        switch (eleccion) {

            case "G", "g":
                System.out.println("BI : " + bi + "\n"
                        + "IVA : " + G);
                break;
            case "R", "r":
                System.out.println("BI : " + bi + "\n"
                        + "IVA : " + R);
                break;
            case "S", "s":
                System.out.println("BI : " + bi + "\n"
                        + "IVA : " + S);
                break;
            default:
                System.out.println("Numero no contenplado ");
        }

    }
}
