package exercicios.POO.do11Ao16;

public class Carro {
//16. Construa uma classe para representar um carro. 
//O tanque de combustível do carro armazena no máximo 50 litros de gasolina. O carro consome 15 km/litro. 
//Deve ser possível:
    private double combustível;
    private double kilometragem;
    final int consumo;
    public Carro(int consumo) {
        this.consumo = consumo;
    }
//a. Abastecer o carro com certa quantidade de gasolina;
    void abastecer(double combustível) {
        if(combustível < 0) return;
        if(this.combustível <= 50) this.combustível = combustível;
        if(this.combustível > 50) this.combustível = 50;
    }
//b. Mover o carro em uma determinada distância (medida em km);
    void mover(double distância) {
        if(this.combustível < distância/consumo) return;
        if(this.combustível > 0) {
            this.combustível -= distância/consumo;
            kilometragem += distância;
        }
    }
//c. Retornar a quantidade de combustível e a distância total percorrida.
    public double getCombustível() {
        return combustível;
    }
    public double getKilometragem() {
        return kilometragem;
    }
//No programa principal, crie 2 carros. Abasteça 20 litros no primeiro e 30 litros no segundo. Desloque o
//primeiro em 200 km e o segundo em 400 km. Exiba na tela a distância percorrida e o total de combustível
//restante para cada um.
    @Override public String toString() {
        return String.format("Combustível: %.2f; Kilometragem: %.0f", combustível, kilometragem);
    }
}
