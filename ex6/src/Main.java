public class Main {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();
        Piloto piloto3 = new Piloto();

        piloto1.nome = "Waluigi";
        piloto2.nome = "Pink Gold Peach";
        piloto3.nome = "Inkling Girl";

        piloto1.vilao = true;
        piloto2.vilao = false;
        piloto3.vilao = false;

        Kart k1 = new Kart();
        Kart k2 = new Kart();
        Kart k3 = new Kart();

        k1.piloto = piloto1;
        k2.piloto = piloto2;
        k3.piloto = piloto3;

        k1.motor.cc = "150";
        k2.motor.cc = "150";
        k3.motor.cc = "150";

        k1.motor.velocidadeMax = 9;
        k2.motor.velocidadeMax = 4.5;
        k3.motor.velocidadeMax = 5;

        k1.nome = "Biddybuggy";
        k2.nome = "Inkstriker";
        k3.nome = "Mr. Scooty";

        piloto1.soltaSuperPoder();

        k1.soltarTurbo();
        k2.pular();
        k3.fazerDrift();

        k1.motor.mostrarInfo();
        k2.motor.mostrarInfo();
        k3.motor.mostrarInfo();
    }
}