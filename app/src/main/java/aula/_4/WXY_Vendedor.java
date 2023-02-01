package aula._4;

import java.util.Date;

public class WXY_Vendedor extends WXY_Funcion�rio {
    private int vendas;
    private float comiss�o;
    WXY_Vendedor(String nome, float salario, String cpf) {
        super(nome, salario, cpf);
    }
    @Override public float getSalario() {
        return super.getSalario() + (comiss�o*vendas);
    }
    public int getVendas() {
        return vendas;
    }
    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
    public float getComiss�o() {
        return comiss�o;
    }
    public void setComiss�o(float comiss�o) {
        this.comiss�o = comiss�o;
    }
}
