package exercicios.POO.do1Ao6;

public class Elevador {
//4. Crie uma classe denominada Elevador para armazenar as informa��es de um elevador dentro de um
//pr�dio. A classe deve armazenar o andar atual (t�rreo = 0), total de andares no pr�dio (desconsiderando o
//t�rreo), capacidade do elevador e quantas pessoas est�o presentes nele. A classe deve tamb�m
//disponibilizar os seguintes m�todos:
    private int andarAtual = 0, totalDeAndares, pessoasNoElevador;
    private final int capacidadeDoElevador;
//a. Inicializa: que deve receber como par�metros a capacidade do elevador e o total de andares no
//pr�dio (os elevadores sempre come�am no t�rreo e vazio);
    public Elevador(int totalDeAndares, int capacidadeDoElevador) {
        this.totalDeAndares = totalDeAndares;
        this.capacidadeDoElevador = capacidadeDoElevador;
    }
//b. Entra: para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver espa�o);
    void entrar() {
        if(pessoasNoElevador < capacidadeDoElevador) pessoasNoElevador++;
    }
//c. Sai: para remover uma pessoa do elevador (s� deve remover se houver algu�m dentro dele);
    void sair() {
        if(pessoasNoElevador > 0) pessoasNoElevador--;
    }
//d. Sobe: para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
    void subir() {
        if(andarAtual < totalDeAndares) andarAtual++;
    }
//e. Desce: para descer um andar (n�o deve descer se j� estiver no t�rreo);
    void descer() {
        if(andarAtual > 0) andarAtual--;
    }
    String getStatus() {
        return "Andar: " + andarAtual + "; Quantidade de pessoas: " + pessoasNoElevador;
    }
}
