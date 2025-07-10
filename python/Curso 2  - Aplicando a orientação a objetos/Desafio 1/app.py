class Carro:
    def __init__(self, modelo, cor, ano):
        self.marca = modelo
        self.modelo = cor
        self.modelo = ano
        

Carro1 = Carro("Ferrari", "Vermelho", 2022)
Carro2 = Carro("Lamborghini", "verde", 2023)


class Restaurante:
    def __init__(self, nome, categoria, status, endereço, telefone):
        self.nome = nome
        self.categoria = categoria
        self.status = False
        self.endereço = endereço
        self.telefone = telefone
    
    def __str__(self):
        return f'{self.nome} | {self.categoria}'


Restaurante1 = Restaurante("Burger King", "Hamburguer", False, "Rua 1", "1234-5678")
Restaurante2 = Restaurante("McDonalds", "Hamburguer", False, "Rua 2", "1234-5678")


print(Restaurante1)


class Cliente:
    def __init__(self, nome, idade, sexo):
        self.nome = nome
        self.idade = idade
        self.sexo = sexo
    
    def __str__(self):
        return f'{self.nome} | {self.idade} | {self.sexo}'
    
Cliente1 = Cliente("Pedro", 22, "Masculino")

print(Cliente1)