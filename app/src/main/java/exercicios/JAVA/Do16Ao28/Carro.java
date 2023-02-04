package exercicios.JAVA.do16Ao28;

import java.util.function.Supplier;

public class Carro {
        int ano;
        double preço;
        final String tipoDeCombustível, modelo;
        final Supplier<Double> preçoComDesconto = () -> preço*getDesconto();
        private boolean vendido = false;
        Carro (int ano, double preço) {
            this.ano = ano;
            this.preço = preço;
            this.tipoDeCombustível = "";
            this.modelo = "";
        }
        Carro (String tipoDeCombustível, String modelo, double preço) {
            this.tipoDeCombustível = tipoDeCombustível;
            this.modelo = modelo;
            this.preço = preço;
        }
        private double getDesconto() {
            if(tipoDeCombustível.equalsIgnoreCase("A")) return 1 - 0.25;
            if(tipoDeCombustível.equalsIgnoreCase("G")) return 1 - 0.21;
            if(tipoDeCombustível.equalsIgnoreCase("D")) return 1 - 0.14;
            return 1.0;
        };
        String getStatus() {
            return toString() + "; Vendido: " + (vendido? "Sim": "Não");
        }
        void setVendido(boolean vendido) {
            this.vendido = vendido;
        }
        @Override public String toString() {
            return String.format(
                    "Modelo: %s; Preço: %.2f; Preço + desconto: %.2f", 
                    modelo, preço, preçoComDesconto.get()
            );
        }
}