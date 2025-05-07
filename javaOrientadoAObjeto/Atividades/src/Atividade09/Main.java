package Atividade09;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João Milholo");
        aluno1.setNotas(new double[]{8.0, 7.5, 9.0});
        aluno1.informacoesDoAluno();

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Giovanaa");
        aluno2.setNotas(new double[]{10, 7.5, 4.3});
        aluno2.informacoesDoAluno();
    }
}
