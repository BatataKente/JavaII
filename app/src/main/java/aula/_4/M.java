package aula._4;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int totalDeAlunos = 10;
        while(totalDeAlunos > 0) {
            System.out.print("Qual � o nome do aluno? ");
            String nomeDoAluno = input.next();
            System.out.print("Qual � a idade do aluno? ");
            int idadeDoAluno = input.nextInt();
            System.out.println(
                    "O nome do aluno � " + nomeDoAluno + 
                    " e sua idade � " + idadeDoAluno
            );
            totalDeAlunos--;
        }
        input.close();
    }
}
