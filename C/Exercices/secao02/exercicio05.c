/*
Tendo como dado de entada a altura de uma pessoa,
construa um algorítmo que calcule seu peso ideal, 
usando a seguinte fórmula: (72.7 * altura) - 58
*/

#include <stdio.h>

int main()
{
    //Variáveis
    float altura, peso_ideal;

    //Entrada
    printf("Informe sua altura: ");
    scanf("%f", &altura);

    //Processamento
    peso_ideal = (72.7 * altura) - 58;

    //Saída
    printf("O peso ideal para o seu tamanho é: %.2f Kg", peso_ideal);
}