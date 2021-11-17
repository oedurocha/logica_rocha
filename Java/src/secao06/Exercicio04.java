package secao06;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // var
        float altura, peso_ideal;
        char sexo;
        Scanner teclado = new Scanner(System.in);

        // input
        System.out.println("Informe sua altura:");
        altura = teclado.nextFloat();
        
        System.out.println("Informe seu sexo m/f:");
        sexo = teclado.next().charAt(0);

        // processing
        if (sexo == 'm') {
            peso_ideal = (float)(72.7 * altura) - 58;
            System.out.println("Seu peso ideal é " + peso_ideal);
        }
        if (sexo == 'f') {
            peso_ideal = (float)(62.1 * altura) - 58;
            System.out.println("Seu peso ideal é " + peso_ideal);
        }
        if (sexo != 'm' && sexo != 'f'){
            System.out.println("Sexo não reconhecido.");
            peso_ideal = 0;
        }
        teclado.close();
    }
}
