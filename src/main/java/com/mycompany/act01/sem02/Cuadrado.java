package com.mycompany.act01.sem02;

public class Cuadrado extends FiguraGeometrica {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto punto4;

    public Cuadrado(String nombre, Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(nombre);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

    public Cuadrado(String nombre) {
        super(nombre);
    }


    @Override
    double calcularAreaFigura() {
        double lado = punto1.getDistancia(punto2);

        return lado*lado;
    }

    @Override
    boolean esRegular() {
        return true;
    }
}
