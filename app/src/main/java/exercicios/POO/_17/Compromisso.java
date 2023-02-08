package exercicios.POO._17;

import exercicios.POO.do1Ao6.Pessoa;
import exercicios.POO.do7Ao10.Data;
import java.util.ArrayList;
import java.util.List;

public class Compromisso {
//17. O agendamento de compromissos é uma das tarefas mais comuns para profissionais. Um sistema com essa
//finalidade deve ser capaz de gerenciar compromissos, atribuindo a cada um o seu tipo (reunião, pagamento,
//entrega de projeto); data; nome do participante ( pessoa, empresa etc) alguém com quem acontecerá é o
//compromisso) e seu telefone. Desenvolva um sistema que seja capaz de fazer operações básicas como
//agendar, remover e alterar compromissos e exibir compromissos por participante e por data.
    private String tipo;
    private Data data;
    private List<Pessoa> participantes;
    public Compromisso() {}
    public Compromisso(String tipo, Data data, ArrayList<Pessoa> participantes) {
        setTipo(tipo);
        setData(data);
        setParticipantes(participantes);
    }
    public String getTipo() {
        return tipo;
    }
    public Data getData() {
        return data;
    }
    public List<Pessoa> getParticipantes() {
        return participantes;
    }
    public void set(String tipo, Data data, ArrayList<Pessoa> participantes) {
        setTipo(tipo);
        setData(data);
        setParticipantes(participantes);
    }
    public final void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public final void setData(Data data) {
        this.data = data;
    }
    public final void setParticipantes(ArrayList<Pessoa> participantes) {
        this.participantes = participantes;
    }
    public void addParticipante(Pessoa participante) {
        this.participantes.add(participante);
    }
    public void removeParticipante(String nome) {
        this.participantes = this.participantes.stream()
                .filter(a -> !a.getName().equalsIgnoreCase(nome))
                .toList();
    }
    @Override public String toString() {
        var names = participantes.stream().map(a -> a.getName()).toList();
        return "Tipo: " + tipo + "; Data; " + data + "; Participantes: " + String.join(", ", names);
    }
}
