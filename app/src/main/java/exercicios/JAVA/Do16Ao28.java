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
//16. Escreva um algoritmo que leia o nome e as trús notas obtidas por um aluno durante o semestre. Calcular a
//sua múdia (aritmútica), informar o nome e sua menùúo aprovado (media >= 7), Reprovado (media <= 5) e
//Recuperaùúo (media entre 5.1 a 6.9);
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
            System.out.printf("média: %.2f, %s foi aprovado.", media, nome);
        } else if(media > 5) {
            System.out.printf("média: %.2f, %s está de recuperação.", media, nome);
        } else {
            System.out.printf("média: %.2f, %s está reprovado.", media, nome);
        }
    }
//17. Leia 80 números e ao final informar quantos número(s) est(ú)úo no intervalo entre 10 (inclusive) e 150
//(inclusive);
    static void _17(Scanner input) {
        var números = new Integer[80];
        for(int counter = 0; counter < números.length; counter++) {
            System.out.printf("Informe o número %d: ", counter + 1);
            números[counter] = input.nextInt();
        }
        var amostra = Arrays.stream(números)
                .filter(a -> a > 10 && a < 150)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.print("Os número(s) est(á)ão no intervalo entre 10 e 150 são: " + amostra);
    }
//18. Faúa um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando úmaior de idadeú e
//úmenor de idadeú para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
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
//19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela ú homem ou
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
                    "Número de homens: " + homens.count() + 
                    "\nNúmero de mulheres: " + mulheres.count() + "\n"
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
                    "Escolha uma opção:\n\t1. Pesquisar.\n\t2. Quantidade de homens e mulheres.\n\t3. Sair.\n"
            );
            option = input.next().charAt(0);
            if(option == '1') {
                System.out.print("Digite o nome de alguma pessoa: ");
                var nome = input.next();
                if(!encontrarPessoa(nome, pessoas)) {
                    System.out.print("Pessoa não encontrada.\n");
                }
            } else if(option == '2') {
                displayHomensAndMulheres(pessoas);
            } else if(option != '3') {
                System.out.print("Não existe essa opùúo.\n");
            }
        } while(option != '3');
    }
//20. A concessionúria de veúculos úCARANGO VELHOú estú vendendo os seus veúculos com desconto. Faúa
//um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vúrios carros. O
//desconto deverú ser calculado de acordo com o ano do veúculo. Atú 2000 - 12% e acima de 2000 - 7%. O
//sistema deverú perguntar se deseja continuar calculando desconto atú que a resposta seja: ú(N) Núoú.
//Informar total de carros com ano atú 2000 e total geral;
    static void calculateAndShowValorDoAutomóvel(Do16Ao28_Carro carro) {
            if(carro.ano > 2000) {
                var valorFinalDoAutomóvel = carro.preço*(1 - 0.07);
                System.out.printf("O Automóvel com desconto custará %.2f R$\n", valorFinalDoAutomóvel);
            } else if(carro.ano > 0) {
                var valorFinalDoAutomóvel = carro.preço*(1 - 0.12);
                System.out.printf("O Automóvel com desconto custará %.2f R$\n", valorFinalDoAutomóvel);
            } else {
                System.out.print("O ano do automóvel deve ser um valor positivo.\n");
            }
    }
    static boolean doYouDesireToProceed(Scanner input) {
            do {
                System.out.print("Deseja continuar?(S para sim ou N para não) ");
                var escolha = input.next();
                if(escolha.equalsIgnoreCase("n")) {
                    return false;
                } else if(!escolha.equalsIgnoreCase("s")) {
                    System.out.print("As alternativas são S ou N.\n");
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
                "Concessionária de veículos \"CARANGO VELHO\". ;)\nDigite o valor do automóvel: "
            );
            float preço = input.nextFloat();
            System.out.print("Agora digite o ano do automóvel: ");
            var ano = input.nextInt();
            var carro = new Do16Ao28_Carro(ano, preço);
            calculateAndShowValorDoAutomóvel(carro);
            carros.add(carro);
            continuar = doYouDesireToProceed(input);
        } while(continuar);
        var totalDeCarrosSemiNovos = carros.stream()
                .filter(a -> a.ano<=2000)
                .count();
        System.out.println("Total de carros semi novos: " + totalDeCarrosSemiNovos);
        System.out.print("Total de carros: " + carros.size());
    }
//21. Escreva um algoritmo que leia os dados de úNú pessoas (nome, sexo, idade e saúde) e informe se estú apta
//ou núo para cumprir o serviúo militar obrigatúrio. Informe os totais;
    static void _21(Scanner input) {
        var continuar = true;
        var pessoas = new ArrayList<Do16Ao28_Pessoa>();
        do {
            System.out.print("Digite o nome da pessoa: ");
            var nome = input.next();
            System.out.print("Digite a idade da pessoa: ");
            var idade = input.nextInt();
            var pessoa = new Do16Ao28_Pessoa(nome, idade);
            System.out.print("Digite se a pessoa tem saúde(S para sim ou N para não): ");
            pessoa.setSaúde(input.next());
            pessoas.add(pessoa);
            continuar = doYouDesireToProceed(input);
        } while(continuar);
        var stream = pessoas.stream();
        stream.forEach(a -> System.out.print("\nNome: " + a.nome + ", " + a.apto.get()));
        var númeroDeAptos = pessoas.stream()
                .filter(a -> a.aptoParaOServiçoMilitar())
                .count();
        var NúmeroDeInaptos = pessoas.stream()
                .filter(a -> !a.aptoParaOServiçoMilitar())
                .count();
        System.out.printf(
                "\nDe todas as pessoas cadastradas %d estão para o serviço militar e as demais %d não estão.",
                númeroDeAptos, NúmeroDeInaptos
        );
    }
//22. Faúa um algoritmo que receba o preúo de custo e o preúo de venda de 40 produtos. Mostre como resultado
//se houve lucro, prejuúzo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
//de venda de cada produto, a múdia de preúo de custo e do preúo de venda;
    static void _22(Scanner input) {
        _22(input, 40);
    }
    static void _22(Scanner input, int quantidadeDeProdutos) {
        var produtos = new Do16Ao28_Produto[quantidadeDeProdutos];
        for(int counter = 0; counter < produtos.length; counter++) {
            produtos[counter] = new Do16Ao28_Produto();
            System.out.printf("Informe o preço de custo do produto %d: ", counter + 1);
            produtos[counter].setPreçoDeCusto(input.nextFloat());
            System.out.print("Informe também o preço de venda do produto: ");
            produtos[counter].setPreçoDeVenda(input.nextFloat());
        }
        Consumer<Do16Ao28_Produto> consume = a -> System.out.print(a.getStatus() + "\n");
        Arrays.stream(produtos).forEach(consume);
        var médiaDosPreçosDeVenda = Arrays.stream(produtos)
                .map(a -> a.preçoDeVenda)
                .reduce(0.0, (a, b) -> a + b)
                /produtos.length;
        var médiaDosPreçosDeCusto = Arrays.stream(produtos)
                .map(a -> a.preçoDeCusto)
                .reduce(0.0, (a, b) -> a + b)
                /produtos.length;
        var médiaDeLucro = Arrays.stream(produtos)
                .map(a -> a.preçoFinal.get())
                .reduce(0.0, (a, b) -> a + b)
                /produtos.length;
        System.out.printf(
                "A média dos preços de custo é %.2f\n R$ e a média dos preços de venda é %.2f\n R$ e a média de lucro foi %.2f R$",
                médiaDosPreçosDeCusto, 
                médiaDosPreçosDeVenda, 
                médiaDeLucro
        );
    }
//23. Faúa um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80,
//menor que 25 ou igual a 40;
    static void _23(Scanner input) {
        System.out.print("Digite um número: ");
        var número = input.nextInt();
        if(número > 80) {
            System.out.print("O número é maior que 80.");
        } else if(número == 40) {
            System.out.print("O número é 40.");
        } else if(número < 25) {
            System.out.print("O número é menor que 25.");
        } else {
            System.out.print("O número é um número muito legal.");
        }
    }
//24. Faúa um algoritmo que receba úNú números e mostre positivo, negativo ou zero para cada número;
    static void _24(Scanner input) {
        var números = new ArrayList<Double>();
        var continuar = true;
        do {
            System.out.print("Digite um número para ser armazenado: ");
            números.add(input.nextDouble());
            continuar = doYouDesireToProceed(input);
        } while(continuar);
        Consumer<Double> consume = a -> {
            if(a == 0) {
                System.out.print(a + ": o número ú zero.");
            } else if(a > 0) {
                System.out.print(a + ": o número ú positivo.");
            } else {
                System.out.print(a + ": o número ú negativo.");
            }
            System.out.println();
        };
        números.stream().forEach(consume);
    }
//25. Faúa um algoritmo que leia dois números e identifique se súo iguais ou diferentes. Caso eles sejam iguais
//imprima uma mensagem dizendo que eles súo iguais. Caso sejam diferentes, informe qual número ú o
//maior, e uma mensagem que súo diferentes;
    static void _25(Scanner input) {
        System.out.print("Informe o número A: ");
        var a = input.nextInt();
        System.out.print("Informe o número B: ");
        var b = input.nextInt();
        if(a == b) {
           System.out.print("A e B são iguais.");
        } else {
           System.out.print("A e B são diferentes.");
           System.out.print(a > b ? " A é maior que B." : " B é maior que A.");
        }
    }
//26. Faúa um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuúrio digite um número
//que núo esteja neste intervalo, exibir a seguinte mensagem: número invúlido;
    static void _26(Scanner input) {
        System.out.print("Escreva um número de 1 a 5: ");
        var número = input.nextDouble();
        if(!(número >= 1 && número <= 5)) System.out.print("Número inválido");
//        System.out.print(número >= 1 && número <= 5? "Número vúlido" : "Número invúlido");
    }
//27. A concessionúria de veúculos úCARANGOú estú vendendo os seus veúculos com desconto. Faúa um
//algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverú ser 
//calculado sobre o valor do veúculo de acordo com o combustúvel (úlcool ú 25%, gasolina ú 21% ou diesel
//ú14%). Com valor do veúculo zero encerra entrada de dados. Informe total de desconto e total pago pelos
//clientes;
    static Do16Ao28_Carro cadastrarVeículo(Scanner input) {
            System.out.print("Digite o preço do carro: ");
            var preço = input.nextDouble();
            if(preço <= 0) {
                return null;
            }
            System.out.print("Digite o modelo do carro: ");
            var modelo = input.next();
            System.out.print("Digite o tipo de combustível do carro.\n(A para álcool, G para gasolina ou D para diesel): ");
            var tipoDeCombustível = input.next();
            return new Do16Ao28_Carro(tipoDeCombustível, modelo, preço);
    }
    static void _27(Scanner input) {
        var continuar = true;
        var carros = new ArrayList<Do16Ao28_Carro>();
        do {
            System.out.print(
                    "Consecionária \"CARANGO\".\n\t1. Cadastrar veículo.\n\t2. Comprar veículo.\nOpção escolhida: "
            );
            switch(input.next()) {
                case "1":
                    var carro = cadastrarVeículo(input);
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
                    System.out.print("Digite o número do carro que você deseja comprar: ");
                    var índiceDoCarroEscolhido = input.nextInt() - 1;
                    if(índiceDoCarroEscolhido >= 0 && índiceDoCarroEscolhido < carros.size()) {
                        var carroEscolhido = carros.get(índiceDoCarroEscolhido);
                        carroEscolhido.setVendido(true);
                        System.out.print("Comprado no valor " +  carroEscolhido.preçoComDesconto.get() + "\n");
                    } else  {
                        System.out.print("Carro não localizado.\n");
                    }
                    break;
                default: System.out.print("Não tem essa opção.\n");
            }
            if(continuar) continuar = doYouDesireToProceed(input);
        } while(continuar);
        Consumer<Do16Ao28_Carro> consume = a -> {
            System.out.print(a.getStatus() + "\n");
        };
        carros.stream().forEach(consume);
    }
//28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionúrios de acordo
//com os seguintes critúrios:
//a. 50% para aqueles que ganham menos do que trús salúrios múnimos;
//b. 20% para aqueles que ganham entre trús atú dez salúrios múnimos;
//c. 15% para aqueles que ganham acima de dez atú vinte salúrios múnimos;
//d. 10% para os demais funcionúrios.
    static Do16Ao28_Funcionário[] createFuncionários(int quantidadeDeFuncionúrios) {
        var funcionários = new Do16Ao28_Funcionário[quantidadeDeFuncionúrios];
        for(int counter = 0; counter < funcionários.length; counter++) {
            funcionários[counter] = new Do16Ao28_Funcionário();
        }
        return funcionários;
    }
    static void _28() {
        _28(584);
    }
    static void _28(int quantidadeDeFuncionários) {
        var funcionários = createFuncionários(quantidadeDeFuncionários);
        Function<Do16Ao28_Funcionário, Do16Ao28_Funcionário> mapper = a -> {
            if(a.getSalário()< (1300*3)) {
                a.reajustarSalário(1.5);
            } else if(a.getSalário() < (1300*10)) {
                a.reajustarSalário(1.2);
            } else if(a.getSalário() < (1300*20)) {
                a.reajustarSalário(1.15);
            } else {
                a.reajustarSalário(1.1);
            }
            return a;
        };
    }
}
