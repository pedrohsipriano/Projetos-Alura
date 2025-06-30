import os

restaurantes = []

def exibir_nome_programa():
    print("Sabor Express\n")


def exibir_opcoes():
    print("1. Cadastrar restaurante")
    print("2. Listar restaurante")
    print("3. Ativar restaurante")
    print("4. Sair\n")


def finalizar_app():
    os.system("cls")
    print("Obrigado por utilizar o Sabor Express")
    print("Saindo\n")
    
def opcao_invalida():
    print("\nOpção inválida\n")
    input("Pressione enter para continuar")
    main()

def cadastrar_restaurante():
    os.system("cls")
    print("Cadastro de novos restaurantes\n")
    nome_restaurante = input("Digite o nome do restaurante: ")
    restaurantes.append(nome_restaurante)
    print(f"Restaurante {nome_restaurante} cadastrado com sucesso\n")
    input("Pressione enter para continuar")
    main()
    


def escolher_opcao():
    opcao = 0
    try:
        while opcao != 4:
            opcao = int(input("Escolha uma opção: "))
            print(f"voce escolheu a opção: {opcao}")
            if opcao == 1:
                cadastrar_restaurante()
            elif opcao == 2:
                print("Listar restaurante")
            elif opcao == 3:
                print("Ativar restaurante")
            elif opcao == 4:
                finalizar_app()
                if opcao == 4:
                    break
            else:
                opcao_invalida()
    except:
        opcao_invalida()
        
def main():
    os.system("cls")
    exibir_nome_programa()
    exibir_opcoes()
    escolher_opcao()


if __name__ == "__main__":
    main()
