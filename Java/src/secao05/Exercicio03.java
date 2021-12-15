package secao08;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        // var
        int[] vetor = new int[10];
        Scanner teclado = new Scanner(System.in);

        // processing
        for (int i = 0; i < 10; i++) {
            // input
            System.out.println("Informe um valor para o vetor: ");
            vetor[i] = teclado.nextInt();
        }
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i]);
        }
        teclado.close();
    }
}
