package Atividade10;

public class Livro {
    private String titulo;
    private String autor;
    private String tradutor;

    public String getTradutor() {
        return tradutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes() {
        System.out.println("---------- Ficha Tecnica ----------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Escrito por: " + autor);
        System.out.println("Traduzido por: " + tradutor);
        System.out.println("-----------------------------------");
    }

}
