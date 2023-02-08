package exercicios.POO.do11Ao15;

import exercicios.POO.do1Ao6.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
//12. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes
//operações:
    private List<Pessoa> pessoas = new ArrayList<>();
//a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
    public void setPessoas(ArrayList<Pessoa> pessoas) {
        if(pessoas.size() <= 10) this.pessoas = pessoas;
    }
    public void addPessoas(Pessoa pessoa) {
        if(this.pessoas.size() <= 10) this.pessoas.add(pessoa);
    }
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    public Pessoa getPessoa(int index) {
        if(index >= 0 && index < this.pessoas.size()) return pessoas.get(index);
        return null;
    }
//b. void removerPessoa(String nome); //remove a pessoa do array
    void removePessa(String name) {
        pessoas = pessoas.stream()
                .filter(a -> !a.getName().equalsIgnoreCase(name))
                .toList();
    }
//c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
    Integer buscarPessoaIndex(String nome) {
        for(int counter = 0; counter < pessoas.size(); counter++) {
            if(pessoas.get(counter).getName().equalsIgnoreCase(nome)) return 1;
        }
        return null;
    }
    Pessoa buscarPessoa(String nome) {
        for(int counter = 0; counter < pessoas.size(); counter++) {
            if(pessoas.get(counter).getName().equalsIgnoreCase(nome)) {
                return pessoas.get(counter);
            }
        }
        return null;
    }
//d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
    void imprimirAgenda() {
        pessoas.stream().forEach(a -> System.out.println(a.getStatus()));
    }
//e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
    void imprimirPessoa(int index) {
        var pessoa = getPessoa(index);
        if(pessoa != null) System.out.print(pessoa.getStatus());
    }
}
