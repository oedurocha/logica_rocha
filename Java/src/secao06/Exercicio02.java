package secao06;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // var
        int num, a, b;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe um número");
        num = teclado.nextInt();

        // processing
        if (num >= 0) {
            a = num;
            System.out.println("O numero " + a + " é positivo.");
        } else {
            b = num;
            System.out.println("O numero " + b + " é negativo.");
        }
        teclado.close();
    }
}
