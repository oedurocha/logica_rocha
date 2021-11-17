package secao03;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        // var
        int horas_trabalhadas;
        float valor_hora, salario;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Infome quanto você ganha por hora:");
        valor_hora = teclado.nextFloat();
        System.out.println("Infome quantas horas você trabalhou no mês:");
        horas_trabalhadas = teclado.nextInt();

        // processing
        salario = valor_hora * horas_trabalhadas;

        // output
        System.out.println("Você receberá R$ " + salario + " no mês.");
        teclado.close();
    }
}
