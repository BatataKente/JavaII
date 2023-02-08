package exercicios.POO.do11Ao16;

import exercicios.POO.do1Ao6.Pessoa;
import java.util.Arrays;

public class Do11Ao16 {
    public static void main(String[] args) {
        _16();
    }
//11. Crie uma classe chamada Ingresso, que possui um valor em reais e um me?todo imprimirValor. Crie uma
//classe IngressoVIP, que herda de Ingresso e possui um valor adicional. Crie um me?
//todo que retorne o
//valor do ingresso VIP (com o adicional inclui?do). Crie um programa para criar as instâncias de Ingresso e
//IngressoVIP, mostrando a diferença de preços.
    static void _11() {
        var ingressos = Arrays.asList(
                new Ingresso(),
                new Ingresso(),
                new IngressoVIP(),
                new Ingresso(),
                new IngressoVIP(),
                new Ingresso()
        );
        ingressos.stream().forEach(Ingresso::imprimirValor);
    }
//12. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes
//operações:
//a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
//b. void removerPessoa(String nome); //remove a pessoa do array
//c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
//d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
//e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
    static void _12() {
        var agenda = new Agenda();
        agenda.addPessoas(new Pessoa("Josicleison", 30, 1.8f));
        agenda.addPessoas(new Pessoa("Josiclede", 23, 1.6f));
        agenda.addPessoas(new Pessoa("Godolfredo", 54, 1.5f));
        agenda.addPessoas(new Pessoa("Alfredite", 12, 1.2f));
        agenda.addPessoas(new Pessoa("Marcidinelson", 10, 1.4f));
        agenda.imprimirAgenda();
        System.out.println();
        System.out.println(agenda.buscarPessoaIndex("Josicleison"));
        agenda.removePessa("Josicleison");
        System.out.println(agenda.buscarPessoaIndex("Josicleison"));
        System.out.println();
        agenda.getPessoas().forEach(a -> System.out.println(a.getStatus()));
        System.out.println();
        agenda.imprimirPessoa(11);
        agenda.imprimirPessoa(1);
        agenda.imprimirPessoa(- 1);
    }
//13. Crie uma classe Calculadora. Esta classe deve implementar as operações básicas (soma, subtração, divisão
//e multiplicação). Utilizando o conceito de herança crie uma classe chamada calculadora cientifica que
//implementa os seguintes cálculos: raizQuadrada e a potencia. Dica utilize a classe Math do pacote
//java.lang.
    static void _13() {
        System.out.println("1 + 2 + 3 = " + Calculadora.some(1,2,3));
        System.out.println("- 1 - 2 - 3 = " + Calculadora.subtraia(1,2,3));
        System.out.println("1 / 2 / 3 = " + Calculadora.divida(1,2,3));
        System.out.println("1 * 2 * 3 = " + Calculadora.multiplique(1,2,3));
        
        System.out.print("\n1 - 2 - 3 = " + Calculadora.some(
                1,Calculadora.subtraia(2,3))
        );
        
        System.out.println("\n\n5^0.5 = " + CalculadoraCientífica.raizQuadradaDe(5));
        System.out.println("Raiz quadrada de 5 = " + CalculadoraCientífica.potencia(5,0.5));
        System.out.println("5^2 = " + CalculadoraCientífica.potencia(5,2));
    }
//14. Crie uma classe em Java chamada Fatura para uma loja de suprimentos de informática. A classe deve
//conter quatro atributos:
//a. número (String);
//b. descrição (String);
//c. quantidade comprada de um item (int);
//d. preço por item (double).
//A classe deve ter um construtor e os métodos getters e setters. Além disso, forneça um método chamado
//getTotalFatura que calcula o valor da fatura e depois retorna o valor como um double. Se o valor não for
//positivo, ele deve ser alterado para 0. Se o preço por item não for positivo, ele deve ser alterado para 0.
//Escreva uma nova classe chamada FaturaTeste (que contenha o método main) que demonstre as
//capacidades da classe Fatura.
    static void _14() {
        var fatura = new Fatura("2", "Lero Lero", 4, 5);
        System.out.println(fatura.getTotalFatura());
        System.out.println(fatura.getDescription());
        System.out.println(fatura.getNumber());
        System.out.println(fatura.getPrice());
        System.out.println(fatura.getQuantity());
    }
//15. Crie uma classe chamada Funcionário que inclui três atributos:
//a. nome (String);
//b. sobrenome (String);
//c. salário mensal (double).
//A classe deve ter um construtor, métodos getters e setters para cada atributo da classe. Escreva uma classe
//chamada FuncionarioTeste (que contenha o método main) que cria dois objetos da classe Funcionario e
//exibe o salário de um deles. Introduza na classe Funcionario uma variável de classe capaz de
//contabilizar o numero cada objeto. Então dê a cada Funcionario um aumento de 10% e exiba novamente o 
//salário anual de cada um deles. Introduza na classe Funcionario uma variável de classe capaz de
//contabilizar o numero de funcionarios que passaram pela empresa até a data.
    static void _15() {
        var josicleison = new Funcionário("Josicleison", "Elves", 1300);
        var josicleide = new Funcionário("Josicleide", "Elves", 10000);
        System.out.println(josicleison.getMonthlySalary());
        System.out.println(josicleide.getMonthlySalary());
        var funcionários = Arrays.asList( josicleison, josicleide);
        System.out.println(funcionários.size());
        funcionários.stream().forEach(a -> a.raiseSalary(1.1));
        funcionários.forEach(System.out::println);
        System.out.println(josicleison.getMonthlySalary());
        System.out.println(josicleide.getMonthlySalary() + "\n");
        System.out.println(Funcionário.getNúmeroMáximoDeFuncionários());
        josicleide = null;
        System.out.print(Funcionário.getNúmeroMáximoDeFuncionários());
    }
//16. Construa uma classe para representar um carro. O tanque de combustível do carro armazena no máximo 50
//litros de gasolina. O carro consome 15 km/litro. Deve ser possível:
//a. Abastecer o carro com certa quantidade de gasolina;
//b. Mover o carro em uma determinada distância (medida em km);
//c. Retornar a quantidade de combustível e a distância total percorrida.
//No programa principal, crie 2 carros. Abasteça 20 litros no primeiro e 30 litros no segundo. Desloque o
//primeiro em 200 km e o segundo em 400 km. Exiba na tela a distância percorrida e o total de combustível
//restante para cada um.
    static void _16() {
        var gol = new Carro(15);
        var corsa = new Carro(15);
        gol.abastecer(20);
        corsa.abastecer(30);
        System.out.println(gol);
        System.out.println(corsa + "\n");
        gol.mover(200);
        corsa.mover(400);
        System.out.println(gol);
        System.out.println(corsa);
    }
}
