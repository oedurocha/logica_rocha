/*
Seção 3 - Exercício 2

Faça um algoritmo para "calcular o estoque médio de ua peça", sendo que:

estoque_medio = (quantidade_minima + quantidade_maxima) / 2

"calcular estoque médio"

receber quantidade_minima
receber quantidade_maxima
somar quantidade_minima e quantidade_maxima
dividir o resultado da soma por 2 
mostrar o resultado da divisao
*/

#include <stdio.h>

int main()
{

    //DECLARAÇÃO DE VARIÁVEIS
    int quantidade_minima, quantidade_maxima;
    float estoque_medio;

    //ENTRADAS
    printf("Informe quantidade minima em estoque: ");
    scanf("%d", &quantidade_minima);

    printf("Informe quantidade maxima em estoque: ");
    scanf("%d", &quantidade_maxima);

    //PROCESSAMENTO
    estoque_medio = (quantidade_minima + quantidade_maxima) / 2;

    //SAÍDA
    printf("O estoque médio é %f ", estoque_medio);
}