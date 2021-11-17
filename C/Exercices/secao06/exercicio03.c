/*
ler um número e verificar se ele é par ou impar. quando for par armazenar
esse valor em 'p' e quando for ímpar armazená-o em 'i'.
Exibir 'p' e 'i' no final do processamento.
*/

#include <stdio.h>

int main()
{
    //Declarando variáveis
    int numero, p = 0, i = 0;

    //Entradas
    printf("Informe um número: ");
    scanf("%d", &numero);

    //Processamento
    if (numero % 2 == 0)
    {
        p = numero;
    }
    else
    {
        i = numero;
    }
    printf("%d par\n", p);
    printf("%d ímpar", i);
}