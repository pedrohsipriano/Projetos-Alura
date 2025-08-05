#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <time.h>

#define NUMERO_DE_TENTATIVAS 5

int main()
{
    setlocale(LC_ALL, "Portuguese");
    system("cls");

    // imprime uma mensagem de boas-vindas
    printf("******************************************\n");
    printf("* Bem-vindo ao nosso jogo de adivinha��o *\n");
    printf("******************************************\n");

    int segundos = time(0);
    srand(segundos);
    int numerosecreto = segundos % 100; // Gera um n�mero secreto entre 0 e 99
    printf("O n�mero secreto �: %d\n", numerosecreto);
    int chute = 0;
    int contador = 1;
    double pontos = 1000;
    
    do
    {
        printf("\nTentativa %d\n", contador);
        printf("Qual � o seu chute? ");
        scanf("%d", &chute);
        printf("Seu chute foi %d\n", chute);

        if (chute < 0)
        {
            printf("Por favor, insira um n�mero positivo.\n");
            continue;
        }
        

        if (chute == numerosecreto)
        {
            printf("Parab�ns! voc� acertou!\n");
            break;
        }
        else if (chute < numerosecreto)
        {
            printf("Voc� errou! O n�mero secreto � maior.\n");
        }
        else if (chute > numerosecreto)
        {
            printf("Voc� errou! O n�mero secreto � menor.\n");
        }
        contador++;

        double pontosPerdidos = abs(chute - numerosecreto) / 2.0;
        pontos -= pontosPerdidos;
    } while (1);

    printf("Fim do jogo!\n");
    printf("Voc� acertou o n�mero secreto em %d tentativas!\n", contador);
    printf("Sua pontua��o final �: %.2f\n", pontos);
    return 0;
}