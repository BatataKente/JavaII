package exercicios.POO.do7Ao10;

public final class Funcion�rio {
//7. A fim de representar funcion�rios em uma empresa, crie uma classe chamada Funcionario que inclui as
//tr�s informa��es a seguir como atributos:
//a. um primeiro nome,
//b. um sobrenome
    private String firstName, lastName;
//c. um sal�rio mensal
    private double monthlySalary = 0;
//Sua classe deve ter um construtor que inicializa os tr�s atributos. Forne�a os m�todos getters e setters para
//cada atributo. 
    public Funcion�rio(String firstName, String lastName, double monthlySalary) {
        setFirstName(firstName);
        setLastName(lastName);
        setMonthlySalary(monthlySalary);
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getWage() {
        return monthlySalary;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary > 0) this.monthlySalary = monthlySalary;
    }
//Se o sal�rio mensal n�o for positivo, configure-o como 0.0. Escreva um aplicativo de teste
//que demonstra as capacidades da classe. Crie duas inst�ncias da classe e exiba o sal�rio anual de cada
//inst�ncia. Ent�o d� a cada empregado um aumento de 10% e exiba novamente o sal�rio anual de cada
//empregado.
    public void raiseMonthlySalary(double percentageToRaise) {
        if(percentageToRaise > 0) this.monthlySalary *= percentageToRaise;
    }
    @Override public String toString() {
        return String.format(
                "Nome: %s %s; Sal�rio: %.2f", firstName, lastName, monthlySalary
        );
    }
}
