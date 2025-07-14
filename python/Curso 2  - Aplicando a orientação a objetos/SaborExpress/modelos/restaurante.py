from modelos.avaliacao import Avaliacao
import os

os.system("cls")


class Restaurante:
    """
    Representa um restaurante com informações como nome, categoria, status e avaliações.

    Atributos:
        restaurantes (list): Lista de todos os restaurantes criados.
        _nome (str): Nome do restaurante.
        _categoria (str): Categoria do restaurante.
        _status (bool): Status do restaurante (aberto ou fechado).
        _avaliacao (list): Lista de avaliações associadas ao restaurante.
    """
    restaurantes = []

    def __init__(self, nome, categoria):
        """
        Inicializa uma nova instância de Restaurante.

        Args:
            nome (str): Nome do restaurante.
            categoria (str): Categoria do restaurante.
        """
        self._nome = nome.title()
        self._categoria = categoria.upper()
        self._status = False
        self._avaliacao = []
        Restaurante.restaurantes.append(self)

    def __str__(self):
        """
        Retorna uma representação em string do restaurante.

        Returns:
            str: Nome e categoria do restaurante formatados.
        """
        return f'{self._nome} | {self._categoria}'

    @classmethod
    def listar_restaurantes(cls):
        """
        Lista todos os restaurantes cadastrados com suas informações formatadas.
        """
        print('---------------------------------------------------------------------------------------------------------------------')
        print(f'{"NOME".ljust(25)} | {"CATEGORIA".ljust(25)} | {"AVALIACÃO".ljust(25)} | {"STATUS"}\n')
        for restaurante in cls.restaurantes:
            print(f'{restaurante._nome.ljust(25)} | {restaurante._categoria.ljust(25)} | {str(restaurante.media_avaliacoes).ljust(25)} | {restaurante.status}')
        print('---------------------------------------------------------------------------------------------------------------------')

    @property
    def status(self):
        """
        Retorna o status do restaurante como um símbolo.

        Returns:
            str: '🗵' se o restaurante está aberto, '☐' caso contrário.
        """
        return '🗵' if self._status else '☐'
    
    def alternar_status(self):
        """
        Alterna o status do restaurante entre aberto e fechado.
        """
        self._status = not self._status
    
    def receber_avaliacao(self, cliente, nota):
        """
        Adiciona uma avaliação ao restaurante.

        Args:
            cliente (str): Nome do cliente que fez a avaliação.
            nota (int): Nota atribuída pelo cliente (de 0 a 5).
        """
        if nota >= 0 and nota <= 5:
            avaliacao = Avaliacao(cliente, nota)
            self._avaliacao.append(avaliacao)
    
    @property    
    def media_avaliacoes(self):
        """
        Calcula a média das notas das avaliações do restaurante.

        Returns:
            float: Média das notas arredondada para uma casa decimal. Retorna 0 se não houver avaliações.
        """
        if not self._avaliacao:
            return 0
        soma_notas = sum(avaliacao._nota for avaliacao in self._avaliacao)
        quantidade_notas = len(self._avaliacao)
        media = round(soma_notas / quantidade_notas, 1)
        return media