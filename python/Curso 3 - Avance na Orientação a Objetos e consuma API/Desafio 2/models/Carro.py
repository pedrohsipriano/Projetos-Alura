from models.Veiculo import Veiculo

class Carro(Veiculo):
    def __init__(self, marca, modelo, portas):
        super().__init__(marca, modelo)
        self._portas = portas
        
    def __str__(self):
        return f'Marca: {self._marca.ljust(15)} | Modelo: {self._modelo.ljust(15)} | Portas:{self._portas.ljust(15)} | Estado:{self._ligado}'