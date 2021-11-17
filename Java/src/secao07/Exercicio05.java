package secao07;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // var
        String nome, senha;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe sua senha: ");
        senha = teclado.nextLine();
        
        // processing
        while (nome.equals(senha)) {
            System.out.println("ERRO: A senha e o nome de usuário são iguais.");
            System.out.println("======================================");
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Informe sua senha: ");
            nome = teclado.nextLine();
        }

        // output
        System.out.println("Cadastro realizado com sucesso.");
        teclado.close();
    }
}
