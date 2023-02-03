package exercicios.JAVA;

public class Do29Ao35_Professor {
    private String nome;
    private int n�vel, horasDeTrabalhoMensal;
    public Do29Ao35_Professor(String nome, int n�vel, int horasDeTrabalhoMensal) {
        this.nome = nome;
        setN�vel(n�vel);
        this.horasDeTrabalhoMensal = horasDeTrabalhoMensal;
    }
    private double getSal�rio() {
        double sal�rio;
        switch(n�vel) {
            case 1 -> sal�rio = horasDeTrabalhoMensal*12;
            case 2 -> sal�rio = horasDeTrabalhoMensal*17;
            default -> sal�rio = horasDeTrabalhoMensal*25;
        }
        return sal�rio;
    }
    private void setN�vel(int n�vel) {
        if(n�vel == 1 || n�vel == 2 || n�vel == 3) this.n�vel = n�vel;
    }
    String getNome() {
        return nome;
    }
    String getStatus() {
        return "Nome: " + nome + "; Sal�rio: " + getSal�rio();
    }
}
