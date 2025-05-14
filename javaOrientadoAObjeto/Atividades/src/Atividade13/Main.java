package Atividade13;

public class Main {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente(50);

        minhaConta.depositar(200);
        System.out.println("Saldo atual: R$" + minhaConta.consultarSaldo());
        minhaConta.sacar(100);
        System.out.println("Saldo atual após o saque: R$" + minhaConta.consultarSaldo());
        minhaConta.cobrarTarifaMensal();
        System.out.println("Saldo atual após cobrança da tarifa: R$" + minhaConta.consultarSaldo());

    }
}
