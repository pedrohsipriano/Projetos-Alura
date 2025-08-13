#define TAMANHO_PALAVRA 20

void abertura();          // Exibe a tela inicial do jogo
void chuta();             // Lê um chute do jogador
int jaChutou(char letra); // Verifica se uma letra já foi chutada
void desenhaforca();      // Exibe o estado atual da forca
int enforcou();           // Verifica se o jogador foi enforcado
void escolhepalavra();    // Define a palavra secreta do jogo
int acertou();            // Verifica se o jogador acertou a palavra
void adicionaPalavra();   // Adiciona uma nova palavra ao jogo
int chutesErrados();      // Retorna o número de chutes errados

