package secao06;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        // 0.5 - 0.25
        // 0.3 - 1° Grupo
        // 0.3, 0.4 - 1° e 2° Grupo
        // 0.5 - Todos os grupos

        // var
        float indice;
        Scanner input = new Scanner(System.in);

        // input
        System.out.println("Informe o índice de poluição:");
        indice = input.nextFloat();

        // processing
        if (indice >= 0.3 && indice < 0.4) {
            System.out.println("Atenção 1° GRUPO: Encerrar atividades imediatamente.");
        } else if (indice >=0.4 && indice <0.5) {
            System.out.println("Atenção 1° e 2° GRUPO: Encerrar atividades imediatamente.");
        } else if (indice >=0.5) {
            System.out.println("Atenção TODOS OS GRUPOS: Encerrar atividades imediatamente.");
        } else {
            System.out.println("Situação estabilizada.");
        }
        input.close();
    }
}
