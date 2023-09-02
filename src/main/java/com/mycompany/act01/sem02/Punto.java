package com.mycompany.act01.sem02;

import java.util.Objects;

public class Punto {
    private double coordenada_x;
    private double coordenada_y;
    
    public Punto(){}
    
    public Punto(int coordenada_x, int coordenada_y){
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
    }
    
    public double getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public double getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + "(" + coordenada_x + ";" + coordenada_y + ")";
    }
    
    public double getDistancia(){
        Punto punto = new Punto(0,0);
        return getDistancia(punto);
    }

    public double getDistancia(Punto otroPunto){
        
        double a = Math.pow(  (this.coordenada_x - otroPunto.getCoordenada_x()), 2);
        double b = Math.pow(  (this.coordenada_y - otroPunto.getCoordenada_y()), 2);
                
        return Math.sqrt(a + b);
    }

    public Punto calcularPuntoMasCercano(Punto[] otrosPuntos){
        Punto masCercanoPunto = null;
        double minDistancia = Double.MAX_VALUE;
        double actualDistancia;

        for (int i = 0; i < otrosPuntos.length; i++) {
            actualDistancia = this.getDistancia(otrosPuntos[i]);
            if(actualDistancia <= minDistancia){
                minDistancia = actualDistancia;
                masCercanoPunto = otrosPuntos[i];
            }
        }

        return masCercanoPunto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punto punto = (Punto) o;
        return Double.compare(punto.coordenada_x, coordenada_x) == 0 && Double.compare(punto.coordenada_y, coordenada_y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordenada_x, coordenada_y);
    }
}
