package exercicios.POO.do1Ao6;

import java.util.function.Consumer;

public class ContaCorrente {
//2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
//número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
//saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
    private String nomeDoCorrentista;
    private final int númeroDaConta;
    private double saldo = 0;
    private final Consumer<Double> setSaldo = valor -> {
        depósito(valor);
    };
    public ContaCorrente(String nomeDoCorrentista, int númeroDaConta, double saldo) {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.númeroDaConta = númeroDaConta;
        setSaldo.accept(saldo);
    }
    public ContaCorrente(String nomeDoCorrentista, int númeroDaConta) {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.númeroDaConta = númeroDaConta;
    }
    void alterarNome(String novoNome) {
        nomeDoCorrentista = novoNome;
    }
    void depósito(double valor) {
        if(valor > 0) {
            this.saldo += valor;
        }
    }
    void saque(double valor) {
        if(valor > 0) {
            this.saldo -= valor;
        }
    }
    String getStatus() {
        return "Nome: " + nomeDoCorrentista + "; Número da conta: " + númeroDaConta + "; Saldo: " + saldo;
    }
}
