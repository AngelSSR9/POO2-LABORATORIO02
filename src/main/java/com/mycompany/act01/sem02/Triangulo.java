package com.mycompany.act01.sem02;

public class Triangulo extends FiguraGeometrica{
    
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo(String nombre, Punto punto1, Punto punto2, Punto punto3) {
        super(nombre);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    /*public Triangulo(Punto punto1, Punto punto2, Punto punto3, String nombre) {
        super(nombre);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }*/

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    @Override
    public String toString() {
        //Accedemos a "nombre" sin tener que utilizar get ni super debido al modificador de acceso protected.
        return "Triángulo: " + nombre /*getNombre()*/ + "tiene 3 Puntos: " + getPunto1().toString() + "," + getPunto2().toString()+ "," + getPunto3().toString();
    }

    @Override
    double calcularAreaFigura() {
        double distancia1 = punto1.getDistancia(punto2);
        double distancia2 = punto2.getDistancia(punto3);
        double distancia3 = punto3.getDistancia(punto1);
        
        double s = (distancia1+distancia2+distancia3) / 2; // semiperimetro

        return Math.sqrt(s*(s-distancia1)*(s-distancia2)*(s-distancia3));
    }

    @Override
    boolean esRegular() {
        double distancia1 = punto1.getDistancia(punto3);
        double distancia3 = punto2.getDistancia(punto1);
        double distancia2 = punto3.getDistancia(punto2);
        
        
        System.out.println("d1: " + distancia1);
        System.out.println("d2: " + distancia2);
        System.out.println("d3: " + distancia3);
        
        return (distancia1 == distancia2 && distancia2 == distancia3);
    }

}
