#include <stdio.h>

int main()
{
    // var
    int vetor1[10], vetor2[10], soma[10];

    for (int i = 0; i < 10; i++)
    {
        printf("Digite um valor para o primeiro vetor: ");
        scanf("%d", &vetor1[i]);
        printf("Digite um valor para o segundo vetor: ");
        scanf("%d", &vetor2[i]);

        soma[i] = (vetor1[i] + vetor2[i]);
    }
    for (int i = 0; i < 10; i++)
    {
        printf("Soma %d: ", i);
        printf("%d\n", soma[i]);
    }
}
