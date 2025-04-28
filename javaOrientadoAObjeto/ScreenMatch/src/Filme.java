public class Filme {
    String nome;
    int anoDeLacamento;
    boolean inluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano de lançamento " + anoDeLacamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double obterMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
