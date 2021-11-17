/*
Desenvolva um algoritmo que:
a) Leia 4 (quatro) números;
b) Calcule o quadrado de cada um;
c) se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
d) Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

#include <stdio.h>

int main()
{
    //variáveis
    int num1, num2, num3, num4, q1, q2, q3, q4;

    //entradas
    printf("Informe o número 1: ");
    scanf("%d", &num1);
    printf("Informe o número 2: ");
    scanf("%d", &num2);
    printf("Informe o número 3: ");
    scanf("%d", &num3);
    printf("Informe o número 4: ");
    scanf("%d", &num4);

    //processamento
    q1 = num1 * num1;
    q2 = num2 * num2;
    q3 = num3 * num3;
    q4 = num4 * num4;

    if (q3 >= 1000)
    {
        printf("%d", q3);
    }
    else
    {
        printf("Número 1: %d. Quadrado: %d\n", num1, q1);
        printf("Número 2: %d. Quadrado: %d\n", num2, q2);
        printf("Número 3: %d. Quadrado: %d\n", num3, q3);
        printf("Número 5: %d. Quadrado: %d", num4, q4);
    }
    
}
