/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejemplos;

public class Tipos_Datos {
    public static void main(String[] args) {
        System.out.println('a'); //Caracter ocupan 2 bytes, y los valores pueden se 1
        System.out.println("a"); //Cadena de caracteres
        System.out.println("------------------------------");
        //Declaramos de diferentes tipos

        //Variables para almacenar caracteres
        char letra ='p';
        char inicial = 'E';

        System.out.println(inicial);
        System.out.println(letra);

        //Variables para almacenar numeros enteros
        int edad = 18; //Los numeros se guardan sin comillas
        int altura = 0;
        System.out.println(edad);
        System.out.println(altura);

        //Variables para almacenar numeros con decimales
        double salario = 0;
        double nota= 0;
        double resultado = 0.0;
        double iva = 0.21;
        System.out.println(salario);
        System.out.println(nota);
        System.out.println(resultado);
        System.out.println(iva);

        //Variables para almacenar booleanos (valores logicos

        boolean seguir = false;
        boolean open = true;
        boolean close = false;
        System.out.println(seguir);
        System.out.println(open);
        System.out.println(close);


    }
}
