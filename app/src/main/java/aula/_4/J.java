package aula._4;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        numero  = input.nextInt();
        if(numero >= 100 && numero <= 200) {
            System.out.print("O número está no intervalo.");
        } else {
            System.out.print("O número não está no intervalo.");
        }
    }
}
