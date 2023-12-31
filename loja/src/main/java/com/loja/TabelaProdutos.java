package com.loja;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta Azul",
                "Caneta BIC da Cor Azul", 1.99);
        Produto borracha = new Produto(2, "Borracha Branca",
                "Borracha Branca", 3.99);
        Produto lapis = new Produto(3, "Lapis BIC",
                "Lapis BIC de Escrever", 2.99);
        Produto apontador = new Produto(4, "Apontador",
                "Apontador com Reservatorio", 7.99);
        Produto caderno = new Produto(5, "Caderno Espiral",
                "Caderno espiral de 96 folhas", 15.99);

         this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);

    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public List<Produto> buscarTodosOsProdutos() {
        return this.getProdutos();
    }
}
