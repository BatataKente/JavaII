package exercicios.POO.do7Ao10;

import java.util.Date;

public class Jogador {
//10. Crie uma classe para representar um jogador de futebol, com os atributos:
//a. nome;
    private final String name;
//b. posição;
    private char position; // D - defesa; M - meio-campo; A - atacante
//c. data de nascimento;
    private final Data birthDate;
//d. nacionalidade;
    private final String nationality;
//e. altura;
    private double height;
//f. peso;
    private double weight;
    public Jogador(String name, Data birthDate, String nationality, char position) {
        this.name = name;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.position = position;
    }
    public Jogador(String name, Data birthDate, String nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }
//Crie os métodos públicos necessários para getters e setters 
    public String getName() {
        return name;
    }
    public char getPosition() {
        return position;
    }
    public Data getBirthDate() {
        return birthDate;
    }
    public String getNationality() {
        return nationality;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public void setPosition(char position) {
        this.position = position;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
//e também um método para imprimir todos os
//dados do jogador. 
    @Override public String toString() {
        return "\"Jogador:{" + "\"name\":\"" + name + "\", \"position\":\"" + position + 
                "\", \"birthDate\":\"" + birthDate + "\", \"nationality\":\"" + nationality + "\", \"height\":" + 
                height + ", \"weight\":" + weight + '}';
    }
//Crie um método para calcular a idade do jogador 
    int getAge() {
        return Data.NOW.getAno() - birthDate.getAno();
    }
//e outro método para mostrar quanto tempo falta para o jogador se aposentar. Para isso, considere que 
//os jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores de meio-campo 
//aos 38 e os atacantes aos 35.
    Integer timeToAposentar() {
        var timeToAposentar = Data.NOW;
        int remainTime;
        switch(position) {
            case 'C': remainTime = 40;
                break;
            case 'M': remainTime = 38;
                break;
            case 'A': remainTime = 35;
                break;
            default: return null;
        }
        return remainTime;
    }
}
