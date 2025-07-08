import os

'''Lista com os nomes dos restaurantes cadastrados'''
restaurantes = [{"nome": "Praça", "categoria": "Japonesa", "ativo": False},
                {"nome": "Pizza", "categoria": "Pizza", "ativo": True},
                {"nome": "Cantina", "categoria": "Italiano", "ativo": False}]


def exibir_nome_programa():
    '''Essa função é resposável por exibir o nome do programa'''
    print("Sabor Express\n")


def exibir_opcoes():
    '''Essa função é resposável por exibir as opções do menu'''
    print("1. Cadastrar restaurante")
    print("2. Listar restaurante")
    print("3. Alternar estado do restaurante")
    print("4. Sair\n")


def finalizar_app():
    '''Essa função é resposável por exibir a mensagem final do porgrama'''
    exibir_subtitulo("Finalizando aplicação")


def voltar_menu():
    '''Essa função é resposável por exibir a mensagem para continuar no menu'''
    input("\nPressione enter para continuar ")
    main()


def opcao_invalida():
    '''Essa função é resposável por exibir a mensagem de opção invalida'''
    print("\nOpção inválida\n")
    voltar_menu()


def exibir_subtitulo(texto):
    '''Essa função é resposável por exibir o subtitulo do menu'''
    os.system("cls")
    linha = "*" * (len(texto))
    print(linha)
    print(texto)
    print(linha)
    print()


def cadastrar_restaurante():
    '''Essa função é resposável por cadastrar um novo restaurante'''
    exibir_subtitulo("Cadastro de restaurantes")
    nome_restaurante = input("Digite o nome do restaurante: ")
    categoria = input(
        f"Digite a categoria do restaurante {nome_restaurante}: ")
    dados_restaurante = {"nome": nome_restaurante,
                         "categoria": categoria, "ativo": False}
    restaurantes.append(dados_restaurante)
    print(f"Restaurante {nome_restaurante} cadastrado com sucesso\n")
    voltar_menu()


def listar_restaurantes():
    '''Essa função é resposável por listar restaurantes cadastrados'''
    exibir_subtitulo("Listando restaurantes")

    print(f"{'Nome do Restaurante'.ljust(23)} | {'Categoria'.ljust(20)} | {'Status'}")
    print("")
    for restaurante in restaurantes:
        nome_restaurante = restaurante["nome"]
        categoria = restaurante["categoria"]
        ativo = "Ativado" if restaurante["ativo"] else "Desativado"
        print(f"-> {nome_restaurante.ljust(20)} | {categoria.ljust(20)} | {ativo}")
    voltar_menu()


def alternar_estado():
    '''Essa função é resposável por calterar o status do restaurante'''
    exibir_subtitulo("Alternando estado do restaurante")
    nome_restaurante = input(
        "Digite o nome do restaurante que deseja alternar o estado: ")
    restaurante_encontrado = False

    for restaurante in restaurantes:
        if nome_restaurante == restaurante["nome"]:
            restaurante_encontrado = True
            restaurante["ativo"] = not restaurante["ativo"]
            mensagem = f"O restaurante {nome_restaurante} foi alterado para {restaurante['ativo']}"
            print(mensagem)
    if not restaurante_encontrado:
        print(f"Restaurante {nome_restaurante} não encontrado")
    voltar_menu()


def escolher_opcao():
    '''Essa função é resposável pela escolha do usuario ao selecionar no menu'''
    opcao = 0

    while opcao != 4:
        try:
            opcao = int(input("Escolha uma opção: "))
            print(f"voce escolheu a opção: {opcao}")
            if opcao == 1:
                cadastrar_restaurante()
            elif opcao == 2:
                listar_restaurantes()
            elif opcao == 3:
                alternar_estado()
            elif opcao == 4:
                finalizar_app()
            else:
                opcao_invalida()
        except:
            opcao_invalida()
        break


def main():
    os.system("cls")
    exibir_nome_programa()
    exibir_opcoes()
    escolher_opcao()


if __name__ == "__main__":
    main()
