package exercicios.POO.do11Ao16;

public abstract class CalculadoraCient�fica extends Calculadora{
//Utilizando o conceito de heran�a crie uma classe chamada calculadora cientifica que
//implementa os seguintes c�lculos: raizQuadrada e a potencia. Dica utilize a classe Math do pacote
//java.lang.
    static double raizQuadradaDe(double number) {
        return Math.sqrt(number);
    }
    static double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
