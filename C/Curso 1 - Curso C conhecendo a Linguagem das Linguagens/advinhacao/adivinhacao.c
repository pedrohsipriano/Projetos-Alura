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
    printf("O n�mero secreto �: %d\n", numerosecreto);

    int chute;
    printf("Qual � o seu chute? ");
    scanf("%d", &chute);
    printf("Seu chute foi %d\n", chute);
    
    if (chute == numerosecreto){
        printf("Parab�ns! voc� acertou!\n");
    }else if(chute < numerosecreto){
        printf("Voc� errou! O n�mero secreto � maior.\n");
    }else if(chute > numerosecreto){
        printf("Voc� errou! O n�mero secreto � menor.\n");
    }else{
        printf("Voc� errou! Tente novamente.\n");
    }
    return 0;
}