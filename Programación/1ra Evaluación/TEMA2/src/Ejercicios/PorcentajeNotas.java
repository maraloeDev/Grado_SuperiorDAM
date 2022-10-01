/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class PorcentajeNotas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero");
        int n1= teclado.nextInt();

        if (n1 < 5){
            System.out.println("S");
        } else if (n1 == 5 ) {
            System.out.println("N");
        } else if (n1 ==6) {
            System.out.println("A");
        } else if (n1 > 7 ) {
        System.out.println("SB");
        } else if (n1 == 0) {
            System.out.println("NP");
        }

        System.out.print("Introduce un numero");
        int n2= teclado.nextInt();


        if (n2 < 5){
            System.out.println("S");
        } else if (n2 == 5 ) {
            System.out.println("N");
        } else if (n2 ==6) {
            System.out.println("A");
        } else if (n2 > 7 ) {
            System.out.println("SB");
        } else if (n2 == 0) {
            System.out.println("NP");
        }

        System.out.print("Introduce un numero");
        int n3= teclado.nextInt();

        if (n3 < 5){
            System.out.println("S");
        } else if (n3 == 5 ) {
            System.out.println("N");
        } else if (n3 == 6) {
            System.out.println("A");
        } else if (n3 > 7 ) {
            System.out.println("SB");
        } else if (n3 == 0) {
            System.out.println("NP");
        }

        System.out.print("Introduce un numero");
        int n4= teclado.nextInt();

        if (n4 < 5){
            System.out.println("S");
        } else if (n4 == 5 ) {
            System.out.println("N");
        } else if (n4 ==6) {
            System.out.println("A");
        } else if (n4 > 7 ) {
            System.out.println("SB");
        } else if (n4 == 0) {
            System.out.println("NP");
        }

        System.out.print("Introduce un numero");
        int n5= teclado.nextInt();

        if (n5 < 5){
            System.out.println("S");
        } else if (n5 == 5 ) {
            System.out.println("N");
        } else if (n5 ==6) {
            System.out.println("A");
        } else if (n5 > 7 ) {
            System.out.println("SB");
        } else if (n5 == 0) {
            System.out.println("NP");
        }

        

        int total = (n1+n2+n3+n4+n5);



        System.out.println("El total de alumnos que hay en clase es de " + total);


    }
}
