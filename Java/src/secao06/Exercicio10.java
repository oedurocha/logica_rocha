package secao06;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // var
        int idade;
        Scanner teclado = new Scanner(System.in);

        //  input
        System.out.println("Informe sua idade:");
        idade = teclado.nextInt();

        // processing
        if (idade >= 5 && idade <=7){
            System.out.println("Você pertence ao grupo Infantil A.");
        } else if (idade >= 8 && idade <=11){
            System.out.println("Você pertence ao grupo Infantil B.");
        } else if (idade >= 12 && idade <=13){
            System.out.println("Você pertence ao grupo Juvenil A.");
        } else if (idade >= 14 && idade <=17){
            System.out.println("Você pertence ao grupo Juvenil B.");
        } else if (idade >= 18){
            System.out.println("Você pertence ao grupo Adulto.");
        } else {
            System.out.println("Você ainda não pertence a nenhum grupo.");
        }
        teclado.close();
    }
}