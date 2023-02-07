package exercicios.POO.do1Ao6;

public class Invoice {
//6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para
//representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações
//como atributos:
//a. o número do item faturado,
    private final int itemNumber;
//b. a descrição do item,
    private String description;
//c. a quantidade comprada do item e
    private int quantity;
//d. o preço unitário do item.
    private double price;
//Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela
//deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0.
    public Invoice(int itemNumber, String description, int quantity, double price) {
        this.itemNumber = itemNumber;
        setDescription(description);
        setQuantity(quantity);
        setPrice(price);
    }
    private void setQuantity(int quantity) {
        if(quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }
    private void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }
//Forneça os métodos getters e setters para cada variável de instância. Além disso, forneça um método
    private void setDescription(String description) {
        this.description = description;
    }
    private String getItemNumber() {
        return "Número do item: " + itemNumber;
    }
    private String getDescription() {
        return "Descrição: " + description;
    }
    private String getQuantity() {
        return "Quantidade: " + quantity;
    }
    private String getPrice() {
        return "Preço: " + price;
    }
//chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por
//item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as
//capacidades da classe Invoice.
    double getInvoiceAmount() {
        return quantity*price;
    }
    String getStatus() {
        return getItemNumber() + " ;" + getPrice() + " ;" + getDescription() + " ;" + getQuantity();
    }
}
