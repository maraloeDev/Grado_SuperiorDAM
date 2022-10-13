
/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Switch;

import java.util.Scanner;

public class Vocales {

    //Hacer un programa llamado Vocales que reciba por teclado un carácter y
    //muestre por pantalla si se trata de una vocal o no. Hacer el programa con
    //sentencias if anidadas en primer lugar y después con una estructura
    //switch.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un caracter");

        char caract = teclado.next().charAt(0);

        /*********************** IF - ELSE /************************/

        //if (caract == 'a') {
        //    System.out.println(caract + " es una vocal");
        //} else if (caract == 'e') {
        //    System.out.println(caract + " es una vocal");
//
        //} else if (caract == 'i') {
//
        //    System.out.println(caract + " es una vocal");
//
        //} else if (caract == 'o') {
//
        //    System.out.println(caract + " es una vocal");
//
        //} else if (caract == 'u') {
//
        //    System.out.println(caract + " es una vocal");
        //} else {
        //    System.out.println(caract + " NO es una vocal");
        //}

        /*********************** SWITCH /************************/

        switch (caract){

            case 'a' :
                System.out.println(caract + " es una vocal");
                break;
            case 'e' :
                System.out.println(caract + " es una vocal");
                break;
            case 'i' :
                System.out.println(caract + " es una vocal");
                break;
            case 'o' :
                System.out.println(caract + " es una vocal");
                break;
            case 'u' :
                System.out.println(caract + " es una vocal");
                break;
            default:
                System.out.println("No es una vocal");

        }

    }

}
    

