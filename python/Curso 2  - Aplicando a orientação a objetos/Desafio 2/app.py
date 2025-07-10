import os

os.system('cls')

class Pessoa:
    def __init__(self, nome='', idade=0, profissao=''):
        self._nome = nome
        self._idade = idade
        self._profissao = profissao

    def __str__(self):
        return f'{self._nome} | {self._idade} | {self._profissao}'

    @property
    def saudacao(self):
        return f'Olá {self._nome}, parabens pela profissao {self._profissao}'

    def aniversario(self):
        self._idade += 1
        
pessoa1 = Pessoa('Joaquim', 30, 'Programador')
print(pessoa1)
print(pessoa1.saudacao)
pessoa1.aniversario()
print(pessoa1)