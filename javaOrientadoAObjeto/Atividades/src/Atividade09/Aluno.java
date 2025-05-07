package Atividade09;

public class Aluno {
    private String nome;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularMedia() {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void informacoesDoAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + calcularMedia());
    }
}
