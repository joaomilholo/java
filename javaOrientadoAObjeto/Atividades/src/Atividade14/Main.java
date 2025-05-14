package Atividade14;

public class Main {
    public static void main(String[] args) {
        VerificadorPrimo verificar = new VerificadorPrimo();

        verificar.verificarSeEhPrimo(7);
        verificar.verificarSeEhPrimo(8);
        verificar.verificarSeEhPrimo(23);
        verificar.verificarSeEhPrimo(4);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximo = gerador.gerarProximoPrimo(10);
        System.out.println("Próximo primo depois de 10 é: " + proximo);
        gerador.listarPrimos(100);
    }
}
