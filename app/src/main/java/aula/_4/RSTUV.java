package aula._4;

import java.util.Scanner;

public class RSTUV {
    public static void main(String[] args) {
        try (var input = new Scanner(System.in);) {
            var pessoa = new RSTUV_Pessoa();        
    //        float peso, altura, imc;
            System.out.print("Digite o peso da pessoa: ");
            pessoa.setPeso(input.nextDouble());
    //        peso = input.nextFloat();
            System.out.print("\nDigite a altura da pessoa: ");
            pessoa.setAltura(input.nextDouble());
    //        altura = input.nextFloat();
    //        imc =  peso/(altura*altura);
            System.out.printf("\nO imc da pessoa é %.2f", pessoa.imc.get());
    //        System.out.printf("\nO imc da pessoa é %.2f", imc);
            input.close();
        }
    }
}
