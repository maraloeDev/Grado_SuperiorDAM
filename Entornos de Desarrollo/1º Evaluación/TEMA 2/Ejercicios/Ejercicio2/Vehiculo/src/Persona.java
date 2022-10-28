/***************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 /**************************************************/

public class Persona {

    //ATRIBUTOS
    String nombre; //value String
    String apellidos; //value String
    int edad; //value Integer

    //CONSTRUCTOR CON PARÁMETROS

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //GETTER AND SETTER

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
