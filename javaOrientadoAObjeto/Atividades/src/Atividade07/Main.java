package Atividade07;

public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("João Milholo");
        pessoa.setIdade(26);
        pessoa.verificarIdade();

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Liz");
        pessoa2.setIdade(4);
        pessoa2.verificarIdade();
    }
}
