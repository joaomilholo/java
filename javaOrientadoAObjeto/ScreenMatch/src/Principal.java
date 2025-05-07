import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Scarface");
        filme.setAnoDeLacamento(1983);
        filme.setDuracaoEmMinutos(170);
        filme.setInluidoNoPlano(true);
        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());

        filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(8);
        filme.avalia(9);
        System.out.println("Média de avaliações do filme: " + filme.obterMedia());

        System.out.println("\n");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLacamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setMinutosPorEpsisodio(60);
        lost.setEpisodiosPorTemporada(10);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
        filme2.setAnoDeLacamento(2023);
        filme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme2);
        calculadora.inclui(filme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}
