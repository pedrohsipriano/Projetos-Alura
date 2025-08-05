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
    printf("* Bem-vindo ao nosso jogo de adivinhação *\n");
    printf("******************************************\n");

    int segundos = time(0);
    srand(segundos);
    int numerosecreto = segundos % 100; // Gera um número secreto entre 0 e 99
    printf("O número secreto é: %d\n", numerosecreto);
    int chute = 0;
    int contador = 1;
    double pontos = 1000;
    
    do
    {
        printf("\nTentativa %d\n", contador);
        printf("Qual é o seu chute? ");
        scanf("%d", &chute);
        printf("Seu chute foi %d\n", chute);

        if (chute < 0)
        {
            printf("Por favor, insira um número positivo.\n");
            continue;
        }
        

        if (chute == numerosecreto)
        {
            printf("Parabéns! você acertou!\n");
            break;
        }
        else if (chute < numerosecreto)
        {
            printf("Você errou! O número secreto é maior.\n");
        }
        else if (chute > numerosecreto)
        {
            printf("Você errou! O número secreto é menor.\n");
        }
        contador++;

        double pontosPerdidos = abs(chute - numerosecreto) / 2.0;
        pontos -= pontosPerdidos;
    } while (1);

    printf("Fim do jogo!\n");
    printf("Você acertou o número secreto em %d tentativas!\n", contador);
    printf("Sua pontuação final é: %.2f\n", pontos);
    return 0;
}