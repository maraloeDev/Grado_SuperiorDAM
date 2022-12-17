package Problema1;

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

        int adivina = (int) (Math.random() * 100) + 1;
        int max=100;
        int min=1;
       
        boolean acierto = false;
        //Inicio de la pregunta
        System.out.println(adivina);
        System.out.println("El numero secreto está entre"+ min + "y" + max  + ". Cual es ");
        while (acierto == false){
            
            int numero = teclado.nextInt();
            if (numero==adivina){
             System.out.println("Acertaste!!");
             acierto=true;
            } else{
                if(adivina > (max+min)/2){
                    min= (int)(min+max)/2;
                    System.out.println("El numero secreto está entre " + min+ " y " + max + "Cual es? ");
              
                    
                } else{
                    max=(int)(min+max)/2;
                    System.out.println("El numero secreto está entre " + min+ " y " + max + "Cual es? ");
                }
            }
            
        }


    }

}
