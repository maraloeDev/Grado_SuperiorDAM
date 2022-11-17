/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FormateoFechas1 {
    
    public static void main(String[] args) {
        //Uso de date format -> 

        DateFormat df = DateFormat.getDateInstance();
        Date hoy = new Date();
        System.out.println("Formato por defecto " + df.format(hoy));
        
        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Formato Medium " + df.format(hoy));
        
        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Formato Long " + df.format(hoy));
        
        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Formato full" + df.format(hoy));
        
        df = DateFormat.getDateInstance(DateFormat.SHORT, DateFormat.MEDIUM, Locale.US);
        System.out.println("Formato fecha/hora USA " df.format(hoy)
    

);
    }

}
