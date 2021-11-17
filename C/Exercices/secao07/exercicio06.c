#include <stdio.h>

int main()
{
    // Var
    int number, result;

    //Entrada
    printf("Digite um número de 1 a 10: ");
    scanf("%d", &number);

    //Processamento
    while (number > 10)
    {
        printf("O número deve ser menor que 10.\n");
        printf("================================\n");
        printf("Informe um número novamente: ");
        scanf("%d", &number);
    }

    printf("Tabuada do %d:\n", number);
    printf("===============\n");
    for (int i = 0; i <= 10; i++)
    {
        result = number * i;
        printf("%d x %d = %d\n", number, i, result);
    }
}