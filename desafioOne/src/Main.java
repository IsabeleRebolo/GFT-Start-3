public class Main {
    public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro ("Luana", 1, 4, 4, 4 , 5 , 2);
        Mago mago = new Mago ("Lucas", 2, 1, 3, 5, 2, 1);

        guerreiro.attack();
        guerreiro.levelUp();

        mago.attack();
        mago.levelUp();

    }
}
