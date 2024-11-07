package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem  {
    private List<Figura>figuras;

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaDasAreas = 0.0;
        for (Figura figura : figuras) {
            somaDasAreas += figura.calcularArea();
        }
        return somaDasAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura>maiorQue20 = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20) {
                maiorQue20.add(figura);
            }
        }

        return maiorQue20;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura>quadrado = new ArrayList<>();

        for (Figura figura : figuras) {
            if(figura instanceof Quadrado) {
                quadrado.add(figura);
            }
        }

        return quadrado;
    }

}