from modelos.restaurante import Restaurante
import os

restaurante_praca = Restaurante('praça', 'Gourmet')
restaurante_praca.receber_avaliacao('pedro', 10)
restaurante_praca.receber_avaliacao('joao', 8)
restaurante_praca.receber_avaliacao('vitor', 2)

# restaurante_mexicano = Restaurante('mexican food', 'Mexicana')
# restaurante_japones = Restaurante('japa', 'japonesa')

# restaurante_mexicano.alternar_status()
def main():
    Restaurante.listar_restaurantes()

if __name__ == '__main__':
    main()
