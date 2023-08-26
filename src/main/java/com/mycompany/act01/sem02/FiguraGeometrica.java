package com.mycompany.act01.sem02;

public abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    abstract double calcularAreaFigura();
    
    abstract boolean esRegular();
       
}
