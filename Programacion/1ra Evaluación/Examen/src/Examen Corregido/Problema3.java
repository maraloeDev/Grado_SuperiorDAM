/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.time.LocalDateTime;

/**
 *
 * @author ortsanma
 */
public class Problema3 {
    public static void main(String[] args) {
        LocalDateTime ahora = LocalDateTime.now();//Cogemos la fecha y hora del momento
        //Las sacamos para ver la fecha y hora que ha recogido
        System.out.println("(fecha:" + ahora.getDayOfMonth() + "/"+ahora.getMonthValue()+"/"+ (ahora.getYear()-2000)
                + " hora: " + ahora.getHour() + ":" +ahora.getMinute()+ ":" +ahora.getSecond()+ ")");
        
        //Hacemos los calculos
        System.out.println("Operacion1: " + (ahora.getDayOfMonth()+ahora.getMonthValue()+(ahora.getYear()-2000)));
        System.out.println("Operando2: " + (ahora.getHour()+ahora.getMinute()));
        System.out.println((ahora.getHour()+ahora.getMinute())+"x"+(ahora.getDayOfMonth()+ahora.getMonthValue()+(ahora.getYear()-2000))
                +"="+(ahora.getDayOfMonth()+ahora.getMonthValue()+(ahora.getYear()-2000))*(ahora.getHour()+ahora.getMinute()));
    }
}
