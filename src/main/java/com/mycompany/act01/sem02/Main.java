package com.mycompany.act01.sem02;

public class Main {

    public static void main(String[] args) {
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(4,7);
        Punto p3 = new Punto(8,0);
        
        Triangulo t = new Triangulo("Triángulo",p1,p2,p3);

        System.out.println("el area es: " + t.calcularAreaFigura());
        System.out.println(t.esRegular());

        Punto p4 = new Punto(0,0);
        Punto p5 = new Punto(0,1);
        Punto p6 = new Punto(1,0);
        Punto p7 = new Punto(1,1);

        Cuadrado c = new Cuadrado("Cuadro",p4,p5,p6,p7);
        System.out.println("El area del cuadrado es: " + c.calcularAreaFigura());

        SuperficiePlana sp = new SuperficiePlana();
        sp.agregarFigura(t);
        sp.agregarFigura(c);
        System.out.println("-----------------------------");
        System.out.println(sp.mostrarAreas());

    }
}
