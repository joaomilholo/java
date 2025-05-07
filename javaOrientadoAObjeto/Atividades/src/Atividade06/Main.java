package Atividade06;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("João Milholo");
        conta.setNumeroConta(1228);
        conta.setSaldo(66.50);

        conta.exibirConta();
    }
}
