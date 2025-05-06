import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("Scarface");
        filme.setAnoDeLacamento(1983);
        filme.setDuracaoEmMinutos(170);
        filme.setInluidoNoPlano(true);

        filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(8);
        filme.avalia(9);

        System.out.println("Média de avaliações do filme: " + filme.obterMedia());
    }
}
