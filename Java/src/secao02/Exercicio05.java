package secao03;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // var
        float altura, peso_ideal;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe sua altura em centímetros:");
        altura = teclado.nextFloat();

        // processing
        peso_ideal = (float)(altura * 72.7) - 58;

        // output
        System.out.printf("O peso ideal para sua altura é %.2f Kg", peso_ideal);
        teclado.close();
    }
}
