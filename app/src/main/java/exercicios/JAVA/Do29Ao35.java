package exercicios.JAVA;

import java.util.Scanner;

public class Do29Ao35 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        _29(input);
        input.close();
    }
//29. Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;
    static void _29(Scanner input) {
        var continuar = true;
        do {
            System.out.print("Informe o número do mês: ");
            var mês = input.next();
            switch(mês) {
                case "1": System.out.print("Janeiro.\n");
                    break;
                case "2": System.out.print("Fevereiro.\n");
                    break;
                case "3": System.out.print("Março.\n");
                    break;
                case "4": System.out.print("Abril.\n");
                    break;
                case "5": System.out.print("Maio.\n");
                    break;
                case "6": System.out.print("Junho.\n");
                    break;
                case "7": System.out.print("Julho.\n");
                    break;
                case "8": System.out.print("Agosto.\n");
                    break;
                case "9": System.out.print("Setembro.\n");
                    break;
                case "10": System.out.print("Outubro.\n");
                    break;
                case "11": System.out.print("Novembro.\n");
                    break;
                case "12": System.out.print("Dezembro.\n");
                    break;
                default: System.out.print("Falha, mês inválido.\n");
            }
            continuar = Do16Ao28.doYouDesireToProceed(input);
        } while(continuar);
    }
//30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
//31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
//resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
//impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
//32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
//Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
//Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
//outros dois lados.
//a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
//b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
//c. Triângulo equilátero é também isóscele;
//d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
//33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
//calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
//a. Professor Nível 1 R$12,00 por hora/aula;
//b. Professor Nível 2 R$17,00 por hora/aula;
//c. Professor Nível 3 R$25,00 por hora/aula.
//34. Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
//a. Infantil A = 5 - 7 anos;
//b. Infantil B = 8 - 10 anos;
//c. Juvenil A = 11- 13 anos;
//d. Juvenil B = 14 - 17 anos;
//e. Sênior = 18 - 25 anos.
//Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;
//35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
//luz segue a tabela abaixo:
//Tipo de Cliente Valor do KW/h
//a. (Residência) 0,60;
//b. (Comércio) 0,48;
//c. (Indústria) 1,29
}
