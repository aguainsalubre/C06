package br.com.lojinha.brownie;

public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de doce de leite sendo adicionado!");
    }
}
