from models.Veiculo import Veiculo

class Moto(Veiculo):
    def __init__(self, marca, modelo, tipo ):
        super().__init__(marca, modelo)
        self._tipo = tipo
        
    def __str__(self):
        return f'Marca: {self._marca.ljust(15)} | Modelo: {self._modelo.ljust(15)} | Tipo:{self._tipo.ljust(17)} | Estado:{self._ligado}'