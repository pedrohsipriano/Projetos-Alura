from models.Carro import Carro
from models.Moto import Moto

moto1 = Moto("Yamaha", "MT-07", "Esportiva")
moto2 = Moto("Honda", "CBR", "Esportiva")
moto3 = Moto("Kawasaki", "Ninja", "Esportiva")
carro1 = Carro("Toyota", "Corolla", '4')
carro2 = Carro("Ford", "Fiesta", '4')
carro3 = Carro("Chevrolet", "Onix", '4')

def main():
    print("-" * 90)
    print("Motos:")
    print(moto1)
    print(moto2)
    print(moto3)
    print("-" * 90)
    print("Carros:")
    print(carro1)
    print(carro2)
    print(carro3)

if __name__ == "__main__":
    main()

