package Atividade07;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é mair de idade");
        } else {
            System.out.println( nome + " é menor de idade");
        }
    }

}
