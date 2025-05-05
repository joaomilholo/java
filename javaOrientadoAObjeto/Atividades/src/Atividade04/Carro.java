package Atividade04;

public class Carro {
    String modelo;
    int anoFabricacao;
    String cor;
    int anoAtual = 2025;

    void exibirFichaTecnica(){
        System.out.println("-------- Ficha Técnica --------");
        System.out.println("Modelo do : veículo" + modelo);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Cor do veículo: " + cor);
        System.out.println("Idade do veículo: " + idade());
        System.out.println("-------------------------------");
    }

    int idade() {
        return anoAtual - anoFabricacao;
    }
}
