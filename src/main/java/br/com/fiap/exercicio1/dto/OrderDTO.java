package br.com.fiap.exercicio1.dto;

import java.math.BigDecimal;

public class OrderDTO {

    private String email;
    private String nomeCompleto;
    private String shippingAdress;
    private int idPedido;
    private String dsItemPedido;
    private String qtdItemPedido;
    private BigDecimal vlPrecoItem;
    private BigDecimal vlPrecoTotal;
    private String formaPagto;
    private String dtPedido;
    private String statusPedido;

    private String idTransacao;
    private String nroCartao;
    private String validadeCartao;
    private String bandeira;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getShippingAdress() {
        return shippingAdress;
    }

    public void setShippingAdress(String shippingAdress) {
        this.shippingAdress = shippingAdress;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDsItemPedido() {
        return dsItemPedido;
    }

    public void setDsItemPedido(String dsItemPedido) {
        this.dsItemPedido = dsItemPedido;
    }

    public String getQtdItemPedido() {
        return qtdItemPedido;
    }

    public void setQtdItemPedido(String qtdItemPedido) {
        this.qtdItemPedido = qtdItemPedido;
    }

    public BigDecimal getVlPrecoItem() {
        return vlPrecoItem;
    }

    public void setVlPrecoItem(BigDecimal vlPrecoItem) {
        this.vlPrecoItem = vlPrecoItem;
    }

    public BigDecimal getVlPrecoTotal() {
        return vlPrecoTotal;
    }

    public void setVlPrecoTotal(BigDecimal vlPrecoTotal) {
        this.vlPrecoTotal = vlPrecoTotal;
    }

    public String getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }

    public String getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(String dtPedido) {
        this.dtPedido = dtPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(String idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getNroCartao() {
        return nroCartao;
    }

    public void setNroCartao(String nroCartao) {
        this.nroCartao = nroCartao;
    }

    public String getValidadeCartao() {
        return validadeCartao;
    }

    public void setValidadeCartao(String validadeCartao) {
        this.validadeCartao = validadeCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
