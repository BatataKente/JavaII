package aula._5;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int anoDeFabrica��o = 0;
        float valorDoVe�culo = 0, porcentagemDoDesconto = 0, valorFinal = 0;
        boolean repeat = true;
        while(repeat) {
            System.out.print("Digite o ano de fabrica��o do ve�culo: ");
            anoDeFabrica��o = input.nextInt();
            System.out.print("Digite o valor do ve�culo: ");
            valorDoVe�culo = input.nextFloat();
            if(anoDeFabrica��o <= 2000) {
                porcentagemDoDesconto = 0.012f;
            } else {
                porcentagemDoDesconto = 0.007f;
            }
            valorFinal = valorDoVe�culo*porcentagemDoDesconto;
            System.out.print("Deseja fazer mais cadastros? S - sim / N - n�o: ");
        }
        input.close();
    }
}
