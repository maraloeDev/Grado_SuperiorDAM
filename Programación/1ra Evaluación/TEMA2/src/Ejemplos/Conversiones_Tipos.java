/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejemplos;

public class Conversiones_Tipos {

    //En generasr es posible almacenar valores de un tipo inferior a un tipo superior
    //El problema viene cuando quiero hacer lo contrario, Solución:

    //Casting (convertir de un tipo a otro

    public static void main(String[] args) {



        int i=12; 
        byte b= (byte) i; //No hay problema por el (cast)
    }
}
