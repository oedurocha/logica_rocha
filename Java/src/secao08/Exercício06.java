package secao08;

import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {
        // var
        int codigo;
        int[] vetor = new int[5];
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Digite o código: ");
        codigo = teclado.nextInt();

        // processing
        if (codigo > 0) {
            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Informe um valor (%d/5): ", (i + 1));
                vetor[i] = teclado.nextInt();
            }
            if (codigo == 1) {
                System.out.println("Os valores serão mostrados de forma crescente na ordem de criação.\n");
                for (int i = 0; i < vetor.length; i++) {
                    System.out.printf("Valor %d: %d\n", (i + 1), vetor[i]);
                }
            }
            if (codigo == 2) {
                System.out.println("Os valores serão mostrados de forma decrescente na ordem de criação.\n");
                for (int i = 4; i >= 0; i--) {
                    System.out.printf("Valor %d: %d\n", (i + 1), vetor[i]);
                }
            }
        } else {
            System.out.println("Fim do programa.");
        }
        teclado.close();
    }
}
