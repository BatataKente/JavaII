package aula._4;

import java.util.Scanner;

public class OP {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        String nomeDoProduto;
        float custo, preco;
        float custoTotal = 0, precoTotal = 0;
        int counter = 0;
        for(; counter < 5; counter++) {
            System.out.print("Digite o nome do produto: ");
            nomeDoProduto = input.next();
            System.out.print("Digite o preço de custo do produto: ");
            custo = input.nextFloat();
            System.out.print("Digite o preço de venda do produto: ");
            preco = input.nextFloat();
            custoTotal += custo;
            precoTotal += preco;
            if(preco == custo) {
                System.out.print("O custo foi igual a venda.");
            } else if(custo > preco) {
                System.out.print("Houve prejuizo.");
            } else {
                System.out.print("Houve lucro.");
            }
        }
        System.out.print(
                "\n\nA media do custo é " + custoTotal/counter + "\n" + 
                "E a média do preço é " + precoTotal/counter + "\n\n"
        );
        input.close();
    }
}
