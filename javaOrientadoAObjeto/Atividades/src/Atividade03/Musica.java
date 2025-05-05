package Atividade03;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("-------- Ficha Técnica --------");
        System.out.println("Nome: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Total de avaliações: " + numAvaliacoes);
        System.out.println("Média das avaliaçoes: " + String.format("%.2f",obterMedia()));
        System.out.println("-------------------------------");
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double obterMedia() {
        return avaliacao / numAvaliacoes;
    }
}
