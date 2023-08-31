package com.loja;

public class Produto {
    private int id;
    private String nome;
    private String descrisao;
    private double valorUnitario;

    public Produto(int id, String nome, String descrisao, double valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.descrisao = descrisao;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrisao() {
        return descrisao;
    }

    public void setDescrisao(String descrisao) {
        this.descrisao = descrisao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descrisao='" + descrisao + '\'' +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
