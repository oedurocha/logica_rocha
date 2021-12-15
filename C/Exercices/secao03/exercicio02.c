/*

Elabore um algorítmo que leia um número. Se positivo armazene-o
em 'a', se for negativo em 'b'. NO final mostrar o resultado.

*/

#include <stdio.h>

int main()
{
    //Variáveis
    int num, a, b;

    //Entrada
    printf("Informe um número: ");
    scanf("%d", &num);

    //Processamento
    if (num > 0)
    {
        a = num;
        printf("O número %d é positivo.", num);
    }
    else
    {
        b = num;
        printf("O número %d é negativo.", num);
    }
}