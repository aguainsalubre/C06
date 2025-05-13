import java.util.HashSet;

public class Conta {
    private double saldo;
    private double limite;
    private HashSet<Cliente> clientes;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
        this.clientes = new HashSet<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostraInfo() {
        System.out.println("Informações da conta:");
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("\nClientes:");

        for (Cliente cliente : clientes) {
            try {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("------------------");
            } catch (NullPointerException e) {
                System.out.println("Cliente nulo encontrado!");
                System.out.println("------------------");
            }
        }
    }
}