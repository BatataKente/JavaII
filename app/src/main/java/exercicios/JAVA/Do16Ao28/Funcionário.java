package exercicios.JAVA.do16Ao28;

import java.util.Random;

class Funcionário {
        private double salário;
        Funcionário(double salário) {
            this.salário = salário;
        }
        Funcionário() {
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