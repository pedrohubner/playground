package com.semanaquatro.facade;

public class Product extends Menu {

    private String produto;
    private double preco;

    public Product(String produto, double preco){
        this.produto = produto;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String listaProdutos() {
        return "===Lista Produtos==="
                + "\nProduto: " + produto
                + "\nPreço: " + preco;
    }
}