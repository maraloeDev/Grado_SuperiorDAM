
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
/**
 *
 * @author maraloed
 */
public class Persona {

    static Scanner teclado = new Scanner(System.in);
    //ATRIBUTTES
    private String dni;
    private String nombre;
    private String apellidos;
    private char sexo;
    private LocalDate fechadeNacimiento;
    private int edad;
    private int altura;
    private double peso;
    private boolean casado;

    //CONSTRUCTORES
    public Persona(String dni, String nombre, String apellidos, char sexo, LocalDate fechadeNacimiento, int edad, int altura, double peso, boolean casado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechadeNacimiento = fechadeNacimiento;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.casado = casado;
    }

    //GETTER AND SETTER
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
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

    // Método que devuelva los datos de una persona en formato cadena
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", fechadeNacimiento=" + fechadeNacimiento + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", casado=" + casado + '}';
    }

    // La fecha de nacimiento será mostrada con el formato día-mes-año (el mes con tres 
    // letras). Ejemplo: 27-nov-2014
    public void fecha_mod() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MMM/yyyy");
        formato.format(this.fechadeNacimiento);

        this.fechadeNacimiento = fechadeNacimiento;
    }
    // Para crear una persona, será obligatorio proporcionar un DNI válido, es decir, un número de 8 dígitos.

    public void dniValido() {
        while (dni.length() < 8) {
            System.out.println("DNI no valido, vuelva a introducir");
            dni = teclado.nextLine();
        }
    }

    // Método que calcula la letra del DNI de la Persona
    public void calcularLetra() {

        dni = "1";
        int DNI_numero = 1;
        do {
            System.out.println("Introduce numero DNI:");
            dni = teclado.nextLine(); //Pido el numeor mediante un string
            DNI_numero = Integer.parseInt(dni);
            //casteo el numero, por que si no, no pria dividirco con el modulo ( 23)
            if (dni.length() > 8 || dni.length() < 8) {

                System.out.println("Error. El DNI debe tener 8 dígitos");
                System.out.print("Introduce numero DNI:");

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
    }

    // Método que determina si la persona está en su peso ideal (0,75 * (altura en cm. – 150)
    // + 50). Devuelve un -1 si está por debajo de su peso ideal, un 0 si está en su peso ideal y
    // un 1 si tiene sobrepeso
    // Método que devuelve un booleano indicando si la persona es o no mayor de edad
    public void mayorEdad() {

        if (edad > 18) {
            boolean mayorEdad = true;
        } else {
            boolean menorEdad = false;
        }
    }

    // Método que devuelva la edad de la Persona.
    public void edadPersona() {
        this.edad = getEdad();
    }
}
