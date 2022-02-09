import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);
        int digitado;
        int randon;

        do{
            System.out.println("Digite um numero");
            digitado = ler.nextInt();

            randon = gerador.nextInt(11);


        }while(randon != digitado);


    }
}
