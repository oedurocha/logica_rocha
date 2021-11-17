package secao07;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        // var
        int num, multiplicacao;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe um número de 1 a 10: ");
        num = teclado.nextInt();

        // processing
        while (num > 10) {
            System.out.println("O número informeado não pode ser maior que 10.");
            System.out.println("Informe um número de 1 a 10: ");
            num = teclado.nextInt();
        }
        System.out.println("===================");
        System.out.println("Tabuada do " + num);
        for (int i = 0; i <= 10; i++) {
            multiplicacao = num * i;
            System.out.println(num + " x " + i + " = " + multiplicacao);
        }
        teclado.close();
    }
}
