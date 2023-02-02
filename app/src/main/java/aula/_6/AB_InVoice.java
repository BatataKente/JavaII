package aula._6;

public class AB_InVoice {
    private int id, quantidade = 0;
    private String descrição;
    private float preço = 0;
    AB_InVoice(int id, int quantidade, String descrição, float preço) {
        this.id = id;
        setQuantidade(quantidade);
        setPreço(preço);
        this.descrição = descrição;
    }
    double getInvoiceAmount() {
        return quantidade * preço;
    }
    private void setQuantidade(int quantidade) {
        if(quantidade > 0) this.quantidade = quantidade;
    }
    private void setPreço(float preço) {
        if(preço > 0) this.preço = preço;
    }
}
