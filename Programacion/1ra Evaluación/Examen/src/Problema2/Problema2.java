/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class Problema2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce numero DNI:");
        String dni = teclado.next(); //Pido el numeor mediante un string
        int DNI_numero = Integer.parseInt(dni);
        //casteo el numero, por que si no, no pria dividirco con el modulo ( 23)
        do {
            System.out.println("Error. El DNI debe tener 8 dígitos");
            System.out.print("Introduce numero DNI:");
            dni = teclado.next();

        } while (dni.length() == 8 || dni.length() <= 8);
        String letra = "";

        switch ((DNI_numero % 23)) {
            case 1:
                letra = ("R");
                break;
            case 2:
                letra = ("W");
                break;
            case 3:
                letra = ("A");
                break;
            case 4:
                letra = ("G");
                break;
            case 5:
                letra = ("M");
                break;
            case 6:
                letra = ("Y");
                break;
            case 7:
                letra = ("F");
                break;
            case 8:
                letra = ("P");
                break;
            case 9:
                letra = ("D");
                break;
            case 10:
                letra = ("X");
                break;
            case 11:
                letra = ("B");
                break;
            case 12:
                letra = ("N");
                break;
            case 13:
                letra = ("J");
                break;
            case 14:
                letra = ("Z");
                break;
            case 15:
                letra = ("S");
                break;
            case 16:
                letra = ("Q");
                break;
            case 17:
                letra = ("V");
                break;
            case 18:
                letra = ("H");
                break;
            case 19:
                letra = ("L");
                break;
            case 20:
                letra = ("C");
                break;
            case 21:
                letra = ("K");
                break;
            case 22:
                letra = ("E");
                break;

        }
        System.out.println("Letra " + letra);
    }
}
