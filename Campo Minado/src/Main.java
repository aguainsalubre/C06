import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean[][] matrizBomba;
        matrizBomba = new boolean[2][2];

        Random rand = new Random();
        int posicaoBombaX = rand.nextInt(2);
        int posicaoBombaY = rand.nextInt(2);

        matrizBomba[posicaoBombaX][posicaoBombaY] = true;

        int posicaoJogadorX, posicaoJogadorY;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao Campo Minado!");

        for (int i = 0; i < matrizBomba.length*2; i++){
            System.out.println("Insira sua posição em X:");
            posicaoJogadorX = entrada.nextInt();
            System.out.println("Insira sua posição em Y:");
            posicaoJogadorY = entrada.nextInt();

            if (matrizBomba[posicaoJogadorX][posicaoJogadorY])
                System.out.println("KABUM!");

            else {
                System.out.println("Prossiga com segurança");
                System.out.println();
            }
        }

    }
}