package Atividade08;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Headset Gamer Sem Fio Logitech G435");
        produto1.setPreco(823.52);
        produto1.aplicarDesconto(40);
        produto1.exibirProduto();


        System.out.println("\n");

        Produto produto2 = new Produto();
        produto2.setNome("Notebook Acer Aspire 5");
        produto2.setPreco(3665);
        produto2.aplicarDesconto(3);
        produto2.exibirProduto();

    }
}
