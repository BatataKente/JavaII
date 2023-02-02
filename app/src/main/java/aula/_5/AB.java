package aula._5;

import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        try (java.util.Scanner input = new Scanner(System.in)) {
            int anoDeFabricação, totalDeCarros = 0, totalDeCarrosSeminovos = 0;
            float valorDoVeículo, porcentagemDoDesconto, valorFinal;
            boolean repeat = true;
            while(repeat) {
                System.out.print("Digite o ano de fabricação do veículo: ");
                anoDeFabricação = input.nextInt();
                System.out.print("Digite o valor do veículo: ");
                valorDoVeículo = input.nextFloat();
                if(anoDeFabricação <= 2000) {
                    porcentagemDoDesconto = 1 - 0.012f;
                    totalDeCarrosSeminovos++;
                } else {
                    porcentagemDoDesconto = 1 - 0.007f;
                }
                valorFinal = valorDoVeículo*porcentagemDoDesconto;
                totalDeCarros++;
                System.out.printf(
                        "O valor final do carro é %.2f.\nDeseja fazer mais alguma operação? S - sim / N - não: ",
                        valorFinal
                );
                var opção = input.next();
                if(opção.equalsIgnoreCase("n")) repeat = false;
            }
            System.out.println("Total de carros semi novos: " + totalDeCarrosSeminovos);
            System.out.print("Total de carros: " + totalDeCarros);
        }
    }
}
