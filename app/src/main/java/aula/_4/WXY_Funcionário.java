package aula._4;

import java.util.Date;

public class WXY_Funcionário {
    private String nome, cpf;
    private Date birthDate;
    private float salario;
    public WXY_Funcionário() {
    }
    public WXY_Funcionário(String nome, float salario, String cpf) {
        this. nome = nome;
        this. cpf = cpf;
        this. salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    } 
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
