public class Main {

    public static void main(String[] args) {

        Livro livroFavorito = new Livro("O pequeno principe", 100,100);


        Leitor leitor = new Leitor();
        leitor.setNome("Isabele");
        leitor.setLivroFavorito(livroFavorito);

    }
}
