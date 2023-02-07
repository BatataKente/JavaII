package exercicios.POO.do1Ao6;

public class Do1Ao6 {
    public static void main(String[] args) {
        _6();
    }
//1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
//altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
//todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
    static void _1() {
        var pessoa = new Pessoa();
        pessoa.setAltura(0);
        pessoa.setName("Josicleison");
        pessoa.setBirthDate(11, 9, 1989);
        System.out.print(pessoa.getStatus());
    }
//2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
//número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
//saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
    static void _2() {
        var conta = new ContaCorrente("Josicleison", 0);
        conta.alterarNome("Josicleison Elves da Silva Jackson");
        conta.depósito(3000000);
        conta.saque(300);
        System.out.print(conta.getStatus());
    }
//3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
//seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
//atributos a classes deve conter os seguintes métodos.
//a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
//litros que foi colocada no veículo
//b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
//valor a ser pago pelo cliente.
//c. alterarValor; //altera o valor do litro do combustível.
//d. alterarCombustivel; //altera o tipo do combustível.
//e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
//Crie uma classe que contenha um método main para testar sua classe BombaCombustível
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
//4. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
//prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
//térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também
//disponibilizar os seguintes métodos:
//a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
//prédio (os elevadores sempre começam no térreo e vazio);
//b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
//c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
//d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
//e. Desce: para descer um andar (não deve descer se já estiver no térreo);
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
//classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho.
//Escreva os seguintes métodos para esta classe:
//a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
//b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
    static void _5() {
        var aluno = new Aluno("123", "Josicleison");
        aluno.setNotaI(1);
        aluno.setNotaII(9);
        aluno.setNotaDoTrabalho(4);
        System.out.println("Média do aluno: " + aluno.média());
        System.out.println("Nota que falta para a prova final: " + aluno.notaQueFaltaParaAProvaFinal());
        System.out.print(aluno.getStatus());
    }
//6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para
//representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações
//como atributos:
//a. o número do item faturado,
//b. a descrição do item,
//c. a quantidade comprada do item e
//d. o preço unitário do item.
//Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela
//deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0.
//Forneça os métodos getters e setters para cada variável de instância. Além disso, forneça um método
//chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por
//item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as
//capacidades da classe Invoice.
    static void _6() {
        var invoice = new Invoice(123, "Lero Lero", 10, 20);
        System.out.println("Valor da fatura: " + invoice.getInvoiceAmount());
        System.out.print(invoice.getStatus());
    }
}
