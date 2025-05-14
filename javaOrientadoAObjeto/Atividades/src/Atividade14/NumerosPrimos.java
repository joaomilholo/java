package Atividade14;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero ; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limite) {
        System.out.println("Primos até: " + limite + ":");
        for (int i = 2; i <= limite ; i++) {
            if (verificarPrimalidade(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
