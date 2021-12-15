package secao03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // var
        int num1, num2, soma;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe o primeiro número:");
        num1 = teclado.nextInt();

        System.out.println("Informe o segundo número:");
        num2 = teclado.nextInt();

        // processing
        soma = num1 + num2;

        // output
        System.out.println("O resultado da soma é " + soma);
        teclado.close();
    }
}
