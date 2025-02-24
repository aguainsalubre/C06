public class Kart {

    String nome;
    Piloto piloto;
    Motor motor;

    public Kart() {

        motor = new Motor();

    }

    public void pular(){
        System.out.println(nome+ " está  pulando!");
    }

    public void soltarTurbo(){
        System.out.println(nome+" está soltando seu turbo!");
    }

    public void fazerDrift(){
        System.out.println(nome+ " está fazendo drift!");
    }

}
