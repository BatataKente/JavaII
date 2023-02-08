package aula._4;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int totalDeAlunos = 10;
        while(totalDeAlunos > 0) {
            System.out.print("Qual é o nome do aluno? ");
            String nomeDoAluno = input.next();
            System.out.print("Qual é a idade do aluno? ");
            int idadeDoAluno = input.nextInt();
            System.out.println(
                    "O nome do aluno é " + nomeDoAluno + 
                    " e sua idade é " + idadeDoAluno
            );
            totalDeAlunos--;
        }
        input.close();
    }
}
