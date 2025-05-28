package br.com.javacondicionais.comparandoNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior número é " + primeiroNumero + ".");
        } else if (primeiroNumero < segundoNumero){
            System.out.println("O maior número é " + segundoNumero + ".");
        } else {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
    }
}
