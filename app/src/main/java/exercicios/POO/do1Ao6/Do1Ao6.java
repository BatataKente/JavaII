package exercicios.POO.do1Ao6;

public class Do1Ao6 {
    public static void main(String[] args) {
        _6();
    }
//1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
//altura. Crie os m�todos p�blicos necess�rios para getters e setters e tamb�m um m�todo para imprimir
//todos dados de uma pessoa. Crie um m�todo para calcular a idade da pessoa.
    static void _1() {
        var pessoa = new Pessoa();
        pessoa.setAltura(0);
        pessoa.setName("Josicleison");
        pessoa.setBirthDate(11, 9, 1989);
        System.out.print(pessoa.getStatus());
    }
//2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
//n�mero da conta, nome do correntista e saldo. Os m�todos s�o os seguintes: alterarNome, dep�sito e
//saque; No construtor, saldo � opcional, com valor default zero e os demais atributos s�o obrigat�rios.
    static void _2() {
        var conta = new ContaCorrente("Josicleison", 0);
        conta.alterarNome("Josicleison Elves da Silva Jackson");
        conta.dep�sito(3000000);
        conta.saque(300);
        System.out.print(conta.getStatus());
    }
//3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
//seguintes atributos: tipo de combust�vel, valor por litro e quantidade de combust�vel. Al�m desses
//atributos a classes deve conter os seguintes m�todos.
//a. abastecerPorValor; //m�todo onde � informado o valor a ser abastecido e mostra a quantidade de
//litros que foi colocada no ve�culo
//b. abastecerPorLitro; // m�todo onde � informado a quantidade em litros de combust�vel e mostra o
//valor a ser pago pelo cliente.
//c. alterarValor; //altera o valor do litro do combust�vel.
//d. alterarCombustivel; //altera o tipo do combust�vel.
//e. alterarQuantidadeCombustivel; //altera a quantidade de combust�vel restante na bomba.
//Crie uma classe que contenha um m�todo main para testar sua classe BombaCombust�vel
    static void _3() {
        var bomba = new BombaCombustivel();
        System.out.println(bomba.getStatus());
        bomba.alterarValor(3.20);
        bomba.alterarCombustivel('A');
        bomba.alterarQuantidadeCombustivel(450);
        bomba.abastecerPorValor(100);
        bomba.abastecerPorLitro(50);
        System.out.println(bomba.getStatus());
    }
//4. Crie uma classe denominada Elevador para armazenar as informa��es de um elevador dentro de um
//pr�dio. A classe deve armazenar o andar atual (t�rreo = 0), total de andares no pr�dio (desconsiderando o
//t�rreo), capacidade do elevador e quantas pessoas est�o presentes nele. A classe deve tamb�m
//disponibilizar os seguintes m�todos:
//a. Inicializa: que deve receber como par�metros a capacidade do elevador e o total de andares no
//pr�dio (os elevadores sempre come�am no t�rreo e vazio);
//b. Entra: para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver espa�o);
//c. Sai: para remover uma pessoa do elevador (s� deve remover se houver algu�m dentro dele);
//d. Sobe: para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
//e. Desce: para descer um andar (n�o deve descer se j� estiver no t�rreo);
    static void _4() {
        var elevador = new Elevador(3, 4);
        System.out.println(elevador.getStatus());
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        System.out.println(elevador.getStatus());
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        System.out.println(elevador.getStatus());
        elevador.sair();
        elevador.descer();
        System.out.println(elevador.getStatus());
    }
//5. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
//classe deve guardar os seguintes dados do aluno: matr�cula, nome, 2 notas de prova e 1 nota de trabalho.
//Escreva os seguintes m�todos para esta classe:
//a. media: calcula a m�dia final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
//b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele n�o for para a final)
    static void _5() {
        var aluno = new Aluno("123", "Josicleison");
        aluno.setNotaI(1);
        aluno.setNotaII(9);
        aluno.setNotaDoTrabalho(4);
        System.out.println("M�dia do aluno: " + aluno.m�dia());
        System.out.println("Nota que falta para a prova final: " + aluno.notaQueFaltaParaAProvaFinal());
        System.out.print(aluno.getStatus());
    }
//6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de inform�tica para
//representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informa��es
//como atributos:
//a. o n�mero do item faturado,
//b. a descri��o do item,
//c. a quantidade comprada do item e
//d. o pre�o unit�rio do item.
//Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade n�o for positiva, ela
//deve ser configurada como 0. Se o pre�o por item n�o for positivo ele deve ser configurado como 0.0.
//Forne�a os m�todos getters e setters para cada vari�vel de inst�ncia. Al�m disso, forne�a um m�todo
//chamado getInvoiceAmount que calcula o valor da fatura (isso �, multiplica a quantidade pelo pre�o por
//item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as
//capacidades da classe Invoice.
    static void _6() {
        var invoice = new Invoice(123, "Lero Lero", 10, 20);
        System.out.println("Valor da fatura: " + invoice.getInvoiceAmount());
        System.out.print(invoice.getStatus());
    }
}
