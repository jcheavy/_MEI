package com.jean.mei.model;

import com.jean.mei.model.enums.EstadoPagamento;
import com.jean.mei.model.enums.TipoPagamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Pagamento {

    private Integer id;
    private Date dataPagamento;
    private Date dataVencimento;
    private int quantidadeParcelas;
    private double valorTotal;
    private EstadoPagamento estadoPagamento;
    private TipoPagamento tipoPagamento;

    private List<Parcela> parcelas = new ArrayList<>();

    public Pagamento(){}

    public Pagamento(Integer id, Date dataPagamento, Date dataVencimento, int quantidadeParcelas, double valorTotal, EstadoPagamento estadoPagamento, TipoPagamento tipoPagamento) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
        this.quantidadeParcelas = quantidadeParcelas;
        this.valorTotal = valorTotal;
        this.estadoPagamento = estadoPagamento;
        this.tipoPagamento = tipoPagamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public EstadoPagamento getEstadoPagamento() {
        return estadoPagamento;
    }

    public void setEstadoPagamento(EstadoPagamento estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public double CalculaValorParcelas(){
       return valorTotal / quantidadeParcelas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pagamento)) return false;
        Pagamento pagamento = (Pagamento) o;
        return id.equals(pagamento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", dataPagamento=" + dataPagamento +
                ", dataVencimento=" + dataVencimento +
                ", quantidadeParcelas=" + quantidadeParcelas +
                ", valorTotal=" + valorTotal +
                ", estadoPagamento=" + estadoPagamento +
                ", tipoPagamento=" + tipoPagamento +
                ", parcelas=" + parcelas +
                '}';
    }
}
