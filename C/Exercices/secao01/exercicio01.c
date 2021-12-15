/*
Seção 2 - Exercício 2

Faça um algorítmo para somar dois números
e multiplicar o resultado pelo primeiro número.

"Somar e multiplicar"

receber o primeiro número
receber o segundo número
somar o primeiro com o segundo número
multiplicar a soma dos números pelo primeiro número
mostrar o resltado da multiplicação
*/

#include <stdio.h>

int main(){
    //DECLARAÇÃO DE VARIÁVEIS
    int num1, num2, soma, multiplicacao;

    //ENTRADAS
    printf("Informe o primeiro numero: ");
    scanf("%d", &num1);

    printf("Informe o segundo numero:  ");
    scanf("%d", &num2);

    //PROCESSAMENTOS
    soma = num1 + num2;

    multiplicacao = soma * num1;

    //SAÍDA
    printf("O resultado da multiplicao é %d", multiplicacao);
}
