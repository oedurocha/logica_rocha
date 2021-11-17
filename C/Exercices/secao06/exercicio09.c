/*
A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3
grupos de indústrias que são altamente poluentes do meio ambiente. O índice de
poluição aceitável varia de 0,05 até 0,25. Se o indice sobe para 0,3 as indústrias
do 10 grupo são intimadas a suspenderem suas atividades, se o indice crescer para 0,4
as industrias do 1o e 2o grupo são intimadas a suspenderem suas atividades, se o índice
atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
Faça um algoritmo que leia o índice de poluição medido e emita a notificação adequada aos diferentes
grupos de empresas.
*/

#include <stdio.h>

int main()
{
    //variáveis
    float indice;

    //entrada
    printf("Informe o índice de poluição: ");
    scanf("%f", &indice);

    //processamento
    if (indice >= 0.3 && indice < 0.4)
    {
        //Saída
        printf("Atenção indústrias do 1o grupo: Devem suspender as atividades imediatamente.");
    }
    else if (indice >= 0.4 && indice < 0.5)
    {
        //Saída
        printf("Atenção indústrias do 2o grupo: Devem suspender as atividades imediatamente.");
    }
    else if (indice >= 0.5)
    {
        //Saída
        printf("Atenção todos os grupos: Devem suspender as atividades imediatamente.");
    }
    else
    {
        //Saída
        printf("O indice está aceitável");
    }
}