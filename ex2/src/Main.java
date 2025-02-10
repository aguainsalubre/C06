import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);

        System.out.println("Insira o valor do lanche 1:");
        int lanche1 = valorTeclado.nextInt();
        System.out.println("Insira o valor do lanche 2:");
        int lanche2 = valorTeclado.nextInt();
        System.out.println("Insira o valor do lanche 3:");
        int lanche3 = valorTeclado.nextInt();

        int total = lanche1+lanche2+lanche3;
        int media = total/3;

        System.out.println("total de lanches: "+total);
        System.out.println("média de lanches: "+media);

        valorTeclado.close();
    }
}