import os

os.system('cls') 
pessoa = {'nome':'Pedro', 'idade':22, 'cidade':'Ceilândia'}
print (pessoa)
print('-----------------')

pessoa['idade'] = 31
print (pessoa)
print('-----------------')

pessoa['profissao'] = 'engenheiro'
print (pessoa)
print('-----------------')

del pessoa['cidade']
print (pessoa)
print('-----------------')

numeros_quadrados = {x: x*1 for x in range(1, 6)}
print(numeros_quadrados)
print('-----------------')

if 'nome' in pessoa:
    print("A chave 'nome' existe no dicionário.")
else:
    print("A chave 'nome' não existe no dicionário.")
print('-----------------')

frase = "ola ola ola oi ola oi oi tchau tchau oi"
contagem_palavras = {}
palavras = frase.split()
for palavra in palavras:
    contagem_palavras[palavra] = contagem_palavras.get(palavra, 0) + 1
print(contagem_palavras)
print('-----------------')