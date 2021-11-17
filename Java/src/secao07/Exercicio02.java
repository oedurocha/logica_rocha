package secao07;

public class Exercicio02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println("Multiplo de 10: " + i);
            } else {
                System.out.println(i);
            }
        }
    }
}
