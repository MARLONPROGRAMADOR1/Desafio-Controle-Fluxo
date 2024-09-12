package br.com.desafiocontrolefluxo;

// Definição da exceção customizada que será lançada se o primeiro parâmetro for maior que o segundo
public class ParametrosInvalidosException extends Exception {
    // Construtor da exceção customizada
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
