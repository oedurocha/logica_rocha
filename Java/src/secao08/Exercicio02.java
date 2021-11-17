package secao08;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // var
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] soma = new int[10];
        Scanner teclado = new Scanner(System.in);

        // input
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor para o primeiro vetor: ");
            vetor1[i] = teclado.nextInt();
            System.out.println("Informe um valor para o segundo vetor: ");
            vetor2[i] = teclado.nextInt();

            soma[i] = vetor1[i] + vetor2[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Soma " + (i+1));
            System.out.println(soma[i]);
        }
        teclado.close();
    }
}
