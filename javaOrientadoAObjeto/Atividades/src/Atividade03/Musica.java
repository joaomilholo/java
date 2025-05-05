package Atividade03;

public class Musica {
    public String titulo;
    public String artista;
    public int anoLancamento;
    public double avaliacao;
    public int numAvaliacoes;

    public void exibirFichaTecnica() {
        System.out.println("-------- Ficha Técnica --------");
        System.out.println("Nome: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Total de avaliações: " + numAvaliacoes);
        System.out.println("Média das avaliaçoes: " + String.format("%.2f",obterMedia()));
        System.out.println("-------------------------------");
    }

    public void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double obterMedia() {
        return avaliacao / numAvaliacoes;
    }

}
