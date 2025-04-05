public class Cliente {
    String nome;
    long cpf;
    Computador[] computadores;
    int numComputadores;

   public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < numComputadores; i++) {
            total += computadores[i].preco;
        }
        return total;
    }

     public void mostraInfo() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Computadores comprados:");
        for (int i = 0; i < numComputadores; i++) {
            computadores[i].mostraPCConfigs();
        }
        System.out.println("Total: R$" + calculaTotalCompra());
    }
}