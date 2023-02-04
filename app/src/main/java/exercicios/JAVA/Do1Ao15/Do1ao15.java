package exercicios.JAVA.do1Ao15;

import java.util.Scanner;

public class Do1ao15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        _14(input);
    }
//1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
    static float sumResult(float a, float b) {
        return a + b;
    }
    static void _1(float a, float b) {
        System.out.print(sumResult(a, b));
    }
//2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
//dos dois números lidos;
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
        System.out.println("Subtração: " +subtractResult(a, b));
        System.out.println("Divisão: " +divideResult(a, b));
        System.out.print("Multipricação: " +multiplyResult(a, b));
    }
//3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
//total percorrida pelo automóvel e o total de combustível gasto;
    static void _3(Scanner input) {
        System.out.print("Digite o consumo total de combustível: ");
        var consumo = input.nextFloat();
        System.out.print("Digite a distância total: ");
        var distancia = input.nextFloat();
        System.out.print(
                "O consumo médio do veículo é: " + divideResult(consumo, distancia)
        );
        input.close();
    }
//4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
//por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
//efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
    static void _4(Scanner input) {
        var comissao = 0.15f;
        System.out.print("Qual o nome do vendedor? ");
        var name = input.nextLine();
        System.out.print("Qual o salário fixo do vendedor? ");
        var salario = input.nextFloat();
        System.out.print("Qual foi o total em dinheiro de vendas efetuadas? ");
        var dinheiro = input.nextFloat();
        System.out.print(
                "O salário final do " + name + " foi " + 
                sumResult(salario, multiplyResult(dinheiro, comissao))
        );
    }
//5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
//No finalinformar o nome do aluno e a sua média (aritmética);
    static void _5(Scanner input) {
        System.out.print("Qual é o nome do aluno? ");
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
//6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
//possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
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
//7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
//conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
    static void _7(Scanner input) {
        System.out.print("Digite a temperatura em graus Celsius: ");
        var C = input.nextDouble();
        var F = (9*C+160) / 5;
        System.out.print("A temperatura em Fahrenheit é " + F);
    }
//8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em
//dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
//disponíveis com ousuário;
    static void _8(Scanner input) {
        System.out.print("Qual o valor em reais? ");
        var reais = input.nextDouble();
        System.out.print("Qual a cotação atual do dólar? ");
        var cotacao = input.nextDouble();
        System.out.print(
                "O valor em dólares é equivalente a " + 
                (reais / cotacao) + " dólares"
        );
    }
//9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
//mês.Considere fixo o juro da poupança em 0,07% a. m;
    static void _9(double valor) {
        var rendimento = 1.0007;
        System.out.print(
                "Valor com rendimento no mês que vem: " + (valor*rendimento)
        );
    }
//10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um
//algoritmo que receba um valor de uma compra e mostre o valor das prestações;
    static void _10(Scanner input) {
        System.out.print("Escreva o valor total do produto: ");
        var total = input.nextDouble();
        System.out.printf("Cada prestação custará %.2f reais", total/5);
    }
//11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
//preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
    static float cálculoDeVenda(float custo, float percentual) {
        return custo * ((1 + percentual)/100);
    }
    static void _11(Scanner input) {
        System.out.print("Informe o preço de custo: ");
        var custo = input.nextFloat();
        System.out.print("Informe o percentual de acreéscimo: ");
        var percentual = input.nextFloat();
        System.out.print("O preço de venda é " + cálculoDeVenda(custo, percentual));
    }
//12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
//dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
//do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
//45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
//mesmo;
    static void _12(Scanner input) {
        System.out.print("Qual é o custo de fábrica? ");
        var custoDeFábrica = input.nextDouble(); 
        custoDeFábrica *= 1.45;
        var custoDoDistribuidor = custoDeFábrica*1.28;
        var custo = custoDeFábrica + custoDoDistribuidor;
        System.out.print("O custo ao consumidor é " + custo);
    }
//13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
    static void _13(Scanner input) {
        System.out.print("Informe um número: ");
        var numero = input.nextInt();
        if(numero > 10) {
            System.out.print("O número é maior que 10.");
        }
    }
//14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
    static void _14(Scanner input) {
        System.out.print("Informe o valor de A: ");
        var a = input.nextInt();
        System.out.print("Informe o valor de B: ");
        var b = input.nextInt();
        if(a == b) {
           System.out.print("A é igual a B.");
        } else if(a > b) {
            System.out.print("A é maior que B.");
        } else {
            System.out.print("B é maior que A.");
        }
    }
//15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
    static void _15(Scanner input) {
        System.out.print("Informe um número: ");
        var número = input.nextDouble();
        if(número > 100 && número < 200) {
            System.out.print("O número  está no intervalo entre 100 e 200.");
        }
    } 
}
