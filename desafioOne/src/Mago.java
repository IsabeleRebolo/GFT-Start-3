import java.util.List;
import java.util.Random;

public class Mago extends Personagem {


    private List<String> magia;

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

    public void lvUp(){


    }

    public void aprenderMagia(String novaMagia){

    }

    @Override
    public void levelUp() {
        setMana( getMana() +2);
        setInteligencia( getInteligencia() +2);
        setVida( getVida() +1);
        setForca( getForca()+1);
    }

    public void attack() {

        Random gerador = new Random();

        System.out.println((getInteligencia()/2 * getLevel()^2) + gerador.nextInt(181));

    }

}

