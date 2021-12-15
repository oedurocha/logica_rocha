package secao07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // var
        int identificacao, defeito, contador_total = 0, contador_sit_1 = 0, contador_sit_2 = 0, contador_sit_3 = 0,
                contador_sit_4 = 0;
        float p1, p2, p3, p4;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe o código de identificação: ");
        identificacao = teclado.nextInt();

        // processing
        while (identificacao != 0) {
            System.out.println("");
            System.out.println("Informe o defeito:");
            System.out.println("========================================");
            System.out.println("1 - Necessita de esfera");
            System.out.println("2 - Necessita de limpeza");
            System.out.println("3 - Necessita troca de cabo ou conector");
            System.out.println("4 - Quebrado ou inutilizado");
            defeito = teclado.nextInt();

            if (defeito == 1) {
                contador_sit_1 = contador_sit_1 + 1;
            }
            if (defeito == 2) {
                contador_sit_2 = contador_sit_2 + 1;
            }
            if (defeito == 3) {
                contador_sit_3 = contador_sit_3 + 1;
            }
            if (defeito == 4) {
                contador_sit_4 = contador_sit_4 + 1;
            }

            System.out.println("Informe o código de identificação: ");
            identificacao = teclado.nextInt();
        }

        contador_total = (contador_sit_1 + contador_sit_2 + contador_sit_3 + contador_sit_4);
        p1 = ((float) contador_sit_1 / (float) contador_total) * (float) 100.00;
        p2 = ((float) contador_sit_2 / (float) contador_total) * (float) 100.00;
        p3 = ((float) contador_sit_3 / (float) contador_total) * (float) 100.00;
        p4 = ((float) contador_sit_4 / (float) contador_total) * (float) 100.00;

        // output
        System.out.printf("Quantidade de mouses: %d\n", contador_total);
        System.out.printf("Situação\t\t\t\t\t\t Total\t\t Porcentagem\n");
        System.out.printf("1 - Necessita de esfera\t\t\t\t\t %d\t\t %.2f\n", contador_sit_1, p1);
        System.out.printf("2 - Necessita de limpeza\t\t\t\t %d\t\t %.2f\n", contador_sit_2, p2);
        System.out.printf("3 - Necessita troca de cabo ou conector\t\t\t %d\t\t %.2f\n", contador_sit_3, p3);
        System.out.printf("4 - Quebrado ou inutilizado\t\t\t\t %d\t\t %.2f\n", contador_sit_4, p4);

        teclado.close();
    }
}
