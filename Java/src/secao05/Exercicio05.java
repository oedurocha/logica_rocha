package secao08;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // var
        int[] vetor = new int[10];
        boolean tem_maior_50 = false;
        Scanner teclado = new Scanner(System.in);

        // input/processing
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe um número para o vetor (%d/10): ", (i + 1));
            vetor[i] = teclado.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 50) {
                System.out.printf("O número %d (maior que 50) está na posição %d.\n", vetor[i], i);
                tem_maior_50 = true;
            }
        }
        if (!tem_maior_50) {
            System.out.println("Não existe nenhum número maior que 50.");
        }
        teclado.close();
    }
}
