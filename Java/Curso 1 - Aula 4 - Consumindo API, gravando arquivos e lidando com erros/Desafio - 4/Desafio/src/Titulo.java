public class Titulo {
    private String titulo;
    private String diretor;
    private int duracao;
    private String genero;
    
    public Titulo(String titulo, String diretor, int duracao, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.genero = genero;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
