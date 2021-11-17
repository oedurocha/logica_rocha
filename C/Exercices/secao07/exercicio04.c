/*
Contrua um algoritmo que leia 10 cvalores inteiros positivos e:
a) Encontre o maior valor
b) Encontre o menor valor
c) Calcule a média dos números lidos
*/

#include <stdio.h>

int main()
{
    //variáveis
    int valor, maior = -999, menor = 99, soma = 0;
    float media;

    //entradas
    for (int i = 0; i < 10; i++)
    {
        printf("Informe um valor: ");
        scanf("%d", &valor);
        //processamento
        if (valor > 0)
        {
            if (valor > maior);
            {
                maior = valor;
            }
            if (valor < menor)
            {
                menor = valor;
            }
            soma = soma + valor;
        }
        else
        {
            i--;
        }
    }
    media=soma/10;
    printf("O maior número é %d\n", maior);
    printf("O menor número é %d\n", menor);
    printf("A média dos números é %.2f\n", media);
}