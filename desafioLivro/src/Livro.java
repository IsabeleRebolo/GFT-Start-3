public class Livro {

    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    public Livro(String titulo, int qtdPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public Double verificarProgresso(){
        return 0.0;
    }

    public int adicionarPaginasLidas(){
        return 0;
    }
}
