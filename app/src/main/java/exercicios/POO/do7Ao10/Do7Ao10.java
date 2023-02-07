package exercicios.POO.do7Ao10;

public class Do7Ao10 {
    public static void main(String[] args) {
        _10();
    }
//7. A fim de representar funcion�rios em uma empresa, crie uma classe chamada Funcionario que inclui as
//tr�s informa��es a seguir como atributos:
//a. um primeiro nome,
//b. um sobrenome
//c. um sal�rio mensal
//Sua classe deve ter um construtor que inicializa os tr�s atributos. Forne�a os m�todos getters e setters para
//cada atributo. Se o sal�rio mensal n�o for positivo, configure-o como 0.0. Escreva um aplicativo de teste
//que demonstra as capacidades da classe. Crie duas inst�ncias da classe e exiba o sal�rio anual de cada
//inst�ncia. Ent�o d� a cada empregado um aumento de 10% e exiba novamente o sal�rio anual de cada
//empregado.
    static void _7() {
        var josicleison = new Funcion�rio("Josicleison", "Elves", 1300);
        var josicleide = new Funcion�rio("Josicleide", "Elves", 1500);
        System.out.println(josicleison);
        System.out.println(josicleide);
        josicleison.raiseMonthlySalary(1.1);
        josicleide.raiseMonthlySalary(1.1);
        System.out.println(josicleison);
        System.out.print(josicleide);
    }
//8. Escreva uma classe Data cuja inst�ncia (objeto) represente uma data. Esta classe dever� dispor dos
//seguintes m�todos:
//a. Construtor: define a data que determinado objeto (atrav�s de par�metro), este m�todo verifica se a
//data est� correta, caso n�o esteja a data � configurada como 01/01/0001
//b. Compara: recebe como par�metro um outro objeto da Classe data, compare com a data corrente e
//retorne:
//i. 0 se as datas forem iguais;
//ii. 1 se a data corrente for maior que a do par�metro;
//iii. -1 se a data do par�metro for maior que a corrente.
//c. GetDia: retorna o dia da data
//d. GetMes: retorna o m�s da data
//e. GetMesExtenso: retorna o m�s da data corrente por extenso
//f. GetAno: retorna o ano da data
//g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contr�rio
//h. Clone: o objeto clona a si pr�prio, para isto, ele cria um novo objeto da classe Data com os
//mesmos valores de atributos e retorna sua refer�ncia pelo m�todo
    static void _8() {
        var data = new Data(9, 11, 1989);
        System.out.println(data);
        System.out.println(data.compareWith(1, 11, 1989));
        System.out.println(data.compareWith(9, 11, 1989));
        System.out.println(data.compareWith(10, 11, 1989));
        System.out.println("Dia: " + data.getDia());
        System.out.print("M�s: " + data.getM�s());
        System.out.println(" - " + data.getM�sPorExtenso());
        System.out.println("Ano: " + data.getAno());
        System.out.print("� ano bissexto: " + data.isBissexto());
    }
//9. Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em
//determinado hor�rio. Cada v�o possui no m�ximo 100 passageiros, e a classe permite controlar a
//ocupa��o das vagas. A classe deve ter os seguintes m�todos:
//a. Construtor: configura os dados do v�o (recebidos como par�metro): n�mero do v�o, data (para
//armazenar a data utilize um objeto da classe Data, criada na quest�o anterior);
//b. ProximoLivre: retorna o n�mero da pr�xima cadeira livre
//c. Verifica: verifica se o n�mero da cadeira recebido como par�metro est� ocupada
//d. Ocupa: ocupa determinada cadeira do v�o, cujo n�mero � recebido como par�metro, e retorna
//verdadeiro se a cadeira ainda n�o estiver ocupada (opera��o foi bem sucedida) e falso caso
//contr�rio
//e. Vagas: retorna o n�mero de cadeiras vagas dispon�veis (n�o ocupadas) no v�o
//f. GetVoo: retorna o n�mero do v�o
    static void _9() {
        var flight = new Flight(new Data(0, 0, 0, 0, 0), 10);
//        flight.occupyAll();
        System.out.println(flight.nextFree().getAsInt());
        System.out.println(flight.avaibleVacanciesAsString());
        System.out.println("N�mero de vagas dispon�veis: " + flight.numberOfVacantSpaces());
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
        System.out.println("N�mero de vagas dispon�veis: " + flight.numberOfVacantSpaces());
        flight.occupyAll();
        System.out.println("\n" + flight.avaibleVacanciesAsString());
        System.out.println("N�mero de vagas dispon�veis: " + flight.numberOfVacantSpaces());
        
        System.out.print("\nN�mero do v�o: " + flight.getFlight());
    }
//10. Crie uma classe para representar um jogador de futebol, com os atributos:
//a. nome;
//b. posi��o;
//c. data de nascimento;
//d. nacionalidade;
//e. altura;
//f. peso;
//Crie os m�todos p�blicos necess�rios para getters e setters e tamb�m um m�todo para imprimir todos os
//dados do jogador. Crie um m�todo para calcular a idade do jogador e outro m�todo para mostrar quanto
//tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posi��o de defesa se
//aposentam em m�dia aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.
    static void _10() {
        var player = new Jogador(
                "Josicleison", new Data(10, 10, 2000), "Afeganist�o", 'A'
        );
        System.out.println(player);
        System.out.println(player.getAge());
        System.out.println(player.timeToAposentar());
    }
}
