package exercicios.JAVA.do29Ao35;

public class Professor {
    private String nome;
    private int nível, horasDeTrabalhoMensal;
    public Professor(String nome, int nível, int horasDeTrabalhoMensal) {
        this.nome = nome;
        setNível(nível);
        this.horasDeTrabalhoMensal = horasDeTrabalhoMensal;
    }
    private double getSalário() {
        double salário;
        switch(nível) {
            case 1 -> salário = horasDeTrabalhoMensal*12;
            case 2 -> salário = horasDeTrabalhoMensal*17;
            default -> salário = horasDeTrabalhoMensal*25;
        }
        return salário;
    }
    private void setNível(int nível) {
        if(nível == 1 || nível == 2 || nível == 3) this.nível = nível;
    }
    String getNome() {
        return nome;
    }
    String getStatus() {
        return "Nome: " + nome + "; Salário: " + getSalário();
    }
}
