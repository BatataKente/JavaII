package exercicios.POO.do11Ao15;

import java.util.Arrays;

public abstract class Calculadora {
//13. Crie uma classe Calculadora. Esta classe deve implementar as opera��es b�sicas (soma, subtra��o, divis�o
//e multiplica��o). 
    static double some(double... numbers) {
        return Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
    }
    static double subtraia(double... numbers) {
        return Arrays.stream(numbers).reduce(0, (a, b) -> a - b);
    }
    static double divida(double... numbers) {
        return Arrays.stream(numbers).reduce(1, (a, b) -> a / b);
    }
    static double multiplique(double... numbers) {
        return Arrays.stream(numbers).reduce(1, (a, b) -> a * b);
    }
}
