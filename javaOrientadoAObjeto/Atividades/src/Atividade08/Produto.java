package Atividade08;

public class Produto {
    private String nome;
    private double preco;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void aplicarDesconto(double percentual) {
        double desconto = (preco * percentual) / 100;
        preco = preco - desconto;

    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);


    }
}
