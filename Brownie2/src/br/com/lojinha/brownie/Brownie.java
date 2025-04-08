package br.com.lojinha.brownie;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionado no carrinho: "+nome);
    }

    public void calculaValorTotalCompra(){
        System.out.println("Valor total: "+nome+": " +preco);
    }

    public void mostraInfo(String nome, double preco, String sabor){
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(sabor);
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public String getSabor(){
        return sabor;
    }

}
