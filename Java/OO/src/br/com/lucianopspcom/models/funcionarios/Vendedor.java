package br.com.lucianopspcom.models.funcionarios;

public class Vendedor extends Funcionario {
    @Override
    public void Trabalha() {
        System.out.println("O vendedor vende os produtos oferecidos pelo negócio.");
    }
}
