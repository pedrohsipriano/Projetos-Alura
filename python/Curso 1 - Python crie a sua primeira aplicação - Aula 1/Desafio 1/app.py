numeros1 = [1,2,3,4,5,6,7,8,9,10]
nomes = ["Pedro", "João", "Giovanna"]
ano = [2002, 2025]

for nome in nomes:
    print(f"{nome}")
print("--------------------------------------")

soma = 0
for numero in numeros1:
    if numero % 2 != 0:
        soma += numero
print(f"{soma}")
print("--------------------------------------")

for numeros2 in range(10, 0, -1):
    print(numeros2)
print("--------------------------------------")

tabuada = int(input("Digite um numero para a tabuada: "))
resultado = 0
for i in range(1,11):
    resultado = tabuada * i
    print(f"{tabuada} x {i} = {resultado}")
print("--------------------------------------")

soma = 0
try:
    for numero in numeros1:
            soma += numero
    print(soma)
except Exception as e:
    print(f"Erro {e}")
print("--------------------------------------")

soma = 0
try:
    for numero in numeros1:
        soma += numero
        media = (soma / len(numeros1))
    print (media)
except Exception as e:
    print(f"Erro {e}")
print("--------------------------------------")

