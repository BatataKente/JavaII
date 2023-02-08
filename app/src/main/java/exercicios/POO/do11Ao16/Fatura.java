package exercicios.POO.do11Ao16;

public class Fatura {
//14. Crie uma classe em Java chamada Fatura para uma loja de suprimentos de informática. A classe deve
//conter quatro atributos:
//a. número (String);
    private String number;
//b. descrição (String);
    private String description;
//c. quantidade comprada de um item (int);
    private int quantity;
//d. preço por item (double).
    private double price;
//A classe deve ter um construtor e os métodos getters e setters. 
    public Fatura(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        setQuantity(quantity);
        setPrice(price);
    }
    public String getNumber() {
        return number;
    }
    public String getDescription() {
        return description;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public final void setQuantity(int quantity) {
        if(quantity > 0) this.quantity = quantity;
    }
    public final void setPrice(double price) {
        if(price > 0) this.price = price;
    }
//Além disso, forneça um método chamado getTotalFatura que calcula o valor da fatura e depois retorna o 
//valor como um double. Se o valor não for positivo, ele deve ser alterado para 0. Se o preço por item não for
//positivo, ele deve ser alterado para 0.
    double getTotalFatura() {
        return quantity*price;
    }
}
