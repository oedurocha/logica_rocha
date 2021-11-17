/*
João, pescador comprou um microcomputador para controlar 
o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes
maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
(50 quilos) deve pagar uma multa de R$ 4.00 por quilo excedente.
João precisa que você faça um algoritmo que leia a variavel 'p' (peso de peixes)
e verifique se há excesso. Se houver, gravar na variavel 'e' (excesso) 
e na variável 'm' o valor da multa que João deverá pagar. Caso contrário mostrar 
tais variáveis com o conteúdo 'zero' 
*/

#include <stdio.h>

int main()
{
    //variáveis
    float p, m;
    char e[8] = "excesso";

    //entradas
    printf("Informe o peso dos peixes: ");
    scanf("%f", &p);

    //processamento
    if (p > 50)
    {
        m = (p - 50) * 4.00;
        printf("Você deverá pagar %.2f em multas.", m);
    }
    else
    {
        m = 0;
        e[0] = 0;
        printf("Multas: %.2f\n", m);
        printf("Excesso: %d", e[0]);
    }
}