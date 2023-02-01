package exercicios.JAVA;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Do16Ao28 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        _19(input);
        input.close();
    }
//16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
//sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
//Recuperação (media entre 5.1 a 6.9);
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
//17. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
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
//18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
//“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
    static void _18(Scanner input) {
        var idades = new int[75];
        for(int idade : idades) {
            System.out.print("Informe a sua idade: ");
            idade = input.nextInt();
            if(idade >= 18) {
                System.out.print("\nMaior de idade.");
            } else {
                System.out.print("\nMenor de idade.");
            }
        }
    }
//19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
//mulher. No final informe total de homens e de mulheres;
    static class Pessoa {
        final String nome;
        private char sexo;
        public Pessoa(String nome) {
            this.nome = nome;
        }
        String getSexo() {
            if(sexo == 'M') {
                return "Masculino";
            } else {
                return "Feminino";
            }
        }
        void setSexo(char sexo) {
            if(sexo == 'M' || sexo == 'F') {
                this.sexo = sexo;
            }
        }
        String getStatus() {
            return "Nome: " + nome + "; sexo: " + getSexo();
        }
    }
    static boolean encontrarPessoa(String nome, Pessoa[] pessoas) {
            for(Pessoa pessoa : pessoas) {
                if(pessoa.nome.equalsIgnoreCase(nome)) {
                    System.out.print("Pessoa encontrada: " + pessoa.getStatus() + "\n");
                    return true;
                }
            }
            return false;
    }
    static void _19(Scanner input) {
        var pessoas = new Pessoa[3];
        for(int counter = 0; counter < pessoas.length; counter++) {
            System.out.print("Digite o nome da pessoa: ");
            pessoas[counter] = new Pessoa(input.next());
            System.out.print("Digite o sexo da pessoa(M ou F): ");
            var sexo = input.next().charAt(0);
            pessoas[counter].setSexo(sexo);
        }
        char option;
        do {
            System.out.print(
                    "Escolha uma opção:" + 
                    "\n\t1. Pesquisar." + 
                    "\n\t2. Quantidade de homens e mulheres." + 
                    "\n\t3. Sair.\n"
            );
            option = input.next().charAt(0);
            if(option == '1') {
                System.out.print("Digite o nome de alguma pessoa: ");
                var nome = input.next();
                if(!encontrarPessoa(nome, pessoas)) {
                    System.out.print("Pessoa não encontrada.\n");
                }
            } else if(option == '2') {
                var homens = Arrays.stream(pessoas).filter(a -> a.getSexo().equals( "Masculino"));
                var mulheres = Arrays.stream(pessoas).filter(a -> a.getSexo().equals("Feminino"));
                System.out.print(
                        "Número de homens: " + homens.count() + 
                        "\nNúmero de mulheres: " + mulheres.count() + "\n"
                );
            } else if(option != '3') {
                System.out.print("Não existe essa opção.\n");
            }
        } while(option != '3');
    }
//20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
//um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
//desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
//sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
//Informar total de carros com ano até 2000 e total geral;
//21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
//ou não para cumprir o serviço militar obrigatório. Informe os totais;
//22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
//se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
//de venda de cada produto, amédia de preço de custo e do preço de venda;
//23. Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80,
//menor que 25 ou igual a 40;
//24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
//25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
//imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
//maior, e uma mensagem que são diferentes;
//26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número
//que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
//27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
//algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
//calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
//–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
//clientes;
//28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
//com os seguintes critérios:
//a. 50% para aqueles que ganham menos do que três salários mínimos;
//b. 20% para aqueles que ganham entre três até dez salários mínimos;
//c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
//d. 10% para os demais funcionários.
}
