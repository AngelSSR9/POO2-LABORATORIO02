package com.mycompany.act01.sem02;

public abstract class FiguraGeometrica {
    protected String nombre;
    protected double area;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    abstract double calcularAreaFigura();
    
    abstract boolean esRegular();


}
