#include <stdio.h>

int main()
{
    // var
    int vetor[10];
    char maior_50 = 0;

    // entradas
    for (int i = 0; i < 10; i++)
    {
        printf("Informe um valor para o vetor %d/10: ", (i + 1));
        scanf("%d", &vetor[i]);
    }
    printf("=======================================\n");
    for (int i = 0; i < 10; i++)
    {
        if (vetor[i] > 50)
        {
            printf("Valor %d maior que 50 na posição %d\n", vetor[i], i);
            maior_50 = 1;
        }
    }
    if (maior_50 < 1)
    {
        printf("Não existem valores maiores que 50.");
    }
}