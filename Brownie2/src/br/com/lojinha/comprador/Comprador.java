package br.com.lojinha.comprador;

import br.com.lojinha.brownie.Brownie;

public class Comprador {
    String nome;
    double saldo;

 public void Comprador(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
     brownie.addCarrinhoDeCompras();
     brownie.calculaValorTotalCompra();
        System.out.println("O comprador comprou o brownie: "+brownie.getNome());
    }

}
