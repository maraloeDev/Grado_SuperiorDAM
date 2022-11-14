/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EjemplosFechas1 {

    /* Gregoriann Calendar  + calendar*/
    public static void main(String[] args) {

        GregorianCalendar navidad = new GregorianCalendar(2022, Calendar.DECEMBER, 25);

        System.out.println(navidad.get(Calendar.DAY_OF_MONTH));
        System.out.println(navidad.get(Calendar.DAY_OF_YEAR));
        System.out.println(navidad.get(Calendar.YEAR));
        System.out.println(navidad.get(Calendar.HOUR));

        navidad.set(Calendar.DAY_OF_MONTH, 24);

    }

}
