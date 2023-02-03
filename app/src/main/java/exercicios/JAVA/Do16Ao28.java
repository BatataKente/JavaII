package exercicios.JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Do16Ao28 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        _27(input );
        input.close();
    }
//16. Escreva um algoritmo que leia o nome e as tr�s notas obtidas por um aluno durante o semestre. Calcular a
//sua m�dia (aritm�tica), informar o nome e sua men��o aprovado (media >= 7), Reprovado (media <= 5) e
//Recupera��o (media entre 5.1 a 6.9);
    static void _16(Scanner input) {
        System.out.print("Escreva o nome do aluno: ");
        var nome = input.nextLine();
        var notas = new double[3];
        for(int counter = 0; counter < notas.length; counter++) {
            System.out.printf("Escreva a nota %d: ", counter + 1);
            notas[counter] = input.nextFloat();
        }
        var media = Arrays.stream(notas).reduce(0, (a, b) -> a + b)/notas.length;
        if(media >= 7) {
            System.out.printf("m�dia: %.2f, %s foi aprovado.", media, nome);
        } else if(media > 5) {
            System.out.printf("m�dia: %.2f, %s est� de recupera��o.", media, nome);
        } else {
            System.out.printf("m�dia: %.2f, %s est� reprovado.", media, nome);
        }
    }
//17. Leia 80 n�meros e ao final informar quantos n�mero(s) est(�)�o no intervalo entre 10 (inclusive) e 150
//(inclusive);
    static void _17(Scanner input) {
        var n�meros = new Integer[80];
        for(int counter = 0; counter < n�meros.length; counter++) {
            System.out.printf("Informe o n�mero %d: ", counter + 1);
            n�meros[counter] = input.nextInt();
        }
        var amostra = Arrays.stream(n�meros)
                .filter(a -> a > 10 && a < 150)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.print("Os n�mero(s) est(�)�o no intervalo entre 10 e 150 s�o: " + amostra);
    }
//18. Fa�a um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando �maior de idade� e
//�menor de idade� para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
    static void _18(Scanner input) {
        _18(input, 75);
    }
    static void _18(Scanner input, int numberOfAges) {
        var idades = new int[numberOfAges];
        for(int idade : idades) {
            System.out.print("Informe a sua idade: ");
            idade = input.nextInt();
            if(idade >= 18) {
                System.out.print("Maior de idade.\n");
            } else {
                System.out.print("Menor de idade.\n");
            }
        }
    }
//19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela � homem ou
//mulher. No final informe total de homens e de mulheres;
    static boolean encontrarPessoa(String nome, Do16Ao28_Pessoa[] pessoas) {
            for(Do16Ao28_Pessoa pessoa : pessoas) {
                if(pessoa.nome.equalsIgnoreCase(nome)) {
                    System.out.print("Pessoa encontrada: " + pessoa.getStatus() + "\n");
                    return true;
                }
            }
            return false;
    }
    static void displayHomensAndMulheres(Do16Ao28_Pessoa[] pessoas) {
            var homens = Arrays.stream(pessoas).filter(a -> a.getSexo().equals( "Masculino"));
            var mulheres = Arrays.stream(pessoas).filter(a -> a.getSexo().equals("Feminino"));
            System.out.print(
                    "N�mero de homens: " + homens.count() + 
                    "\nN�mero de mulheres: " + mulheres.count() + "\n"
            );
    }
    static void _19(Scanner input) {
        _19(input, 56);
    }
    static void _19(Scanner input, int quantidadeDePessoas) {
        var pessoas = new Do16Ao28_Pessoa[quantidadeDePessoas];
        for(int counter = 0; counter < pessoas.length; counter++) {
            System.out.print("Digite o nome da pessoa: ");
            pessoas[counter] = new Do16Ao28_Pessoa(input.next());
            System.out.print("Digite o sexo da pessoa(M ou F): ");
            var sexo = input.next().charAt(0);
            pessoas[counter].setSexo(sexo);
        }
        char option;
        do {
            System.out.print(
                    "Escolha uma op��o:\n\t1. Pesquisar.\n\t2. Quantidade de homens e mulheres.\n\t3. Sair.\n"
            );
            option = input.next().charAt(0);
            if(option == '1') {
                System.out.print("Digite o nome de alguma pessoa: ");
                var nome = input.next();
                if(!encontrarPessoa(nome, pessoas)) {
                    System.out.print("Pessoa n�o encontrada.\n");
                }
            } else if(option == '2') {
                displayHomensAndMulheres(pessoas);
            } else if(option != '3') {
                System.out.print("N�o existe essa op��o.\n");
            }
        } while(option != '3');
    }
//20. A concession�ria de ve�culos �CARANGO VELHO� est� vendendo os seus ve�culos com desconto. Fa�a
//um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de v�rios carros. O
//desconto dever� ser calculado de acordo com o ano do ve�culo. At� 2000 - 12% e acima de 2000 - 7%. O
//sistema dever� perguntar se deseja continuar calculando desconto at� que a resposta seja: �(N) N�o�.
//Informar total de carros com ano at� 2000 e total geral;
    static void calculateAndShowValorDoAutom�vel(Do16Ao28_Carro carro) {
            if(carro.ano > 2000) {
                var valorFinalDoAutom�vel = carro.pre�o*(1 - 0.07);
                System.out.printf("O Autom�vel com desconto custar� %.2f R$\n", valorFinalDoAutom�vel);
            } else if(carro.ano > 0) {
                var valorFinalDoAutom�vel = carro.pre�o*(1 - 0.12);
                System.out.printf("O Autom�vel com desconto custar� %.2f R$\n", valorFinalDoAutom�vel);
            } else {
                System.out.print("O ano do autom�vel deve ser um valor positivo.\n");
            }
    }
    static boolean doYouDesireToProceed(Scanner input) {
            do {
                System.out.print("Deseja continuar?(S para sim ou N para n�o) ");
                var escolha = input.next();
                if(escolha.equalsIgnoreCase("n")) {
                    return false;
                } else if(!escolha.equalsIgnoreCase("s")) {
                    System.out.print("As alternativas s�o S ou N.\n");
                } else {
                    break;
                }
            } while(true);
            return true;
    }
    static void _20(Scanner input) {
        var continuar = true;
        var carros = new ArrayList<Do16Ao28_Carro>();
        do {
            System.out.print(
                "Concession�ria de ve�culos \"CARANGO VELHO\". ;)\nDigite o valor do autom�vel: "
            );
            float pre�o = input.nextFloat();
            System.out.print("Agora digite o ano do autom�vel: ");
            var ano = input.nextInt();
            var carro = new Do16Ao28_Carro(ano, pre�o);
            calculateAndShowValorDoAutom�vel(carro);
            carros.add(carro);
            continuar = doYouDesireToProceed(input);
        } while(continuar);
        var totalDeCarrosSemiNovos = carros.stream()
                .filter(a -> a.ano<=2000)
                .count();
        System.out.println("Total de carros semi novos: " + totalDeCarrosSemiNovos);
        System.out.print("Total de carros: " + carros.size());
    }
//21. Escreva um algoritmo que leia os dados de �N� pessoas (nome, sexo, idade e sa�de) e informe se est� apta
//ou n�o para cumprir o servi�o militar obrigat�rio. Informe os totais;
    static void _21(Scanner input) {
        var continuar = true;
        var pessoas = new ArrayList<Do16Ao28_Pessoa>();
        do {
            System.out.print("Digite o nome da pessoa: ");
            var nome = input.next();
            System.out.print("Digite a idade da pessoa: ");
            var idade = input.nextInt();
            var pessoa = new Do16Ao28_Pessoa(nome, idade);
            System.out.print("Digite se a pessoa tem sa�de(S para sim ou N para n�o): ");
            pessoa.setSa�de(input.next());
            pessoas.add(pessoa);
            continuar = doYouDesireToProceed(input);
        } while(continuar);
        var stream = pessoas.stream();
        stream.forEach(a -> System.out.print("\nNome: " + a.nome + ", " + a.apto.get()));
        var n�meroDeAptos = pessoas.stream()
                .filter(a -> a.aptoParaOServi�oMilitar())
                .count();
        var N�meroDeInaptos = pessoas.stream()
                .filter(a -> !a.aptoParaOServi�oMilitar())
                .count();
        System.out.printf(
                "\nDe todas as pessoas cadastradas %d est�o para o servi�o militar e as demais %d n�o est�o.",
                n�meroDeAptos, N�meroDeInaptos
        );
    }
//22. Fa�a um algoritmo que receba o pre�o de custo e o pre�o de venda de 40 produtos. Mostre como resultado
//se houve lucro, preju�zo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
//de venda de cada produto, a m�dia de pre�o de custo e do pre�o de venda;
    static void _22(Scanner input) {
        _22(input, 40);
    }
    static void _22(Scanner input, int quantidadeDeProdutos) {
        var produtos = new Do16Ao28_Produto[quantidadeDeProdutos];
        for(int counter = 0; counter < produtos.length; counter++) {
            produtos[counter] = new Do16Ao28_Produto();
            System.out.printf("Informe o pre�o de custo do produto %d: ", counter + 1);
            produtos[counter].setPre�oDeCusto(input.nextFloat());
            System.out.print("Informe tamb�m o pre�o de venda do produto: ");
            produtos[counter].setPre�oDeVenda(input.nextFloat());
        }
        Consumer<Do16Ao28_Produto> consume = a -> System.out.print(a.getStatus() + "\n");
        Arrays.stream(produtos).forEach(consume);
        var m�diaDosPre�osDeVenda = Arrays.stream(produtos)
                .map(a -> a.pre�oDeVenda)
                .reduce(0.0, (a, b) -> a + b)
                /produtos.length;
        var m�diaDosPre�osDeCusto = Arrays.stream(produtos)
                .map(a -> a.pre�oDeCusto)
                .reduce(0.0, (a, b) -> a + b)
                /produtos.length;
        var m�diaDeLucro = Arrays.stream(produtos)
                .map(a -> a.pre�oFinal.get())
                .reduce(0.0, (a, b) -> a + b)
                /produtos.length;
        System.out.printf(
                "A m�dia dos pre�os de custo � %.2f\n R$ e a m�dia dos pre�os de venda � %.2f\n R$ e a m�dia de lucro foi %.2f R$",
                m�diaDosPre�osDeCusto, 
                m�diaDosPre�osDeVenda, 
                m�diaDeLucro
        );
    }
//23. Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este n�mero seja maior que 80,
//menor que 25 ou igual a 40;
    static void _23(Scanner input) {
        System.out.print("Digite um n�mero: ");
        var n�mero = input.nextInt();
        if(n�mero > 80) {
            System.out.print("O n�mero � maior que 80.");
        } else if(n�mero == 40) {
            System.out.print("O n�mero � 40.");
        } else if(n�mero < 25) {
            System.out.print("O n�mero � menor que 25.");
        } else {
            System.out.print("O n�mero � um n�mero muito legal.");
        }
    }
//24. Fa�a um algoritmo que receba �N� n�meros e mostre positivo, negativo ou zero para cada n�mero;
    static void _24(Scanner input) {
        var n�meros = new ArrayList<Double>();
        var continuar = true;
        do {
            System.out.print("Digite um n�mero para ser armazenado: ");
            n�meros.add(input.nextDouble());
            continuar = doYouDesireToProceed(input);
        } while(continuar);
        Consumer<Double> consume = a -> {
            if(a == 0) {
                System.out.print(a + ": o n�mero � zero.");
            } else if(a > 0) {
                System.out.print(a + ": o n�mero � positivo.");
            } else {
                System.out.print(a + ": o n�mero � negativo.");
            }
            System.out.println();
        };
        n�meros.stream().forEach(consume);
    }
//25. Fa�a um algoritmo que leia dois n�meros e identifique se s�o iguais ou diferentes. Caso eles sejam iguais
//imprima uma mensagem dizendo que eles s�o iguais. Caso sejam diferentes, informe qual n�mero � o
//maior, e uma mensagem que s�o diferentes;
    static void _25(Scanner input) {
        System.out.print("Informe o n�mero A: ");
        var a = input.nextInt();
        System.out.print("Informe o n�mero B: ");
        var b = input.nextInt();
        if(a == b) {
           System.out.print("A e B s�o iguais.");
        } else {
           System.out.print("A e B s�o diferentes.");
           System.out.print(a > b ? " A � maior que B." : " B � maior que A.");
        }
    }
//26. Fa�a um algoritmo que leia um n�mero de 1 a 5 e escreva por extenso. Caso o usu�rio digite um n�mero
//que n�o esteja neste intervalo, exibir a seguinte mensagem: n�mero inv�lido;
    static void _26(Scanner input) {
        System.out.print("Escreva um n�mero de 1 a 5: ");
        var n�mero = input.nextDouble();
        if(!(n�mero >= 1 && n�mero <= 5)) System.out.print("N�mero inv�lido");
//        System.out.print(n�mero >= 1 && n�mero <= 5? "N�mero v�lido" : "N�mero inv�lido");
    }
//27. A concession�ria de ve�culos �CARANGO� est� vendendo os seus ve�culos com desconto. Fa�a um
//algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto dever� ser 
//calculado sobre o valor do ve�culo de acordo com o combust�vel (�lcool � 25%, gasolina � 21% ou diesel
//�14%). Com valor do ve�culo zero encerra entrada de dados. Informe total de desconto e total pago pelos
//clientes;
    static Do16Ao28_Carro cadastrarVe�culo(Scanner input) {
            System.out.print("Digite o pre�o do carro: ");
            var pre�o = input.nextDouble();
            if(pre�o <= 0) {
                return null;
            }
            System.out.print("Digite o modelo do carro: ");
            var modelo = input.next();
            System.out.print("Digite o tipo de combust�vel do carro.\n(A para �lcool, G para gasolina ou D para diesel): ");
            var tipoDeCombust�vel = input.next();
            return new Do16Ao28_Carro(tipoDeCombust�vel, modelo, pre�o);
    }
    static void _27(Scanner input) {
        var continuar = true;
        var carros = new ArrayList<Do16Ao28_Carro>();
        do {
            System.out.print(
                    "Consecion�ria \"CARANGO\".\n\t1. Cadastrar ve�culo.\n\t2. Comprar ve�culo.\nOp��o escolhida: "
            );
            switch(input.next()) {
                case "1":
                    var carro = cadastrarVe�culo(input);
                    if(carro != null) {
                        carros.add(carro);
                        break;
                    }
                    continuar = false;
                    break;
                case "2":
                    for(int counter = 0; counter < carros.size(); counter++) {
                        System.out.print((counter + 1) + ": " + carros.get(counter) + "\n");
                    }
                    System.out.print("Digite o n�mero do carro que voc� deseja comprar: ");
                    var �ndiceDoCarroEscolhido = input.nextInt() - 1;
                    if(�ndiceDoCarroEscolhido >= 0 && �ndiceDoCarroEscolhido < carros.size()) {
                        var carroEscolhido = carros.get(�ndiceDoCarroEscolhido);
                        carroEscolhido.setVendido(true);
                        System.out.print("Comprado no valor " +  carroEscolhido.pre�oComDesconto.get() + "\n");
                    } else  {
                        System.out.print("Carro n�o localizado.\n");
                    }
                    break;
                default: System.out.print("N�o tem essa op��o.\n");
            }
            if(continuar) continuar = doYouDesireToProceed(input);
        } while(continuar);
        Consumer<Do16Ao28_Carro> consume = a -> {
            System.out.print(a.getStatus() + "\n");
        };
        carros.stream().forEach(consume);
    }
//28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcion�rios de acordo
//com os seguintes crit�rios:
//a. 50% para aqueles que ganham menos do que tr�s sal�rios m�nimos;
//b. 20% para aqueles que ganham entre tr�s at� dez sal�rios m�nimos;
//c. 15% para aqueles que ganham acima de dez at� vinte sal�rios m�nimos;
//d. 10% para os demais funcion�rios.
    static Do16Ao28_Funcion�rio[] createFuncion�rios(int quantidadeDeFuncion�rios) {
        var funcion�rios = new Do16Ao28_Funcion�rio[quantidadeDeFuncion�rios];
        for(int counter = 0; counter < funcion�rios.length; counter++) {
            funcion�rios[counter] = new Do16Ao28_Funcion�rio();
        }
        return funcion�rios;
    }
    static void _28() {
        _28(584);
    }
    static void _28(int quantidadeDeFuncion�rios) {
        var funcion�rios = createFuncion�rios(quantidadeDeFuncion�rios);
        Function<Do16Ao28_Funcion�rio, Do16Ao28_Funcion�rio> mapper = a -> {
            if(a.getSal�rio()< (1300*3)) {
                a.reajustarSal�rio(1.5);
            } else if(a.getSal�rio() < (1300*10)) {
                a.reajustarSal�rio(1.2);
            } else if(a.getSal�rio() < (1300*20)) {
                a.reajustarSal�rio(1.15);
            } else {
                a.reajustarSal�rio(1.1);
            }
            return a;
        };
    }
}
