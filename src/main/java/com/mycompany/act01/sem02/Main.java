package com.mycompany.act01.sem02;

public class Main {

    public static void main(String[] args) {
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(4,7);
        Punto p3 = new Punto(8,0);
        
        Triangulo t = new Triangulo("t",p1,p2,p3);
        double a = t.calcularAreaFigura();
        System.out.println("el area es: " + a);
        System.out.println(t.esRegular());
        
    }
}
