package ProjetoFinal2.desafio.classes;

import java.util.List;
import java.util.Scanner;

public class Contatos {
    public String nome;
    public String telefone;
    public String email;

    // public Contatos(String nome, String telefone, String email) {
    // this.nome = nome;
    // this.telefone = telefone;
    // this.email = email;
    // }

    @Override
    public String toString() {
        return String.format("|Nome: %s | Telefone: %s | Email: %s |", nome, telefone, email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void exibirContatos(List<Contatos> contatos) {
        for (Contatos contato : contatos) {
            System.out.println(contato);
        }
    }

    public static void adicionarContato(List<Contatos> lista) {
        Scanner scanner = new Scanner(System.in);

        String opcao = "s";
        while (!opcao.equalsIgnoreCase("n")) {
            Contatos contato = new Contatos();
            System.out.println("==================================");
            System.out.print("Nome: ");
            contato.setNome(scanner.nextLine());

            System.out.print("Telefone: ");
            contato.setTelefone(scanner.nextLine());

            System.out.print("Email: ");
            contato.setEmail(scanner.nextLine());
            lista.add(contato);

            System.out.print("Deseja adicionar outro contato? (s/n): ");
            opcao = scanner.nextLine();
            System.out.println("==================================");
            if (!opcao.equalsIgnoreCase("s")) {
                break;
            }
        }
        for (Contatos contatos : lista) {
            System.out.println(contatos);
        };
    }

    public static void removerContato(List<Contatos> lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.print("Digite o nome do contato para remover: \n");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i).getNome());
        }

        String nomeContato = scanner.nextLine();
        for (Contatos contato : lista) {
            if (contato.getNome().equalsIgnoreCase(nomeContato)) {
                lista.remove(contato);
                System.out.println("Contato removido com sucesso!");
                break;
            }
        }
    }

    public static void buscarContato(List<Contatos> lista) {
        String opcao = "s";
        while (!opcao.equalsIgnoreCase("n")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("==================================");
            System.out.print("Digite o nome do contato para buscar: (para sair digite 'n'): ");
            String nomeContato = scanner.nextLine();
            for (Contatos contato : lista) {
                if (contato.getNome().equalsIgnoreCase(nomeContato)) {
                    System.out.println("Contato encontrado: " + contato);
                    break;
                }
            }
        if (!opcao.equalsIgnoreCase("n")) {
            break;
            }
        }
    }
}
