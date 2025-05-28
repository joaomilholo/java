package br.com.javacondicionais.verificacaoDeDescontos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valor = scanner.nextDouble();


        if (valor >= 100) {
            double desconto = valor * 0.10;
            double valorComDesconto = valor - desconto;
            System.out.println("Desconto de 10% aplicado");
            System.out.println("Novo valor: R$" + valorComDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$" + valor);
        }

        scanner.close();
    }
}
