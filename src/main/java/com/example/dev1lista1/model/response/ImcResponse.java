package com.example.dev1lista1.model.response;

public class ImcResponse {

    private Double peso;
    private Double altura;
    private Double imc;
    private String classificacao;

    public ImcResponse() {
    }

    public ImcResponse(Double peso, Double altura, Double imc, String classificacao) {
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.classificacao = classificacao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
