public class Computador {
    String marca;
    float preco;
    HardwareBasico[] hardware;
    SistemaOperacional sistema;
    MemoriaUSB memoria;

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Hardware Básico:");
        for (HardwareBasico hw : hardware) {
            System.out.println("  " + hw.nome + " (" + hw.capacidade + ")");
        }
        System.out.println("Sistema Operacional: " + sistema.nome + " (" + sistema.tipo + " bits)");
        if (memoria != null) {
            System.out.println("Acompanha: " + memoria.nome + " de " + memoria.capacidade + "Gb");
        }
        System.out.println();
    }

    public void addMemoriaUSB(MemoriaUSB memoUSB) {
        memoria = memoUSB;
    }
}