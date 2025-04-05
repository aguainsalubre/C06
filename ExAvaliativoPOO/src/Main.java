import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar o cliente
        Cliente cliente = new Cliente();
        cliente.nome = "Sofia";
        cliente.cpf = 32059729510L;
        cliente.computadores = new Computador[100]; // aumentando capacidade para 100 computadores
        cliente.numComputadores = 0;

        System.out.println("Seja bem-vindo à PC Mania!");
        System.out.println("Promoções disponíveis:");
        System.out.println("1 - Promoção 1 (Apple)");
        System.out.println("2 - Promoção 2 (Samsung)");
        System.out.println("3 - Promoção 3 (Dell)");
        System.out.println("0 - Finalizar compra");

        int opcao;
        do {
            System.out.print("Digite o código da promoção desejada (0 para finalizar): ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Quantos computadores desta promoção deseja comprar? ");
                int quantidade = scanner.nextInt();

                if (quantidade > 0) {
                    for (int i = 0; i < quantidade; i++) {
                        Computador computador = new Computador();
                        computador.hardware = new HardwareBasico[3]; // processador, RAM, HD

                        // Configurar hardware básico
                        HardwareBasico processador = new HardwareBasico();
                        HardwareBasico ram = new HardwareBasico();
                        HardwareBasico hd = new HardwareBasico();

                        // Configurar sistema operacional
                        computador.sistema = new SistemaOperacional();

                        // Configurar memória USB
                        MemoriaUSB memoUSB = new MemoriaUSB();

                        if (opcao == 1) {
                            computador.marca = "Apple";
                            computador.preco = 1234 + 468;

                            processador.nome = "Pentium Core i3";
                            processador.capacidade = 2200;

                            ram.nome = "Memória RAM";
                            ram.capacidade = 8;

                            hd.nome = "HD";
                            hd.capacidade = 500;

                            computador.sistema.nome = "Linux Ubuntu";
                            computador.sistema.tipo = 32;

                            memoUSB.nome = "Pen-drive";
                            memoUSB.capacidade = 16;
                        } else if (opcao == 2) {
                            computador.marca = "Samsung";
                            computador.preco = 468 + 1234;

                            processador.nome = "Pentium Core i5";
                            processador.capacidade = 3370;

                            ram.nome = "Memória RAM";
                            ram.capacidade = 16;

                            hd.nome = "HD";
                            hd.capacidade = 1000;

                            computador.sistema.nome = "Windows 8";
                            computador.sistema.tipo = 64;

                            memoUSB.nome = "Pen-drive";
                            memoUSB.capacidade = 32;
                        } else if (opcao == 3) {
                            computador.marca = "Dell";
                            computador.preco = 1234 + 468;

                            processador.nome = "Pentium Core i7";
                            processador.capacidade = 4500;

                            ram.nome = "Memória RAM";
                            ram.capacidade = 32;

                            hd.nome = "HD";
                            hd.capacidade = 2000;

                            computador.sistema.nome = "Windows 10";
                            computador.sistema.tipo = 64;

                            memoUSB.nome = "HD Externo";
                            memoUSB.capacidade = 1000;
                        }

                        // Adicionar hardware ao computador
                        computador.hardware[0] = processador;
                        computador.hardware[1] = ram;
                        computador.hardware[2] = hd;

                        // Adicionar memória USB
                        computador.addMemoriaUSB(memoUSB);

                        // Adicionar computador ao cliente
                        cliente.computadores[cliente.numComputadores] = computador;
                        cliente.numComputadores++;
                    }

                    System.out.println(quantidade + " computador(es) adicionado(s) ao carrinho!");
                } else if (opcao != 0) {
                    System.out.println("Opção inválida!");
                }
            }
        }
        while (opcao != 0) ;

        // Mostrar informações da compra
        System.out.println("\nResumo da compra:");
        cliente.mostraInfo();
    }
}