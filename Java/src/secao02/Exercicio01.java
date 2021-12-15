package secao03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // var
        int quantidade_minima, quantidade_maxima;
        float estoque_medio;
        Scanner teclado = new Scanner(System.in); 

        // entradas
        System.out.println("Informe a quantidade mínima em estoque: ");
        quantidade_minima = teclado.nextInt();
        System.out.println("Informe a quantidade máxima em estoque: ");
        quantidade_maxima = teclado.nextInt();

        // processamento
        estoque_medio = (quantidade_minima + quantidade_maxima)/2;

        // saída
        System.out.println("O estoque médio é " + estoque_medio);
        teclado.close();
    }
}
