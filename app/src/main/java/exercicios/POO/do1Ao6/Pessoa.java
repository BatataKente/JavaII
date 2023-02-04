package exercicios.POO.do1Ao6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
//1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
//altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
//todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
    private String name;
    private Date birthDate;
    private float altura;
    void setAltura(float altura) {
        this.altura = altura;
    }
    void setName(String name) {
        this.name = name;
    }
    void setBirthDate(int dia, int mês, int ano) {
        var format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.birthDate = format.parse(String.format("%2d-%2d-%4d", dia, mês, ano));
        } catch (ParseException error) {
            System.out.print("Error: " + error.getMessage());
        }
    }
    public String getStatus() {
        return "Nome: " + name + "; Idade: " + getIdade() + "; Altura: " + altura;
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
}