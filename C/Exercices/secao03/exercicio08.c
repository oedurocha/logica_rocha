/*
Faça um algorítmo que leia um número inteiro e mostre uma mensagem 
indicando se este número é par ou ímpar, e se é negativo ou positivo
*/

#include <stdio.h>

int main()
{
    //variáveis
    int numero;

    //entrada
    printf("Informe um número: ");
    scanf("%d", &numero);

    //processamento
    if (numero % 2 == 0)
    {
        if (numero > 0)
        {
            printf("O número %d é um número par e positivo.", numero);
        }
        else
        {
            printf("O número %d é um número par e negativo.", numero);
        }
    }
    else
    {
        if (numero > 0)
        {
            printf("O número %d é um número ímpar e positivo.", numero);
        }
        else
        {
            printf("O número %d é um número ímpar e negativo.", numero);
        }
    }
}