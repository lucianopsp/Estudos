package br.com.lucianopspcom;
import br.com.lucianopspcom.models.funcionarios.*;
// import br.com.lucianopspcom.models.veiculos.*;

public class App {
    public static void main(String[] args) throws Exception {

        /* double precoCombustivel = 7.50;
        
        Carro carro1 = new Carro("Hb20", "Branco", 50.7, 4, "Hatch");

        Carro carro2 = new Carro();

        carro2.setModelo("Peugeot 208");
        carro2.setCor("Azul");
        carro2.setCapacidadeTanque(48);
        carro2.setQtdPortas(4);
        carro2.setCarroceria("Hatch");

        System.out.println("[ " + carro1.getModelo() + " ]");
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Tanque: " + carro1.getCapacidadeTanque() + " Litros");
        System.out.println("Qtd Portas: " + carro1.getQtdPortas());
        System.out.println("Carroceria: " + carro1.getCarroceria());
        System.out.println("Custo pra encher o tanque com combustivel custando " + precoCombustivel + " o litro: " 
        + carro1.calcAbastecimento(precoCombustivel) + " R$.");

        System.out.println("\n");

        System.out.println("[ " + carro2.getModelo() + " ]");
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Tanque: " + carro2.getCapacidadeTanque() + " Litros");
        System.out.println("Qtd Portas: " + carro2.getQtdPortas());
        System.out.println("Carroceria: " + carro2.getCarroceria());
        System.out.println("Custo pra encher o tanque com combustivel custando " + precoCombustivel + " o litro: " 
        + carro2.calcAbastecimento(precoCombustivel) + " R$.");

        System.out.println("\n");

        System.out.println("Considerando o preco para abastecer um pickup com tanque de 100 litros: " 
        + Carro.calcAbastecimento(precoCombustivel, 100) + " R$."); */


        Funcionario f1 = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
        Faxineiro faxineiro2 = new Faxineiro();

        // Gerente gerente2 = (Gerente) new Funcionario();

        f1.Trabalha();
        gerente.Trabalha();
        vendedor.Trabalha();
        faxineiro.Trabalha(); // polimorfismo
        faxineiro2.Trabalha(); // sobrescrita
       

    }
}
