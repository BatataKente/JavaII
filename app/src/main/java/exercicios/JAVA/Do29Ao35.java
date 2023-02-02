package exercicios.JAVA;

import java.util.Scanner;

public class Do29Ao35 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        _29(input);
        input.close();
    }
//29. Fa�a um algoritmo que receba o n�mero do m�s e mostre o m�s correspondente. Valide m�s inv�lido;
    static void _29(Scanner input) {
        var continuar = true;
        do {
            System.out.print("Informe o n�mero do m�s: ");
            var m�s = input.next();
            switch(m�s) {
                case "1": System.out.print("Janeiro.\n");
                    break;
                case "2": System.out.print("Fevereiro.\n");
                    break;
                case "3": System.out.print("Mar�o.\n");
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
                default: System.out.print("Falha, m�s inv�lido.\n");
            }
            continuar = Do16Ao28.doYouDesireToProceed(input);
        } while(continuar);
    }
//30. Escreva um algoritmo que leia tr�s valores inteiros distintos e os escreva em ordem crescente;
//31. Dados tr�s valores A, B e C, em que A e B s�o n�meros reais e C � um caractere, pede-se para imprimir o
//resultado da opera��o de A por B se C for um s�mbolo de operador aritm�tico; caso contr�rio deve ser
//impressa uma mensagem de operador n�o definido. Tratar erro de divis�o por zero;
//32. Escreva um algoritmo que leia tr�s valores inteiros e verifique se eles podem ser os lados de um tri�ngulo.
//Se forem, informar qual o tipo de tri�ngulo que eles formam: equil�tero, is�scele ou escaleno.
//Propriedade: o comprimento de cada lado de um tri�ngulo � menor do que a soma dos comprimentos dos
//outros dois lados.
//a. Tri�ngulo Equil�tero: aquele que tem os comprimentos dos tr�s lados iguais;
//b. Tri�ngulo Is�scele: aquele que tem os comprimentos de dois lados iguais.
//c. Tri�ngulo equil�tero � tamb�m is�scele;
//d. Tri�ngulo Escaleno: aquele que tem os comprimentos de seus tr�s lados diferentes;
//33. A escola �APRENDER� faz o pagamento de seus professores por hora/aula. Fa�a um algoritmo que
//calcule e exiba o sal�rio de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
//a. Professor N�vel 1 R$12,00 por hora/aula;
//b. Professor N�vel 2 R$17,00 por hora/aula;
//c. Professor N�vel 3 R$25,00 por hora/aula.
//34. Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
//a. Infantil A = 5 - 7 anos;
//b. Infantil B = 8 - 10 anos;
//c. Juvenil A = 11- 13 anos;
//d. Juvenil B = 14 - 17 anos;
//e. S�nior = 18 - 25 anos.
//Apresentar mensagem �idade fora da faixa et�ria� quando for outro ano n�o contemplado;
//35. Fa�a um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o c�lculo da conta de
//luz segue a tabela abaixo:
//Tipo de Cliente Valor do KW/h
//a. (Resid�ncia) 0,60;
//b. (Com�rcio) 0,48;
//c. (Ind�stria) 1,29
}
