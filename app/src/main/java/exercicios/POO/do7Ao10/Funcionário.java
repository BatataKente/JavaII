package exercicios.POO.do7Ao10;

public final class Funcionário {
//7. A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as
//três informações a seguir como atributos:
//a. um primeiro nome,
//b. um sobrenome
    private String firstName, lastName;
//c. um salário mensal
    private double monthlySalary = 0;
//Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para
//cada atributo. 
    public Funcionário(String firstName, String lastName, double monthlySalary) {
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
//Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste
//que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada
//instância. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada
//empregado.
    public void raiseMonthlySalary(double percentageToRaise) {
        if(percentageToRaise > 0) this.monthlySalary *= percentageToRaise;
    }
    @Override public String toString() {
        return String.format(
                "Nome: %s %s; Salário: %.2f", firstName, lastName, monthlySalary
        );
    }
}
