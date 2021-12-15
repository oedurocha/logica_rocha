/*
Faça um algorítmo que determine o maior entre N números. A condição de 
parada é a entrada de um valor 0, ou seja, o algorítmo deve ficar calculando o 
maior até que a entrada seja igual a 0 (ZERO).
*/

#include <stdio.h>

int main()
{
    //variáveis
    int n, maior = 0;

    //entradas
    printf("Informe um número: ");
    scanf("%d", &n);

    //processamento
    while (n != 0)
    {
        if (n > maior)
        {
            maior = n;
        }
        //entrada
        printf("Informe um número: ");
        scanf("%d", &n);
    }
    printf("O maior número é: %d", maior);
}