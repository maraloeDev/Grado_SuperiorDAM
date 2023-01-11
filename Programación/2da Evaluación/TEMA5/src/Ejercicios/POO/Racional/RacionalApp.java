/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.POO.Racional;

/**
 *
 * @author COOLBOX_SSD5
 */
public class RacionalApp {

    public static void main(String[] args) {
        Racional racional1 = new Racional(12, 24);
        Racional racional2 = new Racional(25,14);

        System.out.println(racional1.toString());
        
        System.out.println("SUMA " + racional1.sumar(racional1));
        
        System.out.println("RESTA " + racional1.resta(racional1));
        
        System.out.println("MULTIPLICACIoN " + racional1.producto(racional1));
        
        System.out.println("DIVISION " + racional1.dividir(racional1));

    }

}
