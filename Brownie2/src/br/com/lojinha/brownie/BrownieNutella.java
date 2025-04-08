package br.com.lojinha.brownie;

public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de nutella sendo adicionado!");
    }
}
