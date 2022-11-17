/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

/* programa que calcule el numero de dias trascurridos desde una fecha introducida por teclaso hasta hoy

Ejemplo : 

Introduce fecha 01/01/2022
Han transcurrido hasta hoy 340 dias */
public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner telado = new Scanner(System.in);
        LocalDate hoy = LocalDate.now(); //Fecha de hoy
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/aaaa"); //Formateado con la fecha

        System.out.print("Introduce fecha : ");
        String fecha = telado.next();

    }

}
