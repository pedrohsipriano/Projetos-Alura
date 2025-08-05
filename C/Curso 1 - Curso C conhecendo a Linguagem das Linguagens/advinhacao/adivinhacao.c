#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

int main() {
    setlocale(LC_ALL, "Portuguese");
    system("cls");

    //imprime uma mensagem de boas-vindas
    printf("******************************************\n");
    printf("* Bem-vindo ao nosso jogo de adivinha??o *\n");
    printf("******************************************\n");
    
    int numerosecreto = 42;
    printf("O número secreto é: %d\n", numerosecreto);

    int chute;
    printf("Qual é o seu chute? ");
    scanf("%d", &chute);
    printf("Seu chute foi %d\n", chute);
    
    if (chute == numerosecreto){
        printf("Parabéns! você acertou!\n");
    }else if(chute < numerosecreto){
        printf("Você errou! O número secreto é maior.\n");
    }else if(chute > numerosecreto){
        printf("Você errou! O número secreto é menor.\n");
    }else{
        printf("Você errou! Tente novamente.\n");
    }
    return 0;
}