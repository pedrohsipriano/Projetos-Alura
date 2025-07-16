class Avaliacao:
    """
    Representa uma avaliação feita por um cliente.

    Atributos:
        _cliente (str): Nome do cliente que fez a avaliação.
        _nota (int): Nota dada pelo cliente.
    """
    def __init__(self, cliente, nota):
        """
        Inicializa uma nova instância de Avaliacao.

        Args:
            cliente (str): Nome do cliente que fez a avaliação.
            nota (int): Nota atribuída pelo cliente.
        """
        self._cliente = cliente
        self._nota = nota