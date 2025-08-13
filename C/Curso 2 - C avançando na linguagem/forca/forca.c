#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include "forca.h"



    char palavrasecreta[TAMANHO_PALAVRA]; // Palavra a ser descoberta
    char chutes[26];         // Vetor para armazenar os chutes do jogador
    int chutesDados = 0;      // Contador de tentativa

// Exibe a tela inicial do jogo
void abertura()
{
    system("cls");
    printf("********************************\n");
    printf("**        Jogo de Forca       **\n");
    printf("********************************\n\n");
}

// L� um chute do jogador, armazena no vetor e incrementa o n�mero de chutesDados
void chuta()
{
    char chute;
    scanf(" %c", &chute);
    chutes[chutesDados] = chute;
    chutesDados++;
}

// Verifica se uma letra j� foi chutada pelo jogador
int jaChutou(char letra)
{
    int achou = 0;
    for (int j = 0; j < chutesDados; j++)
    {
        if (chutes[j] == letra)
        {
            achou = 1; // Letra encontrada entre os chutes
            break;     // Interrompe ao encontrar
        }
    }
    return achou; // 1 se j� chutou, 0 se n�o
}

// Exibe o estado atual da palavra, mostrando letras acertadas e '_' para as n�o acertadas
void desenhaforca()
{
    int erros = chutesErrados();

    printf("__________     \n");
    printf(" |/      |     \n");
    printf(" |       %c     \n",(erros >= 1 ? 'o' : ' '));
    printf(" |      %c%c%c  \n", (erros >= 3 ? '/' : ' '), (erros >= 2 ? '|' : ' '), (erros >= 4 ? '\\' : ' '));
    printf(" |      %c %c   \n", (erros >= 5 ? '/' : ' '), (erros >= 6 ? '\\' : ' '));
    printf(" |             \n");
    printf("_|___          \n");

    for (size_t i = 0; i < strlen(palavrasecreta); i++)
    {
        int achou = jaChutou(palavrasecreta[i]);
        if (achou)
        {
            printf("%c ", palavrasecreta[i]); // Mostra letra acertada
        }
        else
        {
            printf("_ "); // Mostra '_' para letra n�o acertada
        }
    }
    printf("\n");
}

int chutesErrados(){
    int erros = 0;
    for (int i = 0; i < chutesDados; i++)
    {
        int existe = 0;
        for (size_t j = 0; j < strlen(palavrasecreta); j++)
        {
            if (chutes[i] == palavrasecreta[j])
            {
                existe = 1;
                break;
            }
        }
        if (!existe) erros++; // Enforcou
    }
    return erros; // Retorna o n�mero de chutes errados
}

int enforcou(){
    
    return chutesErrados() >= 6; // Retorna 1 se enforcou (6 ou mais erros), 0 caso contr�rio
}

void adicionaPalavra(){

    char quer;
    char novaPalavra[TAMANHO_PALAVRA];
    printf("Voce deseja adicionar uma nova palavra no jogo? (S/N) ");
    scanf(" %c", &quer);
    if (quer == 's')
    {
        printf("Qual a nova palavra? ");
        scanf(" %s", novaPalavra);

        FILE* f;
        f = fopen("palavras.txt", "r+");
        if (f == NULL)
        {
            printf("Erro ao abrir o arquivo.\n");
            exit(1);
        }

        int qtd;
        fscanf(f, "%d", &qtd); // L� a quantidade de palavras j� existentes
        qtd++;

        fseek(f, 0, SEEK_SET); // Volta ao in�cio do arquivo
        fprintf(f, "%d", qtd); // Atualiza a quantidade de palavras

        fseek(f, 0, SEEK_END); // Vai para o final do arquivo
        fprintf(f, "\n%s", novaPalavra);
        fclose(f);
    }
}

// Define a palavra secreta do jogo
void escolhepalavra(){
    FILE* f;
    f = fopen("palavras.txt", "r");
    if (f == NULL)
    {
        printf("Erro ao abrir o arquivo.\n");
        exit(1);
    }
    

    int qtdpalavras;
    fscanf(f, "%d", &qtdpalavras);

    srand(time(0)); // Semente para n�meros aleat�rios
    int randomico = rand() % qtdpalavras;

    for (int i = 0; i < randomico; i++)
    {
        fscanf(f, "%s", palavrasecreta);
    }
    

    fclose(f);
}

int acertou(){
    for (size_t i = 0; i < strlen(palavrasecreta); i++)
    {
        if (!jaChutou(palavrasecreta[i]))
        {
            return 0;
        }
    }

    return 1;
}

int main()
{
    setlocale(LC_ALL, "Portuguese");

    escolhepalavra(palavrasecreta); // Define a palavra secreta
    abertura();                     // Exibe a tela inicial

    // Loop principal do jogo: repete at� o jogador acertar ou ser enforcado
    do
    {
        desenhaforca(); // Mostra o progresso
        chuta();
        // O loop continua enquanto n�o acertar toda a palavra e n�o for enforcado
    } while (!acertou() && !enforcou());

    if (acertou())
    {
        printf("Parab�ns! Voc� acertou a palavra: %s\n", palavrasecreta);
    }
    else
    {
        printf("Voc� foi enforcado! A palavra era: %s\n", palavrasecreta);
        printf("__________     \n");
        printf(" |/      |     \n");
        printf(" |       O      \n");
        printf(" |      /|\\    \n");
        printf(" |      / \\    \n");
        printf(" |             \n");
    }

    adicionaPalavra();
    return 0;
}