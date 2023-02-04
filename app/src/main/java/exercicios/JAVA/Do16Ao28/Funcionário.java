package exercicios.JAVA.do16Ao28;

import java.util.Random;

class Funcion�rio {
        private double sal�rio;
        Funcion�rio(double sal�rio) {
            this.sal�rio = sal�rio;
        }
        Funcion�rio() {
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