package aula._4;

import java.util.Date;

public class WXY {
    public static void main(String[] args) {
        var vendedor = new WXY_Vendedor("Josicleison", 1000, "123.123.123-12");
        vendedor.setBirthDate(new Date());
        vendedor.setComiss�o(10);
        vendedor.setVendas(10);
        System.out.println("O sal�rio do vendedor �: " + vendedor.getSalario());
        var motorista = new WXY_Motorista(/*"Marcidinelson", 1300, "321.321.321-32"*/);
    }
}
