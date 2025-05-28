package br.com.javacondicionais.media;

public class Media {
    public static void main(String[] args) {
        double nota = 4.9;

        if (nota >= 7.0) {
            System.out.println("O estudante teve média " + nota + " e foi aprovado.");
        } else if ( nota >= 5.0){
            System.out.println("O estudante teve média " + nota + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + nota + " e foi reprovado.");
        }
    }
}
