package aula._6;

import java.awt.PageAttributes;

public class AB {
    public static void main(String[] args) {
        var invoice = new AB_InVoice(1, 20, "Chifre", 50);
        System.out.printf("Valor total: %.2f R$", invoice.getInvoiceAmount());
    }
}
