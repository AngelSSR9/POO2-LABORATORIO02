package com.mycompany.act01.sem02;

public class Rectangulo extends Cuadrilatero implements Shape{
    public Rectangulo(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        super(nombre, vertice1, vertice2, vertice3, vertice4);
        if(!esRegular()){
            System.out.println("No es regular.");
        }
        area = calcularAreaFigura();
    }

    @Override
    double calcularAreaFigura() {
        double largo = 0;
        double ancho = 0;

        Punto aux = vertice1.calcularPuntoMasCercano(new Punto[]{vertice2,vertice3,vertice4});
        if(aux.equals(vertice2)){
            largo = vertice1.getDistancia(vertice2);
            aux = vertice1.calcularPuntoMasCercano(new Punto[]{vertice3,vertice4});
            ancho = vertice1.getDistancia(aux);
        }
        else if(aux.equals(vertice3)){
            largo = vertice1.getDistancia(vertice3);
            aux = vertice1.calcularPuntoMasCercano(new Punto[]{vertice2,vertice4});
            ancho = vertice1.getDistancia(aux);
        }
        else if(aux.equals(vertice4)){
            largo = vertice1.getDistancia(vertice4);
            aux = vertice1.calcularPuntoMasCercano(new Punto[]{vertice3,vertice2});
            ancho = vertice1.getDistancia(aux);
        }

        return largo*ancho;
    }

    @Override
    public double obtenerPerimetro() {
        double lado = vertice1.getDistancia(vertice2);
        double lado2 = vertice2.getDistancia(vertice3);
        double lado3 = vertice3.getDistancia(vertice4);
        double lado4 = vertice4.getDistancia(vertice1);

        perimetro = lado + lado2 + lado3 + lado4;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "\nvertice1=" + vertice1 +
                "\n vertice2=" + vertice2 +
                "\n vertice3=" + vertice3 +
                "\n vertice4=" + vertice4 +
                "\n nombre='" + nombre + '\'' +
                '}';
    }
}
