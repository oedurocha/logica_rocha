package secao06;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        // var
        int numero, par = 0, impar = 0;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe um número:");
        numero = teclado.nextInt();
        
        // processing
        if (numero % 2 == 0) {
            par = numero;
        } else {
            impar = numero;
        }
        System.out.println("===================");
        System.out.println(par);
        System.out.println(impar);
        teclado.close();
    }
}
