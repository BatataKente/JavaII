package aula._4;

import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        boolean continuar = true;
        while(continuar) {
            System.out.print("Digite um numero: ");
            int numero = input.nextInt();
            if(numero == 0) {
                System.out.println("O n�mero � zero.");
            } else  if(numero > 0) {
                System.out.println("O n�mero � maior que zero.");
            } else {
                System.out.println("O n�mero � menor que zero.");
            }
            System.out.print("Deseja continuar?(s ou n) ");
            var desejo = input.next();
            if(desejo.equalsIgnoreCase("n")) continuar = false;
        }
    }
}
