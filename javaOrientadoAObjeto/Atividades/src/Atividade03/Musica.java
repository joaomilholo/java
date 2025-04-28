package Atividade03;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    public void exibirFichaTecnica() {
        System.out.println("-------- Ficha Tecnica --------");
        System.out.println("Nome: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

}
