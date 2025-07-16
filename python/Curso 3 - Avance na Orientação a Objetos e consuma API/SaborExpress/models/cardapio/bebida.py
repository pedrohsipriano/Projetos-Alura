from models.cardapio.itens_cardapio import ItemCardapio

class Bebida(ItemCardapio):
    def __init__(self, nome, preco, tamanho):
        super().__init__(nome, preco)
        self._tamanho = tamanho
        
    def __str__(self):
        """
        Retorna uma representação em string da bebida.

        Returns:
            str: Nome, preço e tamanho da bebida formatados.
        """
        return f'{self._nome} - {self._preco:.2f} - {self._tamanho}\n'