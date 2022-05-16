package br.com.lucianopspcom.models.varios;

public class Compra {
    
    public double AplicarDescontos(double valor,Cupom Cupom){
        return valor =- Cupom.getPercentDesconto();
    }
}
