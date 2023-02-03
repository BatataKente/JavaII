package exercicios.JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Do29Ao35 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        _35();
        input.close();
    }
//29. Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;
    static void _29() {
        var continuar = true;
        do {
            System.out.print("Informe o número do mês: ");
            var mês = input.next();
            switch(mês) {
                case "1" -> System.out.print("Janeiro.\n");
                case "2" -> System.out.print("Fevereiro.\n");
                case "3" -> System.out.print("Março.\n");
                case "4" -> System.out.print("Abril.\n");
                case "5" -> System.out.print("Maio.\n");
                case "6" -> System.out.print("Junho.\n");
                case "7" -> System.out.print("Julho.\n");
                case "8" -> System.out.print("Agosto.\n");
                case "9" -> System.out.print("Setembro.\n");
                case "10" -> System.out.print("Outubro.\n");
                case "11" -> System.out.print("Novembro.\n");
                case "12" -> System.out.print("Dezembro.\n");
                default -> System.out.print("Falha, mês inválido.\n");
            }
            continuar = Do16Ao28.doYouDesireToProceed(input);
        } while(continuar);
    }
//30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
    static void _30() {
        _30(3);
    }
    static void _30(int quantidadeDeNúmeros) {
        var números = new int[quantidadeDeNúmeros];
        for(int counter = 0; counter < números.length; counter++) {
            System.out.printf("Informe o número %d: ", counter + 1);
            números[counter] = input.nextInt();
        }
        System.out.print("Os números em ordem crescente: ");
        Arrays.stream(números).sorted().forEach(a -> System.out.print(a + " "));
    }
//31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
//resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
//impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
    static void _31() {
        var continuar = true;
        do {
            System.out.println("Escreva os números e a operação desejada.");
            System.out.print("A: ");
            var a = input.nextDouble();
            System.out.print("B: ");
            var b = input.nextDouble();
            System.out.print("Operação(+, -, *, /): ");
            var c = input.next().charAt(0);
            switch(c) {
                case '+' -> System.out.printf("%.1f + %.1f = %.1f\n", a, b, (a + b));
                case '-' -> System.out.printf("%.1f - %.1f = %.1f\n", a, b, (a -b));
                case '*' -> System.out.printf("%.1f * %.1f = %.1f\n", a, b, (a * b));
                case '/' -> System.out.printf("%.1f / %.1f = %.1f\n", a, b, (a / b));
                default -> System.out.print("Não tem essa opção.\n");
            }
            continuar = Do16Ao28.doYouDesireToProceed(input);
        } while(continuar);
    }
//32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
//Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
//Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
//outros dois lados.
//a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
//b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
//c. Triângulo equilátero é também isóscele;
//d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
    static void _32() {
        var continuar = true;
        do {
            System.out.println("Escreva os três lados do triângulo.");
            System.out.print("A: ");
            var a = input.nextDouble();
            System.out.print("B: ");
            var b = input.nextDouble();
            System.out.print("C: ");
            var c = input.nextDouble();
            if(a + b < c || c + b < a || a + c < b) {
                System.out.print("Os lados informados não forman um triângulo.\n");
            } else if(a == b && b == c) {
                System.out.print("O triângulo é Equilátero.\n");
            } else if(a == b || b == c || c == a) {
                System.out.print("O triângulo é Isóscele.\n");
            } else {
                System.out.print("O triângulo é Escaleno.\n");
            }
            continuar = Do16Ao28.doYouDesireToProceed(input);
        } while(continuar);
    }
//33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
//calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
//a. Professor Nível 1 R$12,00 por hora/aula;
//b. Professor Nível 2 R$17,00 por hora/aula;
//c. Professor Nível 3 R$25,00 por hora/aula.
    static Do29Ao35_Professor cadastrarProfessor() {
            System.out.print("Digite os dados do professor para o cadastro.");
            System.out.print("\nNome: ");
            var nome = input.next();
            System.out.print("Nível: ");
            var nível = input.nextInt();
            System.out.print("Horas mensais de trabalho: ");
            var horasDeTrabalhoMensal = input.nextInt();
            return new Do29Ao35_Professor(nome, nível, horasDeTrabalhoMensal);
    }
    static void encontrarProfessor(ArrayList<Do29Ao35_Professor> professores) {
            System.out.print("Digite o nome do professor: ");
            var nome = input.next();
            var professor = professores.stream()
                    .filter(a -> a.getNome().equalsIgnoreCase(nome))
                    .findFirst().get();
            if(professor != null) {
                System.out.print(professor.getStatus() + "\n");
            } else {
                System.out.print("Professor não localizado.\n");
            }
    }
    static void _33() {
        var continuar = true;
        var professores = new ArrayList<Do29Ao35_Professor>();
        do {
            System.out.print("Escola \"APRENDER\" escolha uma opção:");
            System.out.print("\n\t1. Cadastrar professor.");
            System.out.print("\n\t2. Exibir salário professor.\nopção: ");
            var option = input.next().charAt(0);
            if(option == '1') {
                professores.add(cadastrarProfessor());
            } else if(option == '2') {
                encontrarProfessor(professores);
            } else {
                System.out.print("Não tem essa opção.\n");
            }
            continuar = Do16Ao28.doYouDesireToProceed(input);
        } while(continuar);
    }
//34. Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
//a. Infantil A = 5 - 7 anos;
//b. Infantil B = 8 - 10 anos;
//c. Juvenil A = 11- 13 anos;
//d. Juvenil B = 14 - 17 anos;
//e. Sênior = 18 - 25 anos.
//Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;
    static void _34() {
        var continuar = true;
        var nadadores = new ArrayList<Do29Ao35_Nadador>();
        do {
            System.out.print("Cadastrar nadador(a)(Faixa etária 5 - 25).\nNome: ");
            var nome = input.next();
            var nadador = new Do29Ao35_Nadador(nome);
            System.out.print("Idade: ");
            var idade = input.nextInt();
            if(nadador.setIdade(idade)) {
                nadadores.add(nadador);
                System.out.print("Nadador cadastrado com sucesso.\n");
            } else {
                System.out.print("Idade fora da faixa etária.\n");
            }
            continuar = Do16Ao28.doYouDesireToProceed(input);
        } while(continuar);
        nadadores.stream().forEach(System.out::println);
    }
//35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
//luz segue a tabela abaixo:
//Tipo de Cliente Valor do KW/h
//a. (Residência) 0,60;
//b. (Comércio) 0,48;
//c. (Indústria) 1,29
    static void _35() {
        var continuar = true;
        do {
            System.out.print("Informe o tipo de Cliente(Residencia, Comercio ou Industria): ");
            var tipoDeCliente = input.next();
            boolean isTipoResidencia = tipoDeCliente.equalsIgnoreCase("Residencia");
            boolean isTipoComercio = tipoDeCliente.equalsIgnoreCase("Comercio");
            boolean isTipoIndustria = tipoDeCliente.equalsIgnoreCase("Industria");
            if(isTipoResidencia || isTipoComercio || isTipoIndustria) {
                System.out.print("Informe o consumo em KW/h: ");
                var consumo = input.nextDouble();
                if(isTipoResidencia) {
                    System.out.printf("Valor da conta: %.2f R$.\n", (consumo*0.6));
                } else if(isTipoComercio) {
                    System.out.printf("Valor da conta: %.2f R$.\n", (consumo*0.48));
                } else {
                    System.out.printf("Valor da conta: %.2f R$.\n", (consumo*1.29));
                }
            } else {
                System.out.print("Tipo inválido.\n");
            }
            continuar = Do16Ao28.doYouDesireToProceed(input);
        } while(continuar);
    }
}
