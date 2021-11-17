package secao06;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // var
        float peso, multa = 0, excedente = 0;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe o peso ");
        peso = teclado.nextFloat();

        // processing
        if (peso > 50) {
            excedente = peso - 50;
            multa = excedente * 4;
        }

        // output
        System.out.printf("Peso: %.2f Kg\n", peso);
        System.out.printf("Excedente: %.2f Kg\n", excedente);
        System.out.printf("Valor da multa: R$ %.2f", multa);
        teclado.close();
    }
}
