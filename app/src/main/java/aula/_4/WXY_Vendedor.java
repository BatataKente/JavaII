package aula._4;

import java.util.Date;

public class WXY_Vendedor extends WXY_Funcionário {
    private int vendas;
    private float comissão;
    WXY_Vendedor(String nome, float salario, String cpf) {
        super(nome, salario, cpf);
    }
    @Override public float getSalario() {
        return super.getSalario() + (comissão*vendas);
    }
    public int getVendas() {
        return vendas;
    }
    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
    public float getComissão() {
        return comissão;
    }
    public void setComissão(float comissão) {
        this.comissão = comissão;
    }
}
