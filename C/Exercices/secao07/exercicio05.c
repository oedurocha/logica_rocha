#include <stdio.h>

int main()
{
    // Variáveis
    char nome[100], senha[100];

    //Entradas
    printf("Informe o Nome de Usuário: ");
    gets(nome);

    printf("Informe a Senha: ");
    gets(senha);

    //Processamento
    while (!strcmp(nome, senha))
    {
        printf("Nome de usuário não pode ser igual a senha. \n");
        printf("============================================\n");
        printf("Informe o Nome de Usuário: ");
        gets(nome);

        printf("Informe a Senha: ");
        gets(senha);
    }
}
