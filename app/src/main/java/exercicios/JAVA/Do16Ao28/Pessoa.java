package exercicios.JAVA.do16Ao28;

import java.util.function.Supplier;

public class Pessoa {
        final String nome;
        private final int idade;
        private boolean saúde;
        private char sexo;
        Supplier<String> apto = () -> aptoParaOServiçoMilitar()? "Apto" : "Inapto";
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
        void setSaúde(String saúde) {
            if(saúde.equalsIgnoreCase("S")) {
                this.saúde = true;
            } else {
                this.saúde = false;
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
        boolean getSaúde() {
            return saúde;
        }
        String getStatus() {
            return "Nome: " + nome + "; sexo: " + getSexo();
        }
        boolean aptoParaOServiçoMilitar() {
            if(idade >= 18 && saúde) return true;
            return false;
        }
}
