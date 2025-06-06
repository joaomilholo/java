import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

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

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filme3 = new Filme();
        filme3.setNome("Scarface");
        filme3.setDuracaoEmMinutos(170);
        filme3.setAnoDeLacamento(1984);
        filme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(filme);
        listaDeFilmes.add(filme2);
        System.out.println("Tamanho da lita " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());
    }
}
