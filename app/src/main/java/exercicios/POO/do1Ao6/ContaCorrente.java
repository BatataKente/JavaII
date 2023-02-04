package exercicios.POO.do1Ao6;

import java.util.function.Consumer;

public class ContaCorrente {
//2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
//n�mero da conta, nome do correntista e saldo. Os m�todos s�o os seguintes: alterarNome, dep�sito e
//saque; No construtor, saldo � opcional, com valor default zero e os demais atributos s�o obrigat�rios.
    private String nomeDoCorrentista;
    private final int n�meroDaConta;
    private double saldo = 0;
    private final Consumer<Double> setSaldo = valor -> {
        dep�sito(valor);
    };
    public ContaCorrente(String nomeDoCorrentista, int n�meroDaConta, double saldo) {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.n�meroDaConta = n�meroDaConta;
        setSaldo.accept(saldo);
    }
    public ContaCorrente(String nomeDoCorrentista, int n�meroDaConta) {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.n�meroDaConta = n�meroDaConta;
    }
    void alterarNome(String novoNome) {
        nomeDoCorrentista = novoNome;
    }
    void dep�sito(double valor) {
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
        return "Nome: " + nomeDoCorrentista + "; N�mero da conta: " + n�meroDaConta + "; Saldo: " + saldo;
    }
}
