from models.restaurante import Restaurante
from models.cardapio.bebida import Bebida
from models.cardapio.prato import Prato
import os

restaurante_praca = Restaurante('praça', 'Gourmet')
bebida_suco = Bebida('Suco de Melancia', 5.00, 'Grande')
prato_paozinho = Prato('Pãozinho', 2.00, 'Pãozinho com manteiga e queijo')
def main():
    print(bebida_suco)
    print(prato_paozinho)

if __name__ == '__main__':
    main()
