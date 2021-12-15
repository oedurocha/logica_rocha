/*
Elabore um algoritmo que leia as variáveis 'c' e 'n', respectivamente código
e número de horas trabalhadas de um operário. Calcule o salário sabendo-se que
ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o
excesso de pagamento armazenando-o na variável 'e'. Caso contrário zerar tal 
variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento 
imprimir o salário total e o salário excedente.
*/

#include <stdio.h>

int main()
{
    //variáveis
    int c;
    float n, e = 0, salario, valor_hora = 10.00;

    //entradas
    printf("------------\n");
    printf("Bem vindo!!!\n");
    printf("------------\n");
    printf("\n");
    printf("Informe seu código de operador: ");
    scanf("%d", &c);
    printf("Quantas horas você trabalhou? ");
    scanf("%f", &n);

    //processamento
    if (n > 50)
    {
        e = (n - 50) * 20.00;
        salario = (50 * valor_hora) + e;
        printf("Seu salário será de R$ %.2f\n", salario);
        printf("Salário excedente R$ %.2f", e);
    }else{
        salario = (n * valor_hora);
        printf("Seu salário será de R$ %.2f\n", salario);
        printf("Salário excedente R$ %.2f", e);
    }
}