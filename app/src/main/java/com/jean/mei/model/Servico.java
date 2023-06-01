package com.jean.mei.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Servico {

    private Integer id;
    private String nome;
    private double preco;
    private Venda venda;
    private int quantidade;

    public Servico(){

    }

    public Servico(Integer id, String nome, double preco, Venda venda,int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.venda = venda;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", venda=" + venda +
                ", quantidade=" + quantidade +
                '}';
    }
}
