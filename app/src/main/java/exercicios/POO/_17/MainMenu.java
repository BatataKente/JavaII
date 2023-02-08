package exercicios.POO._17;

import exercicios.JAVA.do16Ao28.Do16Ao28;
import exercicios.POO.do1Ao6.Pessoa;
import exercicios.POO.do7Ao10.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class MainMenu {
    private static final Scanner input = new Scanner(System.in);
    private static List<Compromisso> compromissos = new ArrayList<>();
    public static void main(String[] args) {
        displayMainMenu();
    }
//17. O agendamento de compromissos � uma das tarefas mais comuns para profissionais. Um sistema com essa
//finalidade deve ser capaz de gerenciar compromissos, atribuindo a cada um o seu tipo (reuni�o, pagamento,
//entrega de projeto); data; nome do participante ( pessoa, empresa etc) algu�m com quem acontecer� � o
//compromisso) e seu telefone. Desenvolva um sistema que seja capaz de fazer opera��es b�sicas como
//agendar, remover e alterar compromissos e exibir compromissos por participante e por data.
    static Compromisso agendar() throws Exception {
        var compromisso = new Compromisso();
        return agendar(compromisso);
    }
    static Compromisso agendar(Compromisso compromisso) throws Exception {
        input.nextLine();
        System.out.print("Qual � o tipo de compromisso? ");
        var tipo = input.next();
        input.nextLine();
        System.out.print("Qual � a data que ocorrer� o compromisso?\nDia: ");
        var dia = input.nextInt();
        System.out.print("M�s: ");
        var m�s = input.nextInt();
        System.out.print("Ano: ");
        var ano = input.nextInt();
        System.out.print("Hora: ");
        var hora = input.nextInt();
        System.out.print("Minutos: ");
        var minutos = input.nextInt();
        var continuar = true;
        var participantes = new ArrayList<Pessoa>();
        do {
            System.out.print("Informe o nome de um participante: ");
            var nome = input.next();
            participantes.add(new Pessoa(nome));
            continuar = Do16Ao28.doYouDesireToProceed(input, "Mais algu�m?");
        } while(continuar);
        var data = new Data(dia, m�s, ano, hora, minutos);
        System.out.println("Agendamento efetuado com sucesso.");
        compromisso.set(tipo, data, participantes);
        return compromisso;
    }
    static void remover() throws Exception {
        if(!compromissos.isEmpty()) {
            exibir();
            System.out.print("Qual voce deseja remover? ");
            var index = input.nextInt();
            var compromisso = compromissos.get(index);
            compromissos = compromissos.stream().filter(a -> !a.equals(compromisso)).toList();
        } else {
            System.out.println("N�o h� compromissos agendados.");
        }
    }
    static void alterar() throws Exception {
        if(!compromissos.isEmpty()) {
            exibir();
            System.out.print("Qual voce deseja alterar? ");
            var index = input.nextInt();
            var compromisso = compromissos.get(index);
            agendar(compromisso);
        } else {
            System.out.println("N�o h� compromissos agendados.");
        }
    }
    static void exibir() throws Exception {
        IntConsumer showEnumerated = a -> {
            System.out.println(a + ": " + compromissos.get(a));
        };
        IntStream.range(0, compromissos.size()).forEach(showEnumerated);
    }
    static void displayMainMenu() {
        var continuar = true;
        do {
            System.out.print("\t1. Agendar compromisso.\n\t2. Remover compromisso.");
            System.out.print(
                    "\n\t3. Alterar compromisso.\n\t4. Exibir Compromissos.\nEscolha uma op��o: "
            );
            var op��o = input.next();
            if(op��o.equalsIgnoreCase("1")) {
                tente(
                        () -> {compromissos.add(agendar());}
                );
            } else if(op��o.equalsIgnoreCase("2")) {
                tente(
                        () -> {remover();}
                );
            } else if(op��o.equalsIgnoreCase("3")) {
                tente(
                        () -> {alterar();}
                );
            } else if(op��o.equalsIgnoreCase("4")) {
                tente(
                        () -> {exibir();}
                );
            } else {
                System.out.println("N�o tem essa op��o.");
            }
            continuar = Do16Ao28.doYouDesireToProceed(input);
        } while(continuar);
        input.close();
    }
    private interface Faz�vel {
        void run() throws Exception;
    }
    private static void tente(Faz�vel fazer) {
        try {
            fazer.run();
        } catch(Exception error) {
            System.out.println(error);
            input.nextLine();
        }
    }
}
