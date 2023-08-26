package com.mycompany.act01.sem02;

import java.util.ArrayList;
import java.util.List;

public class SuperficiePlana {
    private List<FiguraGeometrica> figurasGeometricas = new ArrayList<>();
    
    public List<FiguraGeometrica> getFigurasGeometricas() {
        return figurasGeometricas;
    }

    public void setFigurasGeometricas(List<FiguraGeometrica> figurasGeometricas) {
        this.figurasGeometricas = figurasGeometricas;
    }

    public void agregarFigura(FiguraGeometrica fg){
        figurasGeometricas.add(fg);
    }

    public String mostrarAreas(){
        String text = "";
        int i = 1;
        for(FiguraGeometrica fg : figurasGeometricas){
            text += "Figura "+i+": " + fg.getNombre() + "| Área: " + fg.getArea() + "\n";
            i++;
        }

        return text;
    }
    
    
}
