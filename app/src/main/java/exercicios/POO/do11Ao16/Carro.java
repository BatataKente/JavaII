package exercicios.POO.do11Ao16;

public class Carro {
//16. Construa uma classe para representar um carro. 
//O tanque de combust�vel do carro armazena no m�ximo 50 litros de gasolina. O carro consome 15 km/litro. 
//Deve ser poss�vel:
    private double combust�vel;
    private double kilometragem;
    final int consumo;
    public Carro(int consumo) {
        this.consumo = consumo;
    }
//a. Abastecer o carro com certa quantidade de gasolina;
    void abastecer(double combust�vel) {
        if(combust�vel < 0) return;
        if(this.combust�vel <= 50) this.combust�vel = combust�vel;
        if(this.combust�vel > 50) this.combust�vel = 50;
    }
//b. Mover o carro em uma determinada dist�ncia (medida em km);
    void mover(double dist�ncia) {
        if(this.combust�vel < dist�ncia/consumo) return;
        if(this.combust�vel > 0) {
            this.combust�vel -= dist�ncia/consumo;
            kilometragem += dist�ncia;
        }
    }
//c. Retornar a quantidade de combust�vel e a dist�ncia total percorrida.
    public double getCombust�vel() {
        return combust�vel;
    }
    public double getKilometragem() {
        return kilometragem;
    }
//No programa principal, crie 2 carros. Abaste�a 20 litros no primeiro e 30 litros no segundo. Desloque o
//primeiro em 200 km e o segundo em 400 km. Exiba na tela a dist�ncia percorrida e o total de combust�vel
//restante para cada um.
    @Override public String toString() {
        return String.format("Combust�vel: %.2f; Kilometragem: %.0f", combust�vel, kilometragem);
    }
}
