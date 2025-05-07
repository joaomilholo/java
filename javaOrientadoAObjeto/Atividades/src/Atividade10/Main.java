package Atividade10;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("O nome do vento");
        livro1.setAutor("Patrick Rothfuss");
        livro1.setTradutor("Vera Ribeiro");
        livro1.exibirDetalhes();

        System.out.println("\n");

        Livro livro2 = new Livro();
        livro2.setTitulo("O tomer do sábio");
        livro2.setAutor("Patrick Rothfuss");
        livro2.setTradutor("Vera Ribeiro");
        livro2.exibirDetalhes();

        System.out.println("\n");

        Livro livro3 = new Livro();
        livro3.setTitulo("A música do silêncio");
        livro3.setAutor("Patrick Rothfuss");
        livro3.setTradutor("Vera Ribeiro");
        livro3.exibirDetalhes();
    }
}
