package exercicios.JAVA;

import java.util.Random;

class Do16Ao28_Funcionário {
        private double salário;
        Do16Ao28_Funcionário(double salário) {
            this.salário = salário;
        }
        Do16Ao28_Funcionário() {
            this.salário = 1300 + (new Random().nextDouble() * ((1300*20) - 1300));
        }
        void reajustarSalário(double ajuste) {
            this.salário *= ajuste;
        }
        double getSalário() {
            return salário;
        }
        @Override public String toString() {
            return String.format("Salário: %.2f R$", salário);
        }
}