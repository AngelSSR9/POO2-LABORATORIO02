package com.mycompany.act01.sem02;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 7);
        Punto p3 = new Punto(8, 0);

        Triangulo triangulo = new Triangulo("Triángulo", p1, p2, p3);

        //System.out.println("el area es: " + triangulo.calcularAreaFigura());
        //System.out.println(triangulo.esRegular());

        /*Punto p4 = new Punto(0, 0);
        Punto p5 = new Punto(0, 1);
        Punto p6 = new Punto(1, 0);
        Punto p7 = new Punto(1, 1);

        Cuadrado c = new Cuadrado("Cuadro", p4, p5, p6, p7);
        System.out.println("El area del cuadrado es: " + c.calcularAreaFigura());*/
        p2.setCoordenada_x(0);
        p2.setCoordenada_y(1);

        p3.setCoordenada_x(2);
        p3.setCoordenada_y(0);

        Rectangulo rectangulo = new Rectangulo("Rectangulo", p1,p2,p3,new Punto(2,1));
        Circulo circulo = new Circulo("Circulo", 4, new Punto(1,0));

        triangulo.obtenerPerimetro();
        rectangulo.obtenerPerimetro();
        circulo.obtenerPerimetro();

        SuperficiePlana sp = new SuperficiePlana();
        sp.setFigurasGeometricas(List.of(triangulo,rectangulo,circulo));

        System.out.println("-------------------------------------------");
        System.out.println(sp.mostrarAreas());

    }
}
