package exercicios.POO.do1Ao6;

import exercicios.POO.do7Ao10.Data;
import java.util.Calendar;

public class Pessoa {
//1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
//altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
//todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
    private String name;
    private Data birthDate;
    private float altura;
    public Pessoa() {}
    public Pessoa(String name) {
        this.setName(name);
    }
    public Pessoa(String name, int idade, float altura) {
        this.setName(name);
        this.setIdade(idade);
        this.setAltura(altura);
    }
    private void setIdade(int anosDeIdade) {
        long now = Data.NOW.getTime();
        long idade = (long) (anosDeIdade + 1) * 365 * 24 * 60 * 60 * 1000;
        this.birthDate = new Data(now - idade);
    }
    void setIdade(long idade) {
        long now = Data.NOW.getTime();
        this.birthDate = new Data(now - idade);
    }
    void setAltura(float altura) {
        this.altura = altura;
    }
    void setName(String name) {
        this.name = name;
    }
    void setBirthDate(int dia, int mês, int ano) {
        this.birthDate.setTime(dia, ano, dia);
    }
    public String getStatus() {
        return "Nome: " + name + "; Idade: " + getIdade() + "; Altura: " + altura;
    }
    public Data getBirthDate() {
        return birthDate;
    }
    private int getIdade() {
        Calendar today = Calendar.getInstance();
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        int idade = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        if (today.get(Calendar.MONTH) < birth.get(Calendar.MONTH) || 
            (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH) && 
             today.get(Calendar.DAY_OF_MONTH) < birth.get(Calendar.DAY_OF_MONTH))) {
            idade--;
        }
        return idade;
    }
    public String getName() {
        return name;
    }
}