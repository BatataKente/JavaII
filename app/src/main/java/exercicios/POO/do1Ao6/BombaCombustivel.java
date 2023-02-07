package exercicios.POO.do1Ao6;

public class BombaCombustivel {
//3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
//seguintes atributos: tipo de combust�vel, valor por litro e quantidade de combust�vel. Al�m desses
//atributos a classes deve conter os seguintes m�todos.
//Crie uma classe que contenha um m�todo main para testar sua classe BombaCombust�vel
    private char tipoDeCombust�vel; //G - gasolina; A - �lcool; D - diesel
    private double valorPorLitro, quantidadeDeCombust�vel;
//a. abastecerPorValor; //m�todo onde � informado o valor a ser abastecido e mostra a quantidade de
//litros que foi colocada no ve�culo
    void abastecerPorValor(double valor) {
        var quantidadeASerAbastecida = valor/valorPorLitro;
        quantidadeDeCombust�vel += quantidadeASerAbastecida;
        System.out.println("Quantidade que foi abastecida: " + quantidadeASerAbastecida);
    }
//b. abastecerPorLitro; // m�todo onde � informado a quantidade em litros de combust�vel e mostra o
//valor a ser pago pelo cliente.
    void abastecerPorLitro(double quantidadeDeCombust�vel) {
        this.quantidadeDeCombust�vel = quantidadeDeCombust�vel;
        System.out.println("Valor referente a quantidade abastecida: " + quantidadeDeCombust�vel*valorPorLitro);
    }
//c. alterarValor; //altera o valor do litro do combust�vel.
    void alterarValor(double valorPorLitro) {
        if(valorPorLitro > 0) {
            this.valorPorLitro = valorPorLitro;
        }
    }
//d. alterarCombustivel; //altera o tipo do combust�vel.
    void alterarCombustivel(char tipoDeCombust�vel) {
        switch(tipoDeCombust�vel) {
            case 'G': case 'A': case 'D': this.tipoDeCombust�vel = tipoDeCombust�vel;
            break;
            default: System.out.print("Tipo de combust�vel inv�lido.");
        }
    }
//e. alterarQuantidadeCombustivel; //altera a quantidade de combust�vel restante na bomba.
    void alterarQuantidadeCombustivel(double quantidadeDeCombust�vel) {
        if(quantidadeDeCombust�vel > 0) {
            this.quantidadeDeCombust�vel = quantidadeDeCombust�vel;
        }
    }
    private String getTipoDeCombust�vel() {
        String TipoDeCombust�vel;
        switch(tipoDeCombust�vel) {
            case 'G' -> TipoDeCombust�vel = "Gasolina";
            case 'A' -> TipoDeCombust�vel = "�lcool";
            default -> TipoDeCombust�vel = "Diesel";
        }
        return TipoDeCombust�vel;
    }
    String getStatus() {
        return "Tipo de combust�vel: " + getTipoDeCombust�vel() + "\nValor por litro: " + valorPorLitro + "\nQuantidade de combust�vel: " + quantidadeDeCombust�vel;
    }
}
