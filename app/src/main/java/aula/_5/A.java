package aula._5;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int anoDeFabricação = 0;
        float valorDoVeículo = 0, porcentagemDoDesconto = 0, valorFinal = 0;
        boolean repeat = true;
        while(repeat) {
            System.out.print("Digite o ano de fabricação do veículo: ");
            anoDeFabricação = input.nextInt();
            System.out.print("Digite o valor do veículo: ");
            valorDoVeículo = input.nextFloat();
            if(anoDeFabricação <= 2000) {
                porcentagemDoDesconto = 0.012f;
            } else {
                porcentagemDoDesconto = 0.007f;
            }
            valorFinal = valorDoVeículo*porcentagemDoDesconto;
            System.out.print("Deseja fazer mais cadastros? S - sim / N - não: ");
        }
        input.close();
    }
}
