package exercicios.JAVA;

import java.util.Random;

class Do16Ao28_Funcion�rio {
        private double sal�rio;
        Do16Ao28_Funcion�rio(double sal�rio) {
            this.sal�rio = sal�rio;
        }
        Do16Ao28_Funcion�rio() {
            this.sal�rio = 1300 + (new Random().nextDouble() * ((1300*20) - 1300));
        }
        void reajustarSal�rio(double ajuste) {
            this.sal�rio *= ajuste;
        }
        double getSal�rio() {
            return sal�rio;
        }
        @Override public String toString() {
            return String.format("Sal�rio: %.2f R$", sal�rio);
        }
}