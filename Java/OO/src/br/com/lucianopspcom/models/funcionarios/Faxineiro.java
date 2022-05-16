package br.com.lucianopspcom.models.funcionarios;

public class Faxineiro extends Funcionario {
    @Override
    public void Trabalha() {
        System.out.println("O faxineiro mantém limpo e organizado o ambiente de trabalho.");
    }
}
