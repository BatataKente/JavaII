package exercicios.JAVA.do16Ao28;

import java.util.function.Supplier;

public class Pessoa {
        final String nome;
        private final int idade;
        private boolean sa�de;
        private char sexo;
        Supplier<String> apto = () -> aptoParaOServi�oMilitar()? "Apto" : "Inapto";
        Pessoa(String nome) {
            this.nome = nome;
            this.idade = 0;
        }
        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
        String getSexo() {
            if(sexo == 'M') {
                return "Masculino";
            } else {
                return "Feminino";
            }
        }
        void setSa�de(String sa�de) {
            if(sa�de.equalsIgnoreCase("S")) {
                this.sa�de = true;
            } else {
                this.sa�de = false;
            }
        }
        void setSexo(char sexo) {
            if(sexo == 'M' || sexo == 'F') {
                this.sexo = sexo;
            }
        }
        int getIdade() {
            return idade;
        }
        boolean getSa�de() {
            return sa�de;
        }
        String getStatus() {
            return "Nome: " + nome + "; sexo: " + getSexo();
        }
        boolean aptoParaOServi�oMilitar() {
            if(idade >= 18 && sa�de) return true;
            return false;
        }
}
