/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejemplos;

public class Conversiones_Tipos {

    //En general es posible almacenar valores de un tipo inferior a un tipo superior
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
        
        //Otra prueba de tipos diferentes enteros

        long num3 =100;
        long num4 = 200;
        long resultado = num3 * num4; //int -> long
        //Se ha promocionado la operación a long
        
        System.out.println("El producto es " + resultado);

        //Pruebas con números reales (con parte decimal)

        double f =(float) 1.0; //Estoy intentando meter 8 bytes en 4, Solución CASTING

        //Pruebas con valores Booleanos
        boolean seguir;
         seguir = (2>1); //1º Se hace la comparación, true 2º Se almacena en la variable





    }
}
