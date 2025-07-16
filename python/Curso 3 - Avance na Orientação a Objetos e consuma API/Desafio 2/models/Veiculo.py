class Veiculo:
    def __init__(self, marca, modelo):
        self._marca = marca
        self._modelo = modelo
        self._ligado = False
        
    def __str__(self):
        return f'{self._marca.ljust(15)} | {self._modelo.ljust(15)} | {self._ligado}'
    