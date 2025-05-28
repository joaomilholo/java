package br.com.javacondicionais.codigoDeAcesso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int codigoCorreto = 2023;
        int nivelPermissaoMinimo = 1;
        int nivelPermissaoMaximo = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de acesso:");
        int codigoDeAcesso = scanner.nextInt();
        System.out.println("Digite o nível de permissão:");
        int nivelDePermissao = scanner.nextInt();

        boolean codigoValido = codigoDeAcesso == codigoCorreto;
        boolean permissaoValida = nivelDePermissao >= nivelPermissaoMinimo && nivelDePermissao <= nivelPermissaoMaximo;


        if (codigoValido && permissaoValida) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado. Motivo(s):");
            if(!codigoValido){
                System.out.println("- Código de acesso incorreto.");
            }
            if(!permissaoValida) {
                System.out.println("- Nível de permissão inválido.");
            }
        }

    }
}
