package exercicios.POO.do7Ao10;

public class Do7Ao10 {
    public static void main(String[] args) {
        _10();
    }
//7. A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as
//três informações a seguir como atributos:
//a. um primeiro nome,
//b. um sobrenome
//c. um salário mensal
//Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para
//cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste
//que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada
//instância. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada
//empregado.
    static void _7() {
        var josicleison = new Funcionário("Josicleison", "Elves", 1300);
        var josicleide = new Funcionário("Josicleide", "Elves", 1500);
        System.out.println(josicleison);
        System.out.println(josicleide);
        josicleison.raiseMonthlySalary(1.1);
        josicleide.raiseMonthlySalary(1.1);
        System.out.println(josicleison);
        System.out.print(josicleide);
    }
//8. Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos
//seguintes métodos:
//a. Construtor: define a data que determinado objeto (através de parâmetro), este método verifica se a
//data está correta, caso não esteja a data é configurada como 01/01/0001
//b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e
//retorne:
//i. 0 se as datas forem iguais;
//ii. 1 se a data corrente for maior que a do parâmetro;
//iii. -1 se a data do parâmetro for maior que a corrente.
//c. GetDia: retorna o dia da data
//d. GetMes: retorna o mês da data
//e. GetMesExtenso: retorna o mês da data corrente por extenso
//f. GetAno: retorna o ano da data
//g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
//h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os
//mesmos valores de atributos e retorna sua referência pelo método
    static void _8() {
        var data = new Data(9, 11, 1989);
        System.out.println(data);
        System.out.println(data.compareWith(1, 11, 1989));
        System.out.println(data.compareWith(9, 11, 1989));
        System.out.println(data.compareWith(10, 11, 1989));
        System.out.println("Dia: " + data.getDia());
        System.out.print("Mês: " + data.getMês());
        System.out.println(" - " + data.getMêsPorExtenso());
        System.out.println("Ano: " + data.getAno());
        System.out.print("É ano bissexto: " + data.isBissexto());
    }
//9. Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em
//determinado horário. Cada vôo possui no máximo 100 passageiros, e a classe permite controlar a
//ocupação das vagas. A classe deve ter os seguintes métodos:
//a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para
//armazenar a data utilize um objeto da classe Data, criada na questão anterior);
//b. ProximoLivre: retorna o número da próxima cadeira livre
//c. Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada
//d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna
//verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso
//contrário
//e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
//f. GetVoo: retorna o número do vôo
    static void _9() {
        var flight = new Flight(new Data(0, 0, 0, 0, 0), 10);
//        flight.occupyAll();
        System.out.println(flight.nextFree().getAsInt());
        System.out.println(flight.avaibleVacanciesAsString());
        System.out.println("Número de vagas disponíveis: " + flight.numberOfVacantSpaces());
        System.out.print("\noccupy: " + flight.occupy(4) + "; ");
        System.out.print("occupy: " + flight.occupy(4) + "; ");
        System.out.print("verify: " + flight.verify(1) + "; ");
        System.out.print("occupy: " + flight.occupy(1) + "; ");
        System.out.println("verify: " + flight.verify(1));
        flight.occupy(167);
        flight.occupy(100);
        flight.occupy(67);
        flight.occupy(7);
        flight.occupy(17);
        flight.occupy(10);
        System.out.println("\n" + flight.avaibleVacanciesAsString());
        System.out.println("Número de vagas disponíveis: " + flight.numberOfVacantSpaces());
        flight.occupyAll();
        System.out.println("\n" + flight.avaibleVacanciesAsString());
        System.out.println("Número de vagas disponíveis: " + flight.numberOfVacantSpaces());
        
        System.out.print("\nNúmero do vôo: " + flight.getFlight());
    }
//10. Crie uma classe para representar um jogador de futebol, com os atributos:
//a. nome;
//b. posição;
//c. data de nascimento;
//d. nacionalidade;
//e. altura;
//f. peso;
//Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos os
//dados do jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto
//tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se
//aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.
    static void _10() {
        var player = new Jogador(
                "Josicleison", new Data(10, 10, 2000), "Afeganistão", 'A'
        );
        System.out.println(player);
        System.out.println(player.getAge());
        System.out.println(player.timeToAposentar());
    }
}
