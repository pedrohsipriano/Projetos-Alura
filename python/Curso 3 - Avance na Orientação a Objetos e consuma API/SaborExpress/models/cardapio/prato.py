from models.cardapio.itens_cardapio import ItemCardapio

class Prato(ItemCardapio):
    def __init__(self, nome, preco, descricao):
        super().__init__(nome, preco)
        self._descricao = descricao
        
    def __str__(self):
        """
        Retorna uma representação em string do prato.

        Returns:
            str: Nome, preço e descrição do prato formatados.
        """
        return f'{self._nome} - {self._preco:.2f} - {self._descricao}\n'