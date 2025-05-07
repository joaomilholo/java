package Atividade06;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public void exibirConta() {
        System.out.println("Titular da conta: " + titular);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }



    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
}
