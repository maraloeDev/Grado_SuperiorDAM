package Problema1;

import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author maraloed
 */
public class Problema1 {

    public static void main(String[] args) {
        //Creación del objeto Scanner para la introduccion de datos por parte del usuario
        Scanner teclado = new Scanner(System.in);
        double adivina;
        int numero;
        //Inicio de la pregunta
        System.out.print("El numero secreto está entre 1 y 100\n"
                + "Cual es ");
        numero = teclado.nextInt();
        do {
            //Generación de aleatorios emtre 1 y 100 mediante el objeto Random
            adivina = (Math.random() * 99) +1;
            //Cuando falla la pregunta, aparecera la siguiente frase
            System.out.println("Lo siento...");
            System.out.print("El numero secreto está entre 1 y 100\n"
                    + "Cual es ");
            numero = teclado.nextInt();
            if (numero < 0 || numero > 100) {
                System.out.println("FUERA DE RANGO");
                System.out.print("El numero secreto está entre 1 y 100\n"
                        + "Cual es ");
                numero = teclado.nextInt();
            }

        } while (numero != (int) adivina);
        System.out.println("Acertaste!!");
    }

}
