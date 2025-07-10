import os

os.system('cls')

class ContaBancaria:
    ContasBancarias = []
    def __init__(self, titular, saldo):
        self._titular = titular
        self._saldo = saldo
        self._status = False
        ContaBancaria.ContasBancarias.append(self)
        
    def __str__ (self):
        return f'{self._titular} | {self._saldo}'
        
    @property
    def titular(self):
        return self._titular

    @property
    def saldo(self):
        return self._saldo

    @property
    def status(self):
        return '🗵' if self._status else '☐'
    
    def alternar_status(self):
        self._status = not self._status
    
    @classmethod
    def listar_contas(cls):
        print('---------------------------------------------------------------------------------------------------------------------')
        print(f'\n{"TITULAR".ljust(25)} | {"SALDO".ljust(25)} | {"STATUS"}\n')
        for contaBancaria in cls.ContasBancarias:
            print(f'{contaBancaria._titular.ljust(25)} | {contaBancaria._saldo.ljust(25)} | {contaBancaria.status}')
        print('---------------------------------------------------------------------------------------------------------------------')
        
  
class ClienteBanco:
    ClientesBanco = []
    def __init__(self, titular, idade, email, endereco, telefone):
        self._titular = titular
        self._idade = idade
        self._email = email
        self._endereco = endereco
        self._telefone = telefone
        ClienteBanco.ClientesBanco.append(self)
        
    @classmethod
    def listar_clientes(cls):
        print('---------------------------------------------------------------------------------------------------------------------')
        print(f'\n{"TITULAR".ljust(25)} | {"IDADE".ljust(25)} | {"EMAIL".ljust(25)} | {"ENDERECO".ljust(25)} | {"TELEFONE"}\n')
        for clienteBanco in cls.ClientesBanco:
            print(f'{clienteBanco._titular.ljust(25)} | {clienteBanco._idade.ljust(25)} | {clienteBanco._email.ljust(25)} | {clienteBanco._endereco.ljust(25)} | {clienteBanco._telefone}')
        print('---------------------------------------------------------------------------------------------------------------------')
    
    
contaBancaria1 = ContaBancaria('Pedro', '1000')
contaBancaria2 = ContaBancaria('Joao', '1500')

ContaBancaria.listar_contas()

contaBancaria1.alternar_status()
contaBancaria2.alternar_status()

ContaBancaria.listar_contas()

contaBancaria3 = ContaBancaria('Vitor', '2000')

print(f'{contaBancaria3.titular}')

ContaBancaria.listar_contas()

ClienteBanco1 = ClienteBanco('Joao', '20', 'teste@teste', 'Rua 1', '1234-5678')
ClienteBanco1 = ClienteBanco('Pedro', '22', 'teste@teste', 'Rua 2', '1234-5678')
ClienteBanco1 = ClienteBanco('Vitor', '18', 'teste@teste', 'Rua 3', '1234-1234')

ClienteBanco.listar_clientes()