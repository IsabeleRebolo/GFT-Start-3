import java.util.List;
import java.util.Random;


import static java.lang.Math.floor;

public class Guerreiro extends Personagem {

    Random gerador = new Random();

    private List<String> habilidade;

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

    public void lvUp(){


    }

    public void aprenderHabilidade(String novaHabilidade){

    }

    @Override
    public void levelUp() {
        setMana(getMana()+1);
        setInteligencia(getInteligencia() +1);
        setVida(getVida() +2);
        setForca(getForca() +2);
    }

    public void attack(){

        System.out.println((getForca()/2 * getLevel()^2) + gerador.nextInt(181));

    }
}
