/*
Faça um algorítmo que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês.
*/

#include <stdio.h>

int main()
{
    //Variáveis
    float valor_hora, salario;
    int horas_trabalhadas;

    //Entradas
    printf("Quanto você ganha por hora? ");
    scanf("%f", &valor_hora);

    printf("Quantas horas você trabalhou este mês? ");
    scanf("%d", &horas_trabalhadas);

    //Processamentos
    salario = (horas_trabalhadas * valor_hora);

    //Saída
    printf("Neste mês, você vai receber R$ %.2f", salario);
}