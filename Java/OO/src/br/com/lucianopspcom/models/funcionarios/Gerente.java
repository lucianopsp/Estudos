package br.com.lucianopspcom.models.funcionarios;

public class Gerente extends Funcionario {
    @Override
    public void Trabalha() {
        System.out.println("O gerente gerencia outros funcionarios e o negócio.");
    }
}
