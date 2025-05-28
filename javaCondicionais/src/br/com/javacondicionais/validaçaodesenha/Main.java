package br.com.javacondicionais.validaçaodesenha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String senhaPreDefinida = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        scanner.close();

        if (senha.equals(senhaPreDefinida) ) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

    }
}
