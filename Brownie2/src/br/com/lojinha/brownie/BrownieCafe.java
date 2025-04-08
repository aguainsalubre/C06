package br.com.lojinha.brownie;

public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de café sendo adicionado!");
    }
}
