package exercicios.POO.do11Ao16;

public class Funcion�rio {
//Introduza na classe Funcionario uma vari�vel de classe capaz de contabilizar o numero de funcionarios que 
//passaram pela empresa at� a data.
    private static int n�meroM�ximoDeFuncion�rios;
//15. Crie uma classe chamada Funcion�rio que inclui tr�s atributos:
//a. nome (String);
//b. sobrenome (String);
    private String name, lastName;
//c. sal�rio mensal (double).
    private double monthlySalary;
//A classe deve ter um construtor, m�todos getters e setters para cada atributo da classe. 
    public Funcion�rio(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.monthlySalary = salary;
        n�meroM�ximoDeFuncion�rios++;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public double getAnnualSalary() {
        return monthlySalary*12;
    }
    public static int getN�meroM�ximoDeFuncion�rios() {
        return n�meroM�ximoDeFuncion�rios;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMonthlySalary(double salary) {
        this.monthlySalary = salary;
    }
    public void raiseSalary(double percentage) {
        this.monthlySalary *= percentage;
    }
//Escreva uma classe chamada FuncionarioTeste (que contenha o m�todo main) que cria dois objetos da 
//classe Funcionario e exibe o sal�rio de um deles. Introduza na classe Funcionario uma vari�vel de classe 
//capaz de contabilizar o numero cada objeto. Ent�o d� a cada Funcionario um aumento de 10% e exiba 
//novamente o sal�rio anual de cada um deles. 
    @Override public String toString() {
        return String.format("Nome: %s %s; Sal�rio: %.2f; Salario anual: %.2f", 
                getName(), getLastName(), getMonthlySalary(), getAnnualSalary());
    }
}
