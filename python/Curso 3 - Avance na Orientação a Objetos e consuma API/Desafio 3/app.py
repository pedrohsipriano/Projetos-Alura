from models.carro import Carro

def main():
    
    carro1 = Carro('Civic', 'Honda', 'Preto')
    carro2 = Carro('Corolla', 'Toyota', 'Branco')
    carro3 = Carro('Fusca', 'Volkswagen', 'Azul')
    
    carro1.ligar()
    carro2.ligar()
    carro3.ligar()
    
if __name__ == "__main__":
    main()
    