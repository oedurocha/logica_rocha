package secao08;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // var
        int soma = 0;
        int[] vetor = new int[20];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            // input
            System.out.printf("Digite um valor (%d/20): ", (i + 1));
            vetor[i] = teclado.nextInt();

            soma = soma + vetor[i];
        }
        System.out.println("A soma de todos os elementos é: " + soma);
        teclado.close();
    }
}
