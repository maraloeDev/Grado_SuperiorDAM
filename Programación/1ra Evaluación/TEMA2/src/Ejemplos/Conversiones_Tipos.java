/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejemplos;

public class Conversiones_Tipos {

    //En generasr es posible almacenar valores de un tipo inferior a un tipo superior
    //El problema viene cuando quiero hacer lo contrario, Solución:

    //Casting (convertir de un tipo a otro

    public static void main(String[] args) {

        int i = 12;
        byte b = (byte) i; //int -> byte lo fuerzo con el casting

        System.out.println("La variable b tiene  valor " + b);
        System.out.println("-----------------------------------------------------");
        //Probamos diferentes tipos de datos en operaciones aritmeticas

        short num1 = 12;
        short num2 = 45;
        short suma = (short) (num1 + num2); //Fuerzo con el casting
        suma = (short) (suma * 2);
        System.out.println("La suma es : " + suma);
    }
}
