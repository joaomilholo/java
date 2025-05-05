package Atividade05;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João Milholo";
        aluno1.idade = 26;
        aluno1.informacoesDoAluno();

        System.out.println("\n");

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Raquel Milholo";
        aluno2.idade = 21;
        aluno2.informacoesDoAluno();
    }
}
