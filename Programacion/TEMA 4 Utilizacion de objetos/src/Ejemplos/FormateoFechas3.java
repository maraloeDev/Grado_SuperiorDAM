/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */

package Ejemplos;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FormateoFechas3 {
    
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd-MMMM-yy");
        Date hoy = new Date();
        System.out.println("Nuevo formato de fecha " + sdf.format(hoy));
    }

}
