#include <stdio.h>
#include <stdlib.h>
#include "pacman.h"
// Incluído intencionalmente aqui (ver observação acima)
#include "mapa.c"

// Estrutura que guarda o mapa do jogo
MAPA m;
// Posição atual do herói (personagem '@')
POSICAO heroi;

// Verifica se o jogo acabou. Retorna 1 se acabou, 0 caso contrário.
int acabou()
{
    // Implementar lógica para verificar se o jogo acabou
    return 0; // Retornar 1 se acabou, 0 caso contrário
}

int eDirecao(char direcao)
{
    return (direcao == 'w' || direcao == 'a' || direcao == 's' || direcao == 'd');
}

// Move o personagem principal de acordo com a direção informada.
void move(char direcao)
{
    if (!eDirecao(direcao))
    {
        printf("Comando inválido! Use 'w', 'a', 's' ou 'd' para mover.\n");
        return;
    }

    int proximox = heroi.x;
    int proximoy = heroi.y;

    // Atualiza posição segundo o comando: 'w' (cima), 'a' (esquerda),
    // 's' (baixo), 'd' (direita).
    switch (direcao)
    {
    case 'a':
        system("cls"); // limpa a tela (Windows)
        proximoy--;
        break;
    case 'w':
        system("cls");
        proximox--;
        break;
    case 's':
        system("cls");
        proximox++;
        break;
    case 'd':
        system("cls");
        proximoy++;
        break;
    }

    if (!eValida(&m, proximox, proximoy))
        return;

    if (!eVazia(&m, proximox, proximoy))
        return;

    andaNoMapa(&m, heroi.x, heroi.y, proximox, proximoy);
    heroi.x = proximox;
    heroi.y = proximoy;
}
// Função que contém o loop principal do jogo. Mostra o mapa, lê um
// comando do usuário e aplica o movimento repetidamente até o jogo
// terminar.
void logica_jogo()
{
    // Loop principal do jogo
    do
    {
        imprime_mapa(&m); // Mostra o mapa atual
        char comando;
        scanf(" %c", &comando); // Lê comando do usuário
        move(comando);          // Move o personagem

    } while (!acabou()); // Repete até o jogo acabar
}

// Função principal do jogo
// Ponto de entrada do programa
int main()
{
    system("cls"); // Limpa a tela (Windows)

    le_mapa(&m); // Lê o mapa do arquivo

    encontra_mapa(&m, &heroi, '@');

    logica_jogo(&m);

    libera_mapa(&m); // Libera memória alocada para o mapa

    return 0;
}