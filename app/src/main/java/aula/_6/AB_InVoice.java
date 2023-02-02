package aula._6;

public class AB_InVoice {
    private int id, quantidade = 0;
    private String descri��o;
    private float pre�o = 0;
    AB_InVoice(int id, int quantidade, String descri��o, float pre�o) {
        this.id = id;
        setQuantidade(quantidade);
        setPre�o(pre�o);
        this.descri��o = descri��o;
    }
    double getInvoiceAmount() {
        return quantidade * pre�o;
    }
    private void setQuantidade(int quantidade) {
        if(quantidade > 0) this.quantidade = quantidade;
    }
    private void setPre�o(float pre�o) {
        if(pre�o > 0) this.pre�o = pre�o;
    }
}
