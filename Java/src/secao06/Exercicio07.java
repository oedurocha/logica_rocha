package secao06;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // var
        int n1, n2, n3, n4, q1, q2 , q3, q4;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe o primeiro número;");
        n1 = teclado.nextInt();
        System.out.println("Informe o segundo número;");
        n2 = teclado.nextInt();
        System.out.println("Informe o terceiro número;");
        n3 = teclado.nextInt();
        System.out.println("Informe o quarto número;");
        n4 = teclado.nextInt();

        // processing
        q1 = n1 * n1;
        q2 = n2 * n2;
        q3 = n3 * n3;
        q4 = n4 * n4;

        if (q3 >= 100) {
            System.out.println("===================");
            System.out.println(q3);
        } else {
            System.out.println("===================");
            System.out.println(q1);
            System.out.println(q2);
            System.out.println(q3);
            System.out.println(q4);
        }

        teclado.close();
    }
}
