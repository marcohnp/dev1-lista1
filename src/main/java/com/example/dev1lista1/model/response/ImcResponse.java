package com.example.dev1lista1.model.response;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImcResponse)) return false;
        ImcResponse that = (ImcResponse) o;
        return Objects.equals(peso, that.peso) && Objects.equals(altura, that.altura)
                && Objects.equals(imc, that.imc) && Objects.equals(classificacao, that.classificacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peso, altura, imc, classificacao);
    }
}
