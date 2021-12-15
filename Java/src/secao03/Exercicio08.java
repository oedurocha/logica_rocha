package secao06;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        // var
        int num;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe um número inteiro:");
        num = teclado.nextInt();

        // processing
        if (num % 2 == 0) {
            if (num > 0) {
                System.out.println("O número " + num + " é par e positivo.");
            } else {
                System.out.println("O número " + num + " é par e negativo.");
            }
        } else {
            if (num < 0) {
                System.out.println("O número " + num + " é ímpar e negativo.");
            } else {
                System.out.println("O número " + num + " é ímpar e positivo.");
            }
        }

        teclado.close();
    }
}
