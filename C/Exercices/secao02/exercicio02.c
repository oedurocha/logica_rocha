/*
Faça um algorítmo que peça dois números e imprima a soma.
*/

#include <stdio.h>

int main()
{
    //DECLARANDO VARIÁVEIS
    int num1, num2, soma;

    //Entradas
    printf("Informe o primeiro número: ");
    scanf("%d", &num1);
    printf("Informe o segundo número: ");
    scanf("%d", &num2);

    //PROCESSAMENTO
    soma = (num1 + num2);

    //Saída
    printf("A soma é %d", soma);
}