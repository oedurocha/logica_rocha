package secao07;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // var
        int valor, maior=0;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe um número:");
        valor = teclado.nextInt();
        
        // processing
        while (valor != 0) {
            if (valor > maior) {
                maior = valor;
            }
            System.out.println("Informe um valor:");
            valor = teclado.nextInt();
        }
        System.out.println("O maior valor é " + maior);
        teclado.close();
    }
}
