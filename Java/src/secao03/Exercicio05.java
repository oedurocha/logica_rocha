package secao03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // var
        float centimetros, metros;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe o valor em metros:");
        metros = teclado.nextFloat();

        // processing
        centimetros = metros * 100;

        // output
        System.out.println(metros + " metros em centimetros é: " + centimetros + " cm");
        teclado.close();
    }
}
