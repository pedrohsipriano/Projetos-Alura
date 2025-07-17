from abc import ABC, abstractmethod

class Veiculo(ABC):
    def __init__(self, modelo, marca):
        self.modelo = modelo
        self.marca = marca
      
    @abstractmethod  
    def ligar(self):
        pass