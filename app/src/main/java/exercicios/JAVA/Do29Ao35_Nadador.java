package exercicios.JAVA;

//34. Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
//a. Infantil A = 5 - 7 anos;
//b. Infantil B = 8 - 10 anos;
//c. Juvenil A = 11- 13 anos;
//d. Juvenil B = 14 - 17 anos;
//e. Sênior = 18 - 25 anos.
//Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;
public class Do29Ao35_Nadador {
    private final String nome;
    private int idade;
    private String categoria;
    public Do29Ao35_Nadador(String nome) {
        this.nome = nome;
    }
    @Override public String toString() {
        return "Nome: " + nome + "; Idade: " + idade + "; Categoria: " + categoria;
    }
    boolean setIdade(int idade) {
        if(idade >= 5 && idade <= 25) {
            this.idade = idade;
            setCategoria();
            return true;
        } else {
            return false;
        }
    }
    private void setCategoria() {
        if(idade <= 7) {
            categoria = "Infantil A";
        } else if(idade <= 10) {
            categoria = "Infantil B";
        } else if(idade <= 13) {
            categoria = "Juvenil A";
        } else if(idade <= 17) {
            categoria = "Juvenil B";
        } else if(idade <= 25) {
            categoria = "Sênior";
        }
    }
}
