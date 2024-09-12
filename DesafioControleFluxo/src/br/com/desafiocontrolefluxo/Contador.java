package br.com.desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método que realiza a contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Tratando a exceção customizada e exibindo a mensagem de erro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            terminal.close();
        }
    }

    // Método responsável pela lógica de contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validando se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            // Lançando a exceção customizada se a condição for verdadeira
            throw new ParametrosInvalidosException();
        }

        // Calculando a quantidade de interações com base na diferença entre os parâmetros
        int contagem = parametroDois - parametroUm;

        // Loop para imprimir a contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

