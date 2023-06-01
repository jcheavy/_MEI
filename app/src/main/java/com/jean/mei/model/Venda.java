package com.jean.mei.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Venda {

    private Integer id;
    private Date dataVenda;
    private Cliente cliente;
    private Pagamento pagamento;
    private int quantidade;
    private List<Produto> produtos = new ArrayList<>();
    private List<Servico> servicos = new ArrayList<>();

    public Venda(){}
    public Venda(Integer id, Date dataVenda, Cliente cliente, Pagamento pagamento, int quantidade) {
        this.id = id;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.quantidade = quantidade;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venda)) return false;
        Venda venda = (Venda) o;
        return id.equals(venda.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", dataVenda=" + dataVenda +
                ", cliente=" + cliente +
                ", pagamento=" + pagamento +
                ", quantidade=" + quantidade +
                ", produtos=" + produtos +
                ", servicos=" + servicos +
                '}';
    }
}
