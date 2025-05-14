package Atividade13;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public ContaCorrente(double tarifaMensal) {
        super();
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        if(getSaldo() >= tarifaMensal) {
            setSaldo(getSaldo() - tarifaMensal);
            System.out.println("Tarifa mensal de R$" + tarifaMensal + " cobrada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para cobrar a tarifa mensal.");
        }
    }
}
