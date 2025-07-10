from modelos.avaliacao import Avaliacao
import os

os.system("cls")


class Restaurante:
    restaurantes = []

    def __init__(self, nome, categoria):
        self._nome = nome.title()
        self._categoria = categoria.upper()
        self._status = False
        self._avaliacao = []
        Restaurante.restaurantes.append(self)

    def __str__(self):
        return f'{self._nome} | {self._categoria}'

    @classmethod
    def listar_restaurantes(cls):
        print('---------------------------------------------------------------------------------------------------------------------')
        print(f'{"NOME".ljust(25)} | {"CATEGORIA".ljust(25)} | {"AVALIACÃO".ljust(25)} | {"STATUS"}\n')
        for restaurante in cls.restaurantes:
            print(f'{restaurante._nome.ljust(25)} | {restaurante._categoria.ljust(25)} | {str(restaurante.media_avaliacoes).ljust(25)} | {restaurante.status}')
        print('---------------------------------------------------------------------------------------------------------------------')

    @property
    def status(self):
        return '🗵' if self._status else '☐'
    
    def alternar_status(self):
        self._status = not self._status
    
    def receber_avaliacao(self, cliente, nota):
        avaliacao = Avaliacao(cliente, nota)
        self._avaliacao.append(avaliacao)
    
    @property    
    def media_avaliacoes(self):
        if not self._avaliacao:
            return 0
        soma_notas = sum(avaliacao._nota for avaliacao in self._avaliacao)
        quantidade_notas = len(self._avaliacao)
        media = round(soma_notas / quantidade_notas, 1)
        return media