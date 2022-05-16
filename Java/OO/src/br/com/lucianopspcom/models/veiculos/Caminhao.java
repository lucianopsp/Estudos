package br.com.lucianopspcom.models.veiculos;

public class Caminhao extends Veiculo{

    double capacidadeCarga;
    int eixos;

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public int getEixos() {
        return eixos;
    }
    
}
