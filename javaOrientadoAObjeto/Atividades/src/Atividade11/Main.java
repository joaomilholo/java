package Atividade11;

public class Main {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();

        carro.setModelo("Gol");
        carro.setPreco1(35000);
        carro.setPreco2(37000);
        carro.setPreco3(34000);

        carro.mostrarInformacoes();
    }
}
