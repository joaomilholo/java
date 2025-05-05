import Atividade01.Pessoa;
import Atividade02.Calculadora;
import Atividade03.Musica;
import Atividade04.Carro;

public class Main {
    public static void main(String[] args) {
        // Atividade 1
        Pessoa pessoa = new Pessoa();
        pessoa.mensagem();

        System.out.println("\n");

        // Atividade 2
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.calcular(5);
        System.out.println(resultado);

        System.out.println("\n");

        // Atividade 3
        Musica musica = new Musica();
        musica.titulo = "Postmortem";
        musica.artista = "Slayer";
        musica.anoLancamento = 1986;
        musica.avalia(10);
        musica.avalia(8.5);
        musica.avalia(5.6);
        musica.exibirFichaTecnica();

        System.out.println("\n");
        
        // Atividade 4
        Carro carro = new Carro();
        carro.modelo = "Toyota Corlla XEi";
        carro.cor = "Prata metálico";
        carro.anoFabricacao = 2022;
        carro.exibirFichaTecnica();
    }
}
