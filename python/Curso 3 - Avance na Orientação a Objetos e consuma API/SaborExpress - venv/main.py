from fastapi import FastAPI, Query  # type: ignore
import requests
import os

app = FastAPI()


@app.get('/api/hello')
def heloo_word():
    '''Simple endpoint to return a greeting message.'''
    return {'Hello': 'World!'}


@app.get('/api/restaurantes/')
def get_restaurantes(restaurante: str = Query(None)):
    '''Endpoint para ver os cardapios dos restaurantes.'''

    os.system("cls")
    url = 'https://guilhermeonrails.github.io/api-restaurantes/restaurantes.json'
    response = requests.get(url)

    if response.status_code == 200:
        dados_json = response.json()
        if restaurante is None:
            return {'Dados': dados_json}
        dados_restaurante = []
        for item in dados_json:
            if item['Company'] == restaurante:
                dados_restaurante.append({
                    'item': item['Item'],
                    'price': item['price'],
                    'description': item['description']
                })
        return {'Restaurante': restaurante, 'Cardapio': dados_restaurante}
    else:
        return(f"Erro ao acessar a API: {response.status_code}")
