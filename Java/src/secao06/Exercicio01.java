package secao06;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // var
        int n;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe um número:");
        n = teclado.nextInt();

        // processing
        if (n > 100) {
            // output
            System.out.println(n);
        } else {
            n = 0;
            System.out.println(n);
        }
        teclado.close();
    }
}
