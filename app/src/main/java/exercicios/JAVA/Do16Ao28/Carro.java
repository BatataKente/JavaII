package exercicios.JAVA.do16Ao28;

import java.util.function.Supplier;

public class Carro {
        int ano;
        double pre�o;
        final String tipoDeCombust�vel, modelo;
        final Supplier<Double> pre�oComDesconto = () -> pre�o*getDesconto();
        private boolean vendido = false;
        Carro (int ano, double pre�o) {
            this.ano = ano;
            this.pre�o = pre�o;
            this.tipoDeCombust�vel = "";
            this.modelo = "";
        }
        Carro (String tipoDeCombust�vel, String modelo, double pre�o) {
            this.tipoDeCombust�vel = tipoDeCombust�vel;
            this.modelo = modelo;
            this.pre�o = pre�o;
        }
        private double getDesconto() {
            if(tipoDeCombust�vel.equalsIgnoreCase("A")) return 1 - 0.25;
            if(tipoDeCombust�vel.equalsIgnoreCase("G")) return 1 - 0.21;
            if(tipoDeCombust�vel.equalsIgnoreCase("D")) return 1 - 0.14;
            return 1.0;
        };
        String getStatus() {
            return toString() + "; Vendido: " + (vendido? "Sim": "N�o");
        }
        void setVendido(boolean vendido) {
            this.vendido = vendido;
        }
        @Override public String toString() {
            return String.format(
                    "Modelo: %s; Pre�o: %.2f; Pre�o + desconto: %.2f", 
                    modelo, pre�o, pre�oComDesconto.get()
            );
        }
}