import Atividade01.Pessoa;
import Atividade02.Calculadora;
import Atividade03.Musica;

public class Main {
    public static void main(String[] args) {
        // Atividade 1
        Pessoa pessoa = new Pessoa();
        pessoa.mensagem();

        // Atividade 2
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.calcular(5);
        System.out.println(resultado);

        // Atividade 3
        Musica musica = new Musica();
        musica.titulo = "Postmortem";
        musica.artista = "Slayer";
        musica.anoLancamento = 1986;
        musica.avalia(10);
        musica.avalia(8.5);
        musica.avalia(5.6);
        musica.exibirFichaTecnica();
    }
}
