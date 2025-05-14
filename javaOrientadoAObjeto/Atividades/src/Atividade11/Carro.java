package Atividade11;

public class Carro {
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco1() {
        return preco1;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }

    public double getPreco2() {
        return preco2;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public double getPreco3() {
        return preco3;
    }

    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }

    public double obterMenorPreco() {
        double menor = preco1;
        if (preco2 < menor) menor = preco2;
        if (preco3 < menor) menor = preco3;
        return menor;
    }
    public double obterMaiorPreco() {
        double maior = preco1;
        if (preco2 > maior) maior = preco2;
        if (preco3 > maior) maior = preco3;
        return maior;
    }

    public void mostrarInformacoes() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço Ano 1: R$" + getPreco1());
        System.out.println("Preço Ano 2: R$" + getPreco2());
        System.out.println("Preço Ano 3: R$" + getPreco3());
        System.out.println("Menor Preço: R$" + obterMenorPreco());
        System.out.println("Maior Preço: R$" + obterMaiorPreco());
    }
}
