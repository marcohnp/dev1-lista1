package com.example.dev1lista1.model;

import java.util.Objects;

public class ImcModel {

    private Double peso;
    private Double altura;
    private Double imc;
    private String classificacao;

    public ImcModel() {
    }

    public ImcModel(Double peso, Double altura, Double imc, String classificacao) {
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
        if (!(o instanceof ImcModel)) return false;
        ImcModel imcModel = (ImcModel) o;
        return Objects.equals(peso, imcModel.peso) && Objects.equals(altura, imcModel.altura) &&
                Objects.equals(imc, imcModel.imc) && Objects.equals(classificacao, imcModel.classificacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peso, altura, imc, classificacao);
    }
}
