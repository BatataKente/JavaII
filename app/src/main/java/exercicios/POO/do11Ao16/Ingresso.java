package exercicios.POO.do11Ao16;

public class Ingresso {
//11. Crie uma classe chamada Ingresso, que possui um valor em reais e um metodo imprimir Valor. 
    protected double valor = 10;
    private double getValor() {
        return valor;
    }
    void imprimirValor() {
        System.out.println(getValor());
    }
//Crie uma classe IngressoVIP, que herda de Ingresso e possui um valor adicional. Crie um metodo 
//que retorne o valor do ingresso VIP (com o adicional inclui?do). Crie um programa para criar as 
//instâncias de Ingresso e IngressoVIP, mostrando a diferença de preços.
}