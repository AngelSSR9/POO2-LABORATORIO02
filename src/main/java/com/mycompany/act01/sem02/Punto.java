package com.mycompany.act01.sem02;

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
        return "El punto tiene las siguientes coordenadas: " + coordenada_x + "," + coordenada_y ; 
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
    
}
