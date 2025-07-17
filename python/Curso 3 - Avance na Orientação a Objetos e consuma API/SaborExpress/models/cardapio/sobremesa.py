from models.cardapio.itens_cardapio import ItemCardapio

class Sobremesa(ItemCardapio):
    def __init__(self, nome, preco, descricao, tamanho, tipo):
        super().__init__(nome, preco)
        self._descricao = descricao 
        self._tamanho = tamanho 
        self._tipo = tipo 
        
    def __str__(self):
        """
        Retorna uma representação em string do prato.

        Returns:
            str: Nome, preço e descrição do prato formatados.
        """
        return f'{self._nome} - {self._descricao} - {self._tamanho} - {self._tipo} - {self._preco:.2f}\n'
    
    def aplicar_desconto(self):
        self._preco -= self._preco * (0.05)