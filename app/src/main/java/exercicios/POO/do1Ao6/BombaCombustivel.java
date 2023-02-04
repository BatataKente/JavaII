package exercicios.POO.do1Ao6;

public class BombaCombustivel {
//3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
//seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
//atributos a classes deve conter os seguintes métodos.
//Crie uma classe que contenha um método main para testar sua classe BombaCombustível
    private char tipoDeCombustível; //G - gasolina; A - álcool; D - diesel
    private double valorPorLitro, quantidadeDeCombustível;
//a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
//litros que foi colocada no veículo
    void abastecerPorValor(double valor) {
        var quantidadeASerAbastecida = valor/valorPorLitro;
        quantidadeDeCombustível += quantidadeASerAbastecida;
        System.out.println("Quantidade que foi abastecida: " + quantidadeASerAbastecida);
    }
//b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
//valor a ser pago pelo cliente.
    void abastecerPorLitro(double quantidadeDeCombustível) {
        this.quantidadeDeCombustível = quantidadeDeCombustível;
        System.out.println("Valor referente a quantidade abastecida: " + quantidadeDeCombustível*valorPorLitro);
    }
//c. alterarValor; //altera o valor do litro do combustível.
    void alterarValor(double valorPorLitro) {
        if(valorPorLitro > 0) {
            this.valorPorLitro = valorPorLitro;
        }
    }
//d. alterarCombustivel; //altera o tipo do combustível.
    void alterarCombustivel(char tipoDeCombustível) {
        switch(tipoDeCombustível) {
            case 'G': case 'A': case 'D': this.tipoDeCombustível = tipoDeCombustível;
            break;
            default: System.out.print("Tipo de combustível inválido.");
        }
    }
//e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
    void alterarQuantidadeCombustivel(double quantidadeDeCombustível) {
        if(quantidadeDeCombustível > 0) {
            this.quantidadeDeCombustível = quantidadeDeCombustível;
        }
    }
    private String getTipoDeCombustível() {
        String TipoDeCombustível;
        switch(tipoDeCombustível) {
            case 'G' -> TipoDeCombustível = "Gasolina";
            case 'A' -> TipoDeCombustível = "Álcool";
            default -> TipoDeCombustível = "Diesel";
        }
        return TipoDeCombustível;
    }
    String getStatus() {
        return "Tipo de combustível: " + getTipoDeCombustível() + "\nValor por litro: " + valorPorLitro + "\nQuantidade de combustível: " + quantidadeDeCombustível;
    }
}
