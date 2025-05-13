//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(1000.0, 500.0);

        conta.adicionarCliente(new Cliente("Sofia Groke", "123.456.789-00"));
        conta.adicionarCliente(new Cliente("Chris", "987.654.321-00"));
        conta.adicionarCliente(null); // Cliente nulo

        conta.mostraInfo();

        System.out.println("\nPrograma executado com sucesso até o final!");


    }
}