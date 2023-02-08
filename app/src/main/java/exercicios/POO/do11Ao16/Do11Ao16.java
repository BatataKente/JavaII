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
//valor do ingresso VIP (com o adicional inclui?do). Crie um programa para criar as inst�ncias de Ingresso e
//IngressoVIP, mostrando a diferen�a de pre�os.
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
//opera��es:
//a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
//b. void removerPessoa(String nome); //remove a pessoa do array
//c. int buscarPessoa(String nome); // informa em que posi��o da agenda est� a pessoa
//d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
//e. void imprimirPessoa(int index); // imprime os dados da pessoa que est� na posi��o �i� da agenda.
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
//13. Crie uma classe Calculadora. Esta classe deve implementar as opera��es b�sicas (soma, subtra��o, divis�o
//e multiplica��o). Utilizando o conceito de heran�a crie uma classe chamada calculadora cientifica que
//implementa os seguintes c�lculos: raizQuadrada e a potencia. Dica utilize a classe Math do pacote
//java.lang.
    static void _13() {
        System.out.println("1 + 2 + 3 = " + Calculadora.some(1,2,3));
        System.out.println("- 1 - 2 - 3 = " + Calculadora.subtraia(1,2,3));
        System.out.println("1 / 2 / 3 = " + Calculadora.divida(1,2,3));
        System.out.println("1 * 2 * 3 = " + Calculadora.multiplique(1,2,3));
        
        System.out.print("\n1 - 2 - 3 = " + Calculadora.some(
                1,Calculadora.subtraia(2,3))
        );
        
        System.out.println("\n\n5^0.5 = " + CalculadoraCient�fica.raizQuadradaDe(5));
        System.out.println("Raiz quadrada de 5 = " + CalculadoraCient�fica.potencia(5,0.5));
        System.out.println("5^2 = " + CalculadoraCient�fica.potencia(5,2));
    }
//14. Crie uma classe em Java chamada Fatura para uma loja de suprimentos de inform�tica. A classe deve
//conter quatro atributos:
//a. n�mero (String);
//b. descri��o (String);
//c. quantidade comprada de um item (int);
//d. pre�o por item (double).
//A classe deve ter um construtor e os m�todos getters e setters. Al�m disso, forne�a um m�todo chamado
//getTotalFatura que calcula o valor da fatura e depois retorna o valor como um double. Se o valor n�o for
//positivo, ele deve ser alterado para 0. Se o pre�o por item n�o for positivo, ele deve ser alterado para 0.
//Escreva uma nova classe chamada FaturaTeste (que contenha o m�todo main) que demonstre as
//capacidades da classe Fatura.
    static void _14() {
        var fatura = new Fatura("2", "Lero Lero", 4, 5);
        System.out.println(fatura.getTotalFatura());
        System.out.println(fatura.getDescription());
        System.out.println(fatura.getNumber());
        System.out.println(fatura.getPrice());
        System.out.println(fatura.getQuantity());
    }
//15. Crie uma classe chamada Funcion�rio que inclui tr�s atributos:
//a. nome (String);
//b. sobrenome (String);
//c. sal�rio mensal (double).
//A classe deve ter um construtor, m�todos getters e setters para cada atributo da classe. Escreva uma classe
//chamada FuncionarioTeste (que contenha o m�todo main) que cria dois objetos da classe Funcionario e
//exibe o sal�rio de um deles. Introduza na classe Funcionario uma vari�vel de classe capaz de
//contabilizar o numero cada objeto. Ent�o d� a cada Funcionario um aumento de 10% e exiba novamente o 
//sal�rio anual de cada um deles. Introduza na classe Funcionario uma vari�vel de classe capaz de
//contabilizar o numero de funcionarios que passaram pela empresa at� a data.
    static void _15() {
        var josicleison = new Funcion�rio("Josicleison", "Elves", 1300);
        var josicleide = new Funcion�rio("Josicleide", "Elves", 10000);
        System.out.println(josicleison.getMonthlySalary());
        System.out.println(josicleide.getMonthlySalary());
        var funcion�rios = Arrays.asList( josicleison, josicleide);
        System.out.println(funcion�rios.size());
        funcion�rios.stream().forEach(a -> a.raiseSalary(1.1));
        funcion�rios.forEach(System.out::println);
        System.out.println(josicleison.getMonthlySalary());
        System.out.println(josicleide.getMonthlySalary() + "\n");
        System.out.println(Funcion�rio.getN�meroM�ximoDeFuncion�rios());
        josicleide = null;
        System.out.print(Funcion�rio.getN�meroM�ximoDeFuncion�rios());
    }
//16. Construa uma classe para representar um carro. O tanque de combust�vel do carro armazena no m�ximo 50
//litros de gasolina. O carro consome 15 km/litro. Deve ser poss�vel:
//a. Abastecer o carro com certa quantidade de gasolina;
//b. Mover o carro em uma determinada dist�ncia (medida em km);
//c. Retornar a quantidade de combust�vel e a dist�ncia total percorrida.
//No programa principal, crie 2 carros. Abaste�a 20 litros no primeiro e 30 litros no segundo. Desloque o
//primeiro em 200 km e o segundo em 400 km. Exiba na tela a dist�ncia percorrida e o total de combust�vel
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
