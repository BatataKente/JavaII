package exercicios.POO.do1Ao6;

public class Invoice {
//6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de inform�tica para
//representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informa��es
//como atributos:
//a. o n�mero do item faturado,
    private final int itemNumber;
//b. a descri��o do item,
    private String description;
//c. a quantidade comprada do item e
    private int quantity;
//d. o pre�o unit�rio do item.
    private double price;
//Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade n�o for positiva, ela
//deve ser configurada como 0. Se o pre�o por item n�o for positivo ele deve ser configurado como 0.0.
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
//Forne�a os m�todos getters e setters para cada vari�vel de inst�ncia. Al�m disso, forne�a um m�todo
    private void setDescription(String description) {
        this.description = description;
    }
    private String getItemNumber() {
        return "N�mero do item: " + itemNumber;
    }
    private String getDescription() {
        return "Descri��o: " + description;
    }
    private String getQuantity() {
        return "Quantidade: " + quantity;
    }
    private String getPrice() {
        return "Pre�o: " + price;
    }
//chamado getInvoiceAmount que calcula o valor da fatura (isso �, multiplica a quantidade pelo pre�o por
//item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as
//capacidades da classe Invoice.
    double getInvoiceAmount() {
        return quantity*price;
    }
    String getStatus() {
        return getItemNumber() + " ;" + getPrice() + " ;" + getDescription() + " ;" + getQuantity();
    }
}
