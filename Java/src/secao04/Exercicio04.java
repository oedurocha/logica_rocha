package secao07;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // var
        int valor, maior = -999, menor = 999, soma = 0;
        float media;
        Scanner teclado = new Scanner(System.in);

        // input
        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe um valor (%d/10): \n", i + 1);
            valor = teclado.nextInt();
            if (valor > 0) {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
                soma = soma + valor;
            } else {
                System.out.println("Informação inválida.");
                i--;
            }
        }
        media = soma / 10;
        System.out.println("=========================================");
        System.out.println("O maior valor registrado foi: " + maior);
        System.out.println("O menor valor registrado foi: " + menor);
        System.out.println("A média dos valores registrados foi: " + media);
        teclado.close();
    }
}
