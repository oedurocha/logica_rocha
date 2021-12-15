/*
Tendo como dados de entrada a altura e o sexo de uma pessoa, construa
um algorítmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7 * altura) - 58
Para mulheres: (62.1 * altura) - 44.7
*/

#include <stdio.h>
#include <ctype.h>

int main()
{

    //Variáveis
    float altura, peso_ideal;
    char sexo;

    //Entradas
    printf("Informe sua altura: ");
    scanf("%f", &altura);

    gets(stdin); //Corrigir Bug

    printf("Informe o seu sexo (m/f): ");
    scanf("%c", &sexo);

    //Processamento
    if (tolower (sexo) == 'm')
    {
        peso_ideal = (72.7 * altura) - 58;
        printf("O peso ideal para sua altura é: %.2f kg.", peso_ideal);
    }
    if (tolower (sexo) == 'f')
    {
        peso_ideal = (62.1 * altura) - 44.7;
        printf("O peso ideal para sua altura é: %.2f kg.", peso_ideal);
    }
    if (tolower (sexo) != 'm' && tolower (sexo) != 'f')
    {
        printf("Sexo não reconhecido. \n");
    }
}