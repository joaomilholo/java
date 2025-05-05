package Atividade03;

public class Main {
    public static void main(String[] args) {
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
