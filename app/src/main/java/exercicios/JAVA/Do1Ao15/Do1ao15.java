package exercicios.JAVA.do1Ao15;

import java.util.Scanner;

public class Do1ao15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        _14(input);
    }
//1. Fa�a um algoritmo que receba dois n�meros e exiba o resultado da sua soma;
    static float sumResult(float a, float b) {
        return a + b;
    }
    static void _1(float a, float b) {
        System.out.print(sumResult(a, b));
    }
//2. Fa�a um algoritmo que receba dois n�meros e ao final mostre a soma, subtra��o, multiplica��o e a divis�o
//dos dois n�meros lidos;
//    static void showResult(int a, int b) {
//        System.out.print(sumResult( a,  b));
//    }
    static float subtractResult(float a, float b) {
        return a - b;
    }
    static float divideResult(float a, float b) {
        return a / b;
    }
    static float multiplyResult(float a, float b) {
        return a * b;
    }
    static void _2(float a, float b) {
        System.out.println("Soma: " + sumResult(a, b));
        System.out.println("Subtra��o: " +subtractResult(a, b));
        System.out.println("Divis�o: " +divideResult(a, b));
        System.out.print("Multiprica��o: " +multiplyResult(a, b));
    }
//3. Escreva um algoritmo para determinar o consumo m�dio de um autom�vel sendo fornecida a dist�ncia
//total percorrida pelo autom�vel e o total de combust�vel gasto;
    static void _3(Scanner input) {
        System.out.print("Digite o consumo total de combust�vel: ");
        var consumo = input.nextFloat();
        System.out.print("Digite a dist�ncia total: ");
        var distancia = input.nextFloat();
        System.out.print(
                "O consumo m�dio do ve�culo �: " + divideResult(consumo, distancia)
        );
        input.close();
    }
//4. Escreva um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas
//por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas
//efetuadas, informar o seu nome, o sal�rio fixo e sal�rio no final do m�s;
    static void _4(Scanner input) {
        var comissao = 0.15f;
        System.out.print("Qual o nome do vendedor? ");
        var name = input.nextLine();
        System.out.print("Qual o sal�rio fixo do vendedor? ");
        var salario = input.nextFloat();
        System.out.print("Qual foi o total em dinheiro de vendas efetuadas? ");
        var dinheiro = input.nextFloat();
        System.out.print(
                "O sal�rio final do " + name + " foi " + 
                sumResult(salario, multiplyResult(dinheiro, comissao))
        );
    }
//5. Escreva um algoritmo que leia o nome de um aluno e as notas das tr�s provas que ele obteve no semestre.
//No finalinformar o nome do aluno e a sua m�dia (aritm�tica);
    static void _5(Scanner input) {
        System.out.print("Qual � o nome do aluno? ");
        String nome = input.nextLine();
        float[] notas = new float[3];
        for(int counter = 0; counter < notas.length; counter++) {
            System.out.print("Qual foi a nota na prova " + (counter + 1) + "? ");
            notas[counter] = input.nextFloat();
        }
        var result = (notas[0] + notas[1] + notas[2])/3;
        System.out.print(
                "A nota final do " + nome + " foi " + result
        );
    }
//6. Leia dois valores para as vari�veis A e B, e efetuar as trocas dos valores de forma que a vari�velApasse a
//possuir ovalor da vari�vel B e a vari�vel B passe a possuir o valor da vari�vel A.Apresentar osvalores
//trocados;
    static void _6(int a, int b) {
        final var auxiliar = a;
        a = b; 
        b = auxiliar;
        System.out.print(
                "A: " + a + "\n" +
                "B: " + b
        );
    }
//7. Leia uma temperatura em graus Celsius e apresent�-la convertida em graus Fahrenheit. Af�rmula de
//convers�o �:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
    static void _7(Scanner input) {
        System.out.print("Digite a temperatura em graus Celsius: ");
        var C = input.nextDouble();
        var F = (9*C+160) / 5;
        System.out.print("A temperatura em Fahrenheit � " + F);
    }
//8. Elabore um algoritmo que efetue a apresenta��o do valor da convers�o em real (R$) de um valorlido em
//d�lar (US$). O algoritmo dever� solicitar o valor da cota��o do d�lar e tamb�m aquantidade de d�lares
//dispon�veis com ousu�rio;
    static void _8(Scanner input) {
        System.out.print("Qual o valor em reais? ");
        var reais = input.nextDouble();
        System.out.print("Qual a cota��o atual do d�lar? ");
        var cotacao = input.nextDouble();
        System.out.print(
                "O valor em d�lares � equivalente a " + 
                (reais / cotacao) + " d�lares"
        );
    }
//9. Fa�a um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento ap�s um
//m�s.Considere fixo o juro da poupan�a em 0,07% a. m;
    static void _9(double valor) {
        var rendimento = 1.0007;
        System.out.print(
                "Valor com rendimento no m�s que vem: " + (valor*rendimento)
        );
    }
//10. A Loja Mam�o com A��car est� vendendo seus produtos em 5(cinco) presta��es sem juros. Fa�a um
//algoritmo que receba um valor de uma compra e mostre o valor das presta��es;
    static void _10(Scanner input) {
        System.out.print("Escreva o valor total do produto: ");
        var total = input.nextDouble();
        System.out.printf("Cada presta��o custar� %.2f reais", total/5);
    }
//11. Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre o valor de venda. Sabe-se que o
//pre�o de custo receber� um acr�scimo de acordo com um percentual informado pelo usu�rio;
    static float c�lculoDeVenda(float custo, float percentual) {
        return custo * ((1 + percentual)/100);
    }
    static void _11(Scanner input) {
        System.out.print("Informe o pre�o de custo: ");
        var custo = input.nextFloat();
        System.out.print("Informe o percentual de acre�scimo: ");
        var percentual = input.nextFloat();
        System.out.print("O pre�o de venda � " + c�lculoDeVenda(custo, percentual));
    }
//12. O custo de um carro novo ao consumidor � a soma do custo de f�brica mais o percentual do distribuidor e
//dos impostos aplicados (primeiro os impostos s�o aplicados sobre o custo de f�brica, e depois o percentual
//do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
//45%, escreva um algoritmo que leia o custo de f�brica de um carro e informe o custo ao consumidor do
//mesmo;
    static void _12(Scanner input) {
        System.out.print("Qual � o custo de f�brica? ");
        var custoDeF�brica = input.nextDouble(); 
        custoDeF�brica *= 1.45;
        var custoDoDistribuidor = custoDeF�brica*1.28;
        var custo = custoDeF�brica + custoDoDistribuidor;
        System.out.print("O custo ao consumidor � " + custo);
    }
//13. Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este n�mero seja maior que 10;
    static void _13(Scanner input) {
        System.out.print("Informe um n�mero: ");
        var numero = input.nextInt();
        if(numero > 10) {
            System.out.print("O n�mero � maior que 10.");
        }
    }
//14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual � o maior;
    static void _14(Scanner input) {
        System.out.print("Informe o valor de A: ");
        var a = input.nextInt();
        System.out.print("Informe o valor de B: ");
        var b = input.nextInt();
        if(a == b) {
           System.out.print("A � igual a B.");
        } else if(a > b) {
            System.out.print("A � maior que B.");
        } else {
            System.out.print("B � maior que A.");
        }
    }
//15. Fa�a um algoritmo que receba um n�mero e diga se este n�mero est� no intervalo entre 100 e 200;
    static void _15(Scanner input) {
        System.out.print("Informe um n�mero: ");
        var n�mero = input.nextDouble();
        if(n�mero > 100 && n�mero < 200) {
            System.out.print("O n�mero  est� no intervalo entre 100 e 200.");
        }
    } 
}
