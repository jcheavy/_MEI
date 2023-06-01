package com.jean.mei.model;

import java.util.Date;
import java.util.Objects;

public class Parcela {

    private Integer id;
    private int numeroParcela;
    private Date dataVencimento;
    private Date dataPagameto;
    private double valor;
    private Pagamento pagamento;

    public Parcela() {
    }

    public Parcela(Integer id, int numeroParcela, Date dataVencimento, Date dataPagameto, double valor, Pagamento pagamento) {
        this.id = id;
        this.numeroParcela = numeroParcela;
        this.dataVencimento = dataVencimento;
        this.dataPagameto = dataPagameto;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagameto() {
        return dataPagameto;
    }

    public void setDataPagameto(Date dataPagameto) {
        this.dataPagameto = dataPagameto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parcela)) return false;
        Parcela parcela = (Parcela) o;
        return id.equals(parcela.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Parcela{" +
                "id=" + id +
                ", numeroParcela=" + numeroParcela +
                ", dataVencimento=" + dataVencimento +
                ", dataPagameto=" + dataPagameto +
                ", valor=" + valor +
                ", pagamento=" + pagamento +
                '}';
    }
}

