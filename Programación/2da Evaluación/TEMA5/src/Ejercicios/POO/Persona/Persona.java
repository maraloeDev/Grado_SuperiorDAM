/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.POO.Persona;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Persona {

    // ATTRIBUTES
    private String dni;
    private String nombre;
    private String apellido;
    private char sexo;
    private LocalDate fechadeNacimiento;
    private int edad;
    private double altura;
    private double peso;
    private boolean casado;

    //CONSTRUCTORS
    public Persona(){
        
    }
    public Persona(String dni, String nombre, String apellido, char sexo, LocalDate fechadeNacimiento, int edad, double altura, double peso, boolean casado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechadeNacimiento = fechadeNacimiento;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.casado = casado;
    }
//  GETTER AND SETTER

//    public String getDni() {
//        return dni;
//    }
//
//    public void setDni(String dni) {
//        this.dni = dni;
//    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(LocalDate fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

//    public int getEdad() {
//        return edad;
//    }
//
//    public void setEdad(int edad) {
//        this.edad = edad;
//    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    // Método que devuelva los datos de una persona en formato cadena.
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", fechadeNacimiento=" + fechadeNacimiento + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", casado=" + casado + '}';
    }

    // Método que calcula la letra del DNI de la Persona
    public int calcularLetra(int DNI_numero) {

        Scanner teclado = new Scanner(System.in);
        String dni = "1";
        DNI_numero = 1;
        do {
            System.out.println("Introduce numero DNI:");
            this.dni=dni;
            DNI_numero = Integer.parseInt(dni);
            if (dni.length() > 8 || dni.length() < 8) {

                System.out.println("Error. El DNI debe tener 8 dígitos");
                System.out.print("Introduce numero DNI:");
                dni=teclado.nextLine();
            }

        } while (dni.length() > 8 || dni.length() < 8);
        String letra = "";

        switch ((DNI_numero % 23)) {
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;

        }
        System.out.println("Letra " + letra);
        return DNI_numero;
    }

    // Método que determina si la persona está en su peso ideal (0,75 * (altura en cm. – 150)
    // + 50). Devuelve un -1 si está por debajo de su peso ideal, un 0 si está en su peso ideal y
    // un 1 si tiene sobrepeso.
    public double pesoIdeal(double peso) {
        peso = (0.75 * (this.altura - 150) + 50);

        if (peso == -1) {
            System.out.println("Esta por debajo de su peso ideal");
        } else if (peso == 0) {
            System.out.println("Esta en su peso ideal");
        } else if (peso == 1) {
            System.out.println(" Usted tiene sobrepeso");
        }

        this.peso = peso;
        return peso;
    }
    
    // Método que devuelve un booleano indicando si la persona es o no mayor de edad
    
    public boolean isMayorEdad() {
        return this.edad >= 18;
    }
}
