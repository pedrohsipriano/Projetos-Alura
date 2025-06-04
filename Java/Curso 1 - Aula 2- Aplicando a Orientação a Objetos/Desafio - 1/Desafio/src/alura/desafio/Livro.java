package alura.desafio;

public class Livro {
    private String Titulo;
    private String Autor;

    public void Detalhes(){
        System.out.println("Título: " + this.Titulo);
        System.out.println("Autor: " + this.Autor);
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }
}


