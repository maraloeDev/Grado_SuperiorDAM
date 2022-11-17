/** *****************************************************************************
/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*Programa que pida al usuario su fecha de nacimiento
y le diga Felicidades!!! si es su cumpleaños*/
public class FormateoFechas2 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce fecha de cumpleaños (dd-mm-aaaa)");
            String fechaNac = teclado.nextLine();

            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
            df.setLenient(false);
            Date fecha = df.parse(fechaNac);

            GregorianCalendar hoy = new GregorianCalendar();
            hoy.setTime(new Date());

            GregorianCalendar cumple = new GregorianCalendar();
            cumple.setTime(fecha);
            
            if(hoy.get(Calendar.DAY_OF_MONTH) == cumple.get(Calendar.DAY_OF_MONTH) && hoy.get(Calendar.MONTH)==cumple.get(Calendar.MONTH)){
                System.out.println("FELICIDADES!!!");
            
            
            
        } else{
                System.out.println("No es");
            }

        } catch (Exception es) {
            System.out.println("Error");
        }
    }

}
