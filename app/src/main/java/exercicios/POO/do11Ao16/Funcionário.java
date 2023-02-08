package exercicios.POO.do11Ao16;

public class Funcionário {
//Introduza na classe Funcionario uma variável de classe capaz de contabilizar o numero de funcionarios que 
//passaram pela empresa até a data.
    private static int númeroMáximoDeFuncionários;
//15. Crie uma classe chamada Funcionário que inclui três atributos:
//a. nome (String);
//b. sobrenome (String);
    private String name, lastName;
//c. salário mensal (double).
    private double monthlySalary;
//A classe deve ter um construtor, métodos getters e setters para cada atributo da classe. 
    public Funcionário(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.monthlySalary = salary;
        númeroMáximoDeFuncionários++;
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
    public static int getNúmeroMáximoDeFuncionários() {
        return númeroMáximoDeFuncionários;
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
//Escreva uma classe chamada FuncionarioTeste (que contenha o método main) que cria dois objetos da 
//classe Funcionario e exibe o salário de um deles. Introduza na classe Funcionario uma variável de classe 
//capaz de contabilizar o numero cada objeto. Então dê a cada Funcionario um aumento de 10% e exiba 
//novamente o salário anual de cada um deles. 
    @Override public String toString() {
        return String.format("Nome: %s %s; Salário: %.2f; Salario anual: %.2f", 
                getName(), getLastName(), getMonthlySalary(), getAnnualSalary());
    }
}
