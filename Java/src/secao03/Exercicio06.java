package secao06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        // var
        float horas_trabalhadas, extra=0, salario, valor_hora = 10;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe a quantidade de horas trabalhadas:");
        horas_trabalhadas = teclado.nextFloat();

        // processing
        if (horas_trabalhadas > 50) {
            extra = (horas_trabalhadas - 50) * 20;
            salario = (50 * valor_hora) + extra;
            System.out.printf("Salário total: R$%.2f\n", salario);
            System.out.printf("Salário excedente: R$%.2f\n", extra);
        } else{
            salario = horas_trabalhadas * valor_hora;
            System.out.printf("Salário total: R$%.2f\n", salario);
        }

        teclado.close();
    }
}
