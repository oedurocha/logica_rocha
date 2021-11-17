/*
Faça um algorítmo que converta metros para centímetros
*/

#include <stdio.h>

int main()
{

    //Variáveis
    int metros, centimetros;

    //Entradas
    printf("Informe o valor em metros: ");
    scanf("%d", &metros);

    //Processamento
    centimetros = metros * 100;

    //Saída
    printf("%d metros em centímetros são %d centímetros", metros, centimetros);
}