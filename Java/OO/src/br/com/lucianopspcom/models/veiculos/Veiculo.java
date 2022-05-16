package br.com.lucianopspcom.models.veiculos;

public class Veiculo {

    String modelo;
    String cor;
    double capacidadeTanque;
    double potencia;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double getPotencia() {
        return potencia;
    }

    public double calcAbastecimento(double precoCombustivel){
        return precoCombustivel * capacidadeTanque;
    }
    
    public static double calcAbastecimento(double precoCombustivel, double capacidadeTanque){
        return precoCombustivel * capacidadeTanque;
    }
}
