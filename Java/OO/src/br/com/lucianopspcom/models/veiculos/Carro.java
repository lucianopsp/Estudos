package br.com.lucianopspcom.models.veiculos;

public class Carro extends Veiculo {

    int qtdPortas;
    String carroceria;

    public Carro(){ }

    public Carro(String modelo, String cor, double capacidadeTanque, int qtdPortas, String carroceria){
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
        this.qtdPortas = qtdPortas;
        this.carroceria = carroceria;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public String getCarroceria() {
        return carroceria;
    }
}
