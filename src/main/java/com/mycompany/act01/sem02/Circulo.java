package com.mycompany.act01.sem02;

public class Circulo extends FiguraGeometrica implements Shape{
    private int radio;
    private Punto centro;

    public Circulo(String nombre, int radio, Punto centro) {
        super(nombre);
        this.radio = radio;
        this.centro = centro;
        area = calcularAreaFigura();
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    @Override
    double calcularAreaFigura() {
        return Math.PI*radio*radio;
    }

    @Override
    boolean esRegular() {
        return true;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "\nradio=" + radio +
                "\ncentro=" + centro +
                "\nnombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public double obtenerPerimetro() {
        perimetro =2*Math.PI*radio;
        return perimetro;
    }
}
