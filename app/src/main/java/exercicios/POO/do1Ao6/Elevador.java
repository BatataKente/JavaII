package exercicios.POO.do1Ao6;

public class Elevador {
//4. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
//prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
//térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também
//disponibilizar os seguintes métodos:
    private int andarAtual = 0, totalDeAndares, pessoasNoElevador;
    private final int capacidadeDoElevador;
//a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
//prédio (os elevadores sempre começam no térreo e vazio);
    public Elevador(int totalDeAndares, int capacidadeDoElevador) {
        this.totalDeAndares = totalDeAndares;
        this.capacidadeDoElevador = capacidadeDoElevador;
    }
//b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    void entrar() {
        if(pessoasNoElevador < capacidadeDoElevador) pessoasNoElevador++;
    }
//c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    void sair() {
        if(pessoasNoElevador > 0) pessoasNoElevador--;
    }
//d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
    void subir() {
        if(andarAtual < totalDeAndares) andarAtual++;
    }
//e. Desce: para descer um andar (não deve descer se já estiver no térreo);
    void descer() {
        if(andarAtual > 0) andarAtual--;
    }
    String getStatus() {
        return "Andar: " + andarAtual + "; Quantidade de pessoas: " + pessoasNoElevador;
    }
}
