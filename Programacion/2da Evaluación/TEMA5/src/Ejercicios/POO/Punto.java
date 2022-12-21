/*******************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios.POO;

public class Punto {

    //ATTRIBUTES
    private double x;
    private double y;

    //CONSTRUCTORS

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //METHODS GETTER AND SETTER

    // Método para recuperar y modificar las propiedades del punto.


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    //toString
    //Método que devuelva el estado del objeto de forma textual, con el formato (x,y)


    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //Método que desplace el punto actual una distancia dada por los valores recibidos como
    //parámetro para las coordenadas x e y.

    public void desplazamiento(double desplazax, double desplazay) {
        x = desplazax + x;
        y = desplazay + y;
    }
    public void mover(double newX, double nexY){
        x=newX;
        y=nexY;
    }
    public void distancia
}
