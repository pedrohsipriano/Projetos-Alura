from models.veiculo import Veiculo

class Carro(Veiculo):
    def __init__(self, modelo, marca, cor):
        super().__init__(modelo, marca)
        self.cor = cor

    def ligar(self):
        print(f"Ligando o carro {self.modelo} da marca {self.marca} na cor {self.cor}.")