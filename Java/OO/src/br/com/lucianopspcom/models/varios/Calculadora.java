package br.com.lucianopspcom.models.varios;

public class Calculadora implements OperacaoMatematica {

    @Override
    public double Soma(double a, double b) {
        
        return a + b;
    }

    @Override
    public double Subtracao(double a, double b) {
        
        return a - b;
    }

    @Override
    public double Divisao(double a, double b) {

        return a / b;
    }

    @Override
    public double Multiplicacao(double a, double b) {
        
        return a * b;
    }
    
}
