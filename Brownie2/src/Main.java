import br.com.lojinha.brownie.BrownieCafe;
import br.com.lojinha.brownie.BrownieDoceDeLeite;
import br.com.lojinha.brownie.BrownieNutella;
import br.com.lojinha.comprador.Comprador;

public class Main {
    public static void main(String[] args) {

        BrownieCafe bc = new BrownieCafe("Brownie de Café",10,"café");
        BrownieNutella bn = new BrownieNutella("Brownie de Nutella",10,"nutella");
        BrownieDoceDeLeite bd = new BrownieDoceDeLeite("Brownie de Doce de Leite",10,"doce de leite");

    Comprador comprador = new Comprador();

    comprador.efetuarCompra(bc);
    comprador.efetuarCompra(bn);
    comprador.efetuarCompra(bd);

    }
}