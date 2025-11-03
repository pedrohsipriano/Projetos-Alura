// mapa.h: definição das estruturas e protótipos relacionados ao mapa

#ifndef MAPA_H
#define MAPA_H

// Estrutura que representa o mapa: matriz de caracteres e dimensões
struct mapa
{
    char **matriz;
    int linhas;
    int colunas;
};

// Estrutura que representa uma posição (x = linha, y = coluna)
struct posicao
{
    int x;
    int y;
};

typedef struct posicao POSICAO;
typedef struct mapa MAPA;

// Libera a memória alocada para o mapa
void libera_mapa(MAPA *m);

// Lê o mapa do arquivo texto
void le_mapa(MAPA *m);

// Aloca memória para o mapa com base em m->linhas e m->colunas
void aloca_mapa(MAPA *m);

// Imprime o mapa na tela
void imprime_mapa(MAPA *m);

// Encontra a posição do caractere 'c' no mapa e preenche POSICAO
void encontra_mapa(MAPA *m, POSICAO *p, char c);

#endif // MAPA_H

int eValida(MAPA* m, int x, int y);

int eVazia(MAPA* m, int x, int y);

void andaNoMapa(MAPA* m, int xorigem, int yorigem, int ydestino, int xdestino);
