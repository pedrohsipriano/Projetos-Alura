from models.restaurante import Restaurante
from models.cardapio.bebida import Bebida
from models.cardapio.prato import Prato
from models.cardapio.sobremesa import Sobremesa
import os

restaurante_praca = Restaurante('praça', 'Gourmet')
bebida_suco = Bebida('Suco de Melancia', 5.00, 'Grande')
bebida_suco.aplicar_desconto()
prato_paozinho = Prato('Pãozinho', 2.00, 'Pãozinho com manteiga e queijo')
prato_paozinho.aplicar_desconto()
sobremesa_bolo = Sobremesa('Bolo de Chocolate', 10.00, 'Bolo de chocolate com cobertura', 'Pequeno', 'Doce')
restaurante_praca.adicionar_item_cardapio(bebida_suco)
restaurante_praca.adicionar_item_cardapio(prato_paozinho)
restaurante_praca.adicionar_item_cardapio(sobremesa_bolo)
def main():
    os.system("cls")
    restaurante_praca.exibir_cardapio

if __name__ == '__main__':
    main()
