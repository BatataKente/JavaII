package exercicios.POO.do7Ao10;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Flight {
//9. Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em
//determinado hor�rio. Cada v�o possui no m�ximo 100 passageiros, e a classe permite controlar a
//ocupa��o das vagas. A classe deve ter os seguintes m�todos:
    private final Data date;
    private final int number;
    private boolean[] occupiedVacancies = new boolean[100];
//a. Construtor: configura os dados do v�o (recebidos como par�metro): n�mero do v�o, data (para
//armazenar a data utilize um objeto da classe Data, criada na quest�o anterior);
    public Flight(Data date, int number) {
        this.date = date;
        this.number = number;
    }
//b. ProximoLivre: retorna o n�mero da pr�xima cadeira livre
    OptionalInt nextFree() {
        return IntStream.range(0, occupiedVacancies.length)
            .filter(counter -> !occupiedVacancies[counter])
            .findFirst();
//        for(int counter = 0; counter < occupiedVacancies.length; counter++) {
//            if(!occupiedVacancies[counter]) return counter;
//        }
//        return null;
    }
//c. Verifica: verifica se o n�mero da cadeira recebido como par�metro est� ocupada
    Boolean verify(int vacancyIndex) {
        if(exists(vacancyIndex)) {
            return occupiedVacancies[vacancyIndex];
        }
        return null;
    }
//d. Ocupa: ocupa determinada cadeira do v�o, cujo n�mero � recebido como par�metro, e retorna
//verdadeiro se a cadeira ainda n�o estiver ocupada (opera��o foi bem sucedida) e falso caso
//contr�rio
    Boolean occupy(int vacancyIndex) {
        if(exists(vacancyIndex)) { 
            if(occupiedVacancies[vacancyIndex]) return false;
            return occupiedVacancies[vacancyIndex] = true;
        }
        return null;
    }
//e. Vagas: retorna o n�mero de cadeiras vagas dispon�veis (n�o ocupadas) no v�o
    long numberOfVacantSpaces() {
        return IntStream.range(0, occupiedVacancies.length)
                .filter(counter -> !occupiedVacancies[counter]).count();
    }
//f. GetVoo: retorna o n�mero do v�o
    int getFlight() {
        return number;
    }
    boolean exists(int vacancyIndex) {
        return vacancyIndex >= 0  && vacancyIndex < occupiedVacancies.length;
    }
    void occupyAll() {
        for(int counter = 0; counter < occupiedVacancies.length; counter++) {
            occupiedVacancies[counter] = true;
        }
    }
    String avaibleVacanciesAsString() {
        var result = "";
        result += formatedVacancyString(0);
        for(int counter = 1; counter < occupiedVacancies.length; counter++) {
            if(counter % 5 == 0) {
                result += "\n";
            } else {
                result += " ";
            }
            result += formatedVacancyString(counter);
        }
        return result;
    }
    private String formatedVacancyString(int number) {
        return String.format("%2d: %10s", number, (occupiedVacancies[number]? "ocupado" : "desocupado"));
    }
}
