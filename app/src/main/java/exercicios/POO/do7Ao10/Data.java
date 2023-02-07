package exercicios.POO.do7Ao10;

import exercicios.JAVA.do29Ao35.Do29Ao35;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data extends Date {
//8. Escreva uma classe Data cuja inst�ncia (objeto) represente uma data. Esta classe dever� dispor dos
//seguintes m�todos:
//a. Construtor: define a data que determinado objeto (atrav�s de par�metro), este m�todo verifica se a
//data est� correta, caso n�o esteja a data � configurada como 01/01/0001
    public Data(long date) {
        super(date);
    }
    public Data(int day, int month, int year, int hour, int minute) {
        super();
        setTime(day, month, year, hour, minute);
    }
    public Data(int day, int month, int year) {
        super();
        setTime(day, month, year);
    }
    private void setTime(int day, int month, int year) {
        try {var date = new SimpleDateFormat("dd-MM-yyyy")
                        .parse(String.format("%2d-%2d-%4d", day, month, year));
                this.setTime(date.getTime());
        } catch(ParseException error) {
            setTime();
            System.out.print("ERROR: " + error);
        }
    }
    private void setTime(int day, int month, int year, int hour, int minute) {
        try {var format = new SimpleDateFormat("dd-MM-yyyy HH:mm");
                var date = format.parse(
                        String.format(
                                "%2d-%2d-%4d %2d:%2d", 
                                day, month, year, hour, minute
                        )
                );
                this.setTime(date.getTime());
        } catch(ParseException error) {
            setTime();
            System.out.print("ERROR: " + error);
        }
    }
    private void setTime() {
        try {var date = new SimpleDateFormat("dd-MM-yyyy")
                        .parse(String.format("%2d-%2d-%4d", 1, 1, 1));
                this.setTime(date.getTime());
        } catch(ParseException error) {
            System.out.print("ERROR: " + error);
        }
    }
//b. Compara: recebe como par�metro um outro objeto da Classe data, compare com a data corrente e
//retorne:
    int compareWith(Data data) {
//i. 0 se as datas forem iguais;
        if(getTime() == data.getTime()) {
            return 0;
//ii. 1 se a data corrente for maior que a do par�metro;
        } else if(getTime() > data.getTime()) {
            return 1;
//iii. -1 se a data do par�metro for maior que a corrente.
        } else {
            return -1;
        }
    }
    int compareWith(int day, int month, int year) {
        return compareWith(new Data(day, month, year));
    }
//c. GetDia: retorna o dia da data
    private final Calendar getCalendar() {
        final var calendar = Calendar.getInstance();
        calendar.setTime(this);
        return calendar;
    }
    int getDia() {
        return getCalendar().get(Calendar.DAY_OF_MONTH);
    }
//d. GetMes: retorna o m�s da data
    int getM�s() {
        return getCalendar().get(Calendar.MONTH);
    }
//e. GetMesExtenso: retorna o m�s da data corrente por extenso
    String getM�sPorExtenso() {
        return Do29Ao35.writeMonth(getCalendar().get(Calendar.MONTH));
    }
//f. GetAno: retorna o ano da data
    int getAno() {
        return getCalendar().get(Calendar.YEAR);
    }
//g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contr�rio
    boolean isBissexto() {
        return getAno() % 400 == 0 || getAno() % 4 == 0;
    }
//h. Clone: o objeto clona a si pr�prio, para isto, ele cria um novo objeto da classe Data com os
//mesmos valores de atributos e retorna sua refer�ncia pelo m�todo
    Data getClone() {
        return new Data(getDia(), getM�s(), getAno());
    }
}
