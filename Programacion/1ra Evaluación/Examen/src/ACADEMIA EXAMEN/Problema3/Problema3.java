/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author maraloed
 */
public class Problema3 {

    public static void main(String[] args) {
        LocalDate tiempo = LocalDate.now();
        int dia = tiempo.getDayOfMonth();
        DayOfWeek mes = tiempo.getDayOfWeek();
        int anio = tiempo.getDayOfYear();
        LocalDate suma = LocalDate.now().plusDays(dia).plusDays(anio);

        System.out.println("Fecha " + tiempo);
        System.out.println("Operando1 " + suma);
    }

}
