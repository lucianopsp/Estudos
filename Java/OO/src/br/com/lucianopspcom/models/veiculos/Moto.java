package br.com.lucianopspcom.models.veiculos;

public class Moto extends Veiculo {
    boolean possuiGarupa;

    public void setPossuiGarupa(boolean possuiGarupa) {
        this.possuiGarupa = possuiGarupa;
    }

    public boolean getPossuiGarupa(){
        return this.possuiGarupa;
    }
}
