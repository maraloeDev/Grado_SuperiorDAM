/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

import java.util.Scanner;

/**
 *
 * @author Eduardo Martín-Sonseca
 */
public class Problema1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double aleatorio = (int) (Math.random() * 100) + 1;
        int numero;
        int max = 100;
        int min = 1;
        boolean acierto = false;

        System.out.println("El numero secreto está entre " + min + " y " + max + "\n"
                + "Cual es");

        while (acierto == false) {

            numero = teclado.nextInt();
            if (numero == aleatorio) {
                System.out.println("Acertaste!!!");

                acierto = true;

            } else {
                if (aleatorio > (min + max) / 2) {
                    min = (min + max) / 2;

                    System.out.println("El numero secreto está entre " + min + " y " + max + "\n"
                            + "Cual es");
                } else {

                    max = (min + max) / 2;

                    System.out.println("El numero secreto está entre " + min + " y " + max + "\n"
                            + "Cual es");

                }
            }

        }

    }

}
