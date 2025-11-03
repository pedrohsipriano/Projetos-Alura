#include <stdio.h>
#include <stdlib.h>
#include "mapa.h"

void andaNoMapa(MAPA* m, int xorigem, int yorigem, int xdestino, int ydestino)
{
    char personagem = m->matriz[xorigem][yorigem];
    m->matriz[xdestino][ydestino] = personagem;
    m->matriz[xorigem][yorigem] = ' ';
}

int eValida(MAPA* m, int x, int y){
    if (x < 0 || x >= m->linhas)
        return 0;
    if (y < 0 || y >= m->colunas)
        return 0;
    return 1;
}

int eVazia(MAPA* m, int x, int y){
    return m->matriz[x][y] == '.' || m->matriz[x][y] == ' ';
}

void encontra_mapa(MAPA *m, POSICAO *p, char c)
{
    // Procura a posição do caractere 'c' no mapa e preenche a estrutura
    // POSICAO com as coordenadas encontradas. Se houver múltiplas
    // ocorrências, a primeira encontrada (varrendo por linhas) é usada.
    for (int i = 0; i < m->linhas; i++)
    {
        for (int j = 0; j < m->colunas; j++)
        {
            if (m->matriz[i][j] == c)
            {
                p->x = i;
                p->y = j;
                return; // sair imediatamente após encontrar
            }
        }
    }
}

void libera_mapa(MAPA *m)
{
    for (int i = 0; i < m->linhas; i++)
    {
        free(m->matriz[i]);
    }
    free(m->matriz);
}

void aloca_mapa(MAPA *m)
{
    m->matriz = malloc(sizeof(char *) * m->linhas);
    for (int i = 0; i < m->linhas; i++)
    {
        m->matriz[i] = malloc(sizeof(char) * (m->colunas + 1)); // +1 para o terminador nulo
    }
}

// Lê o mapa do arquivo texto e armazena na matriz
void le_mapa(MAPA *m)
{
    FILE *f = fopen("mapa.txt", "r");
    if (f == NULL)
    {
        printf("Erro ao abrir o arquivo\n");
        exit(1);
    }

    // Lê as dimensões do mapa
    fscanf(f, "%d %d", &(m->linhas), &(m->colunas));

    aloca_mapa(m);

    // Lê cada linha do mapa
    for (int i = 0; i < m->linhas; i++)
    {
        fscanf(f, "%s", m->matriz[i]);
    }
    fclose(f);
}

// Imprime o mapa na tela
void imprime_mapa(MAPA *m)
{
    for (int i = 0; i < m->linhas; i++)
    {
        printf("%s\n", m->matriz[i]);
    }
}
