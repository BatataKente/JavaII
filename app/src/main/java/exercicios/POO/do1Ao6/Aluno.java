package exercicios.POO.do1Ao6;

import java.util.function.Supplier;

public class Aluno {
//5. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
//classe deve guardar os seguintes dados do aluno: matr�cula, nome, 2 notas de prova e 1 nota de trabalho.
    private final String matr�cula, nome;
    private float nota_p1, nota_p2, nota_t;
    private final Supplier<Float> notasComPeso = () -> {
        return nota_p1*2.5f + nota_p2*2.5f + nota_t*2;
    };
    public Aluno(String matr�cula, String nome) {
        this.matr�cula = matr�cula;
        this.nome = nome;
    }
    public void setNotaI(float nota_p1) {
        if(nota_p1 > 0) this.nota_p1 = nota_p1;
    }
    public void setNotaII(float nota_p2) {
        if(nota_p2 > 0) this.nota_p2 = nota_p2;
    }
    public void setNotaDoTrabalho(float nota_t) {
        if(nota_t > 0) this.nota_t = nota_t;
    }
//Escreva os seguintes m�todos para esta classe:
//a. media: calcula a m�dia final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
    float m�dia() {
        return notasComPeso.get()/7;
    }
//b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele n�o for para a final)
    float notaQueFaltaParaAProvaFinal() {
        var m�dia = m�dia();
        if(m�dia < 6) {
            var notaFinal = (6*7 - notasComPeso.get())/2.5f;
            return notaFinal;
        } else {
            return 0;
        }
    }
    String getStatus() {
        return "Nome: " + nome + "; Matr�cula: " + matr�cula;
    }
}
