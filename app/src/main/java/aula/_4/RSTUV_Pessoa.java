package aula._4;

import java.util.function.Supplier;

public class RSTUV_Pessoa {
    private double peso, altura;
    final Supplier<Double> imc = () -> peso/(Math.pow(altura, 2));
//    double getIMC() {
//        return peso/(Math.pow(altura, 2));
//    }
    RSTUV_Pessoa() {
        this.peso = 70;
        this.altura = 1.6;
    }
    RSTUV_Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }
    void setPeso(double peso) {
        if(peso > 0) {
            this.peso = peso;
        }
    }
    void setAltura(double altura) {
        this.altura = altura;
    }
}