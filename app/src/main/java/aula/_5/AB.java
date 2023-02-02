package aula._5;

import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        try (java.util.Scanner input = new Scanner(System.in)) {
            int anoDeFabrica��o, totalDeCarros = 0, totalDeCarrosSeminovos = 0;
            float valorDoVe�culo, porcentagemDoDesconto, valorFinal;
            boolean repeat = true;
            while(repeat) {
                System.out.print("Digite o ano de fabrica��o do ve�culo: ");
                anoDeFabrica��o = input.nextInt();
                System.out.print("Digite o valor do ve�culo: ");
                valorDoVe�culo = input.nextFloat();
                if(anoDeFabrica��o <= 2000) {
                    porcentagemDoDesconto = 1 - 0.012f;
                    totalDeCarrosSeminovos++;
                } else {
                    porcentagemDoDesconto = 1 - 0.007f;
                }
                valorFinal = valorDoVe�culo*porcentagemDoDesconto;
                totalDeCarros++;
                System.out.printf(
                        "O valor final do carro � %.2f.\nDeseja fazer mais alguma opera��o? S - sim / N - n�o: ",
                        valorFinal
                );
                var op��o = input.next();
                if(op��o.equalsIgnoreCase("n")) repeat = false;
            }
            System.out.println("Total de carros semi novos: " + totalDeCarrosSeminovos);
            System.out.print("Total de carros: " + totalDeCarros);
        }
    }
}
